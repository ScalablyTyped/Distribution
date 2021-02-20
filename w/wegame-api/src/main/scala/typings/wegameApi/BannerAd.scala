package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.Width
import typings.wegameApi.wx.types.AdStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * banner 广告组件。banner 广告组件是一个原生组件，层级比上屏 Canvas 高，会覆盖在上屏 Canvas 上。banner 广告组件默认是隐藏的，需要调用 BannerAd.show() 将其显示。banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 BannerAd.onResize() 事件中提供。
  */
@js.native
trait BannerAd extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String = js.native
  
  /**
    * 销毁 banner 广告
    */
  def destroy(): Unit = js.native
  
  /**
    * 隐藏 banner 广告
    */
  def hide(): Unit = js.native
  
  /**
    * 取消监听banner 广告错误事件
    */
  def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  
  /**
    * 取消监听banner 广告加载事件
    */
  def offLoad(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听隐藏 banner 广告缩放
    */
  def offResize(callback: js.Function1[/* res */ Width, Unit]): Unit = js.native
  
  /**
    * 监听banner 广告错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  
  /**
    * 监听banner 广告加载事件
    */
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听 banner 广告缩放
    */
  def onResize(callback: js.Function1[/* res */ Width, Unit]): Unit = js.native
  
  /**
    * 显示 banner 广告。
    */
  def show(): js.Promise[Unit] = js.native
  
  /**
    * banner 广告组件的样式。style 上的属性的值仅为开发者设置的值，banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 BannerAd.onResize() 事件获得。
    */
  var style: AdStyle = js.native
}
object BannerAd {
  
  @scala.inline
  def apply(
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
    style: AdStyle
  ): BannerAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), offResize = js.Any.fromFunction1(offResize), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), onResize = js.Any.fromFunction1(onResize), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerAd]
  }
  
  @scala.inline
  implicit class BannerAdMutableBuilder[Self <: BannerAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffError(value: js.Function1[/* res */ ErrMsg, Unit] => Unit): Self = StObject.set(x, "offError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "offLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffResize(value: js.Function1[/* res */ Width, Unit] => Unit): Self = StObject.set(x, "offResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: js.Function1[/* res */ ErrMsg, Unit] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResize(value: js.Function1[/* res */ Width, Unit] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => js.Promise[Unit]): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: AdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
