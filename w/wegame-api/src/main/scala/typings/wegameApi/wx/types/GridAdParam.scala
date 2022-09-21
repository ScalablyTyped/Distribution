package typings.wegameApi.wx.types

import typings.wegameApi.wegameApiNumbers.`5`
import typings.wegameApi.wegameApiNumbers.`8`
import typings.wegameApi.wegameApiStrings.black
import typings.wegameApi.wegameApiStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAdParam extends StObject {
  
  /**
    * 广告自动刷新的间隔时间，单位为秒，参数值必须大于等于30（该参数不传入时 grid(格子) 广告不会自动刷新）
    */
  var adIntervals: js.UndefOr[Double] = js.undefined
  
  /**
    * grid(格子) 广告广告组件的主题，提供 white black 两种主题选择。
    */
  var adTheme: white | black
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
  
  /**
    * grid(格子) 广告组件的格子个数，可设置为5，8两种格子个数样式，默认值为5
    */
  var gridCount: js.UndefOr[`5` | `8`] = js.undefined
  
  /**
    * grid(格子) 广告组件的样式
    */
  var style: AdStyle
}
object GridAdParam {
  
  inline def apply(adTheme: white | black, adUnitId: String, style: AdStyle): GridAdParam = {
    val __obj = js.Dynamic.literal(adTheme = adTheme.asInstanceOf[js.Any], adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAdParam]
  }
  
  extension [Self <: GridAdParam](x: Self) {
    
    inline def setAdIntervals(value: Double): Self = StObject.set(x, "adIntervals", value.asInstanceOf[js.Any])
    
    inline def setAdIntervalsUndefined: Self = StObject.set(x, "adIntervals", js.undefined)
    
    inline def setAdTheme(value: white | black): Self = StObject.set(x, "adTheme", value.asInstanceOf[js.Any])
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setGridCount(value: `5` | `8`): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
    
    inline def setGridCountUndefined: Self = StObject.set(x, "gridCount", js.undefined)
    
    inline def setStyle(value: AdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
