package typings.wegameApi

import typings.wegameApi.anon.AdStylerealWidthnumberrea
import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * banner 广告组件。banner 广告组件是一个原生组件，层级比普通组件高。banner 广告组件默认是隐藏的，需要调用 BannerAd.show() 将其显示。banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 BannerAd.onResize() 事件中提供。
  */
trait BannerAd
  extends StObject
     with ResizableAdObject {
  
  /**
    * 广告自动刷新的间隔时间，单位为秒，参数值必须大于等于30（该参数不传入时 Banner 广告不会自动刷新）
    */
  var adIntervals: js.UndefOr[Double] = js.undefined
  
  /**
    * banner 广告组件的样式。style 上的属性的值仅为开发者设置的值，banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 BannerAd.onResize() 事件获得。
    */
  var style: AdStylerealWidthnumberrea
}
object BannerAd {
  
  inline def apply(
    adUnitId: String,
    destroy: () => Unit,
    hide: () => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    offResize: js.Function1[/* res */ Width, Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    onResize: js.Function1[/* res */ Width, Unit] => Unit,
    show: () => js.Promise[Unit],
    style: AdStylerealWidthnumberrea
  ): BannerAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), offResize = js.Any.fromFunction1(offResize), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), onResize = js.Any.fromFunction1(onResize), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerAd]
  }
  
  extension [Self <: BannerAd](x: Self) {
    
    inline def setAdIntervals(value: Double): Self = StObject.set(x, "adIntervals", value.asInstanceOf[js.Any])
    
    inline def setAdIntervalsUndefined: Self = StObject.set(x, "adIntervals", js.undefined)
    
    inline def setStyle(value: AdStylerealWidthnumberrea): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
