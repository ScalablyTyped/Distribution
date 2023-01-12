package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerAdParams extends StObject {
  
  /**
    * 广告自动刷新的间隔时间，单位为秒，参数值必须大于等于30（该参数不传入时 Banner 广告不会自动刷新）
    */
  var adIntervals: js.UndefOr[Double] = js.undefined
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
  
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle
}
object BannerAdParams {
  
  inline def apply(adUnitId: String, style: AdStyle): BannerAdParams = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerAdParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BannerAdParams] (val x: Self) extends AnyVal {
    
    inline def setAdIntervals(value: Double): Self = StObject.set(x, "adIntervals", value.asInstanceOf[js.Any])
    
    inline def setAdIntervalsUndefined: Self = StObject.set(x, "adIntervals", js.undefined)
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: AdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
