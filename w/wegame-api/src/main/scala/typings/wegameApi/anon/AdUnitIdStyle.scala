package typings.wegameApi.anon

import typings.wegameApi.wx.types.AdStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUnitIdStyle extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
  
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle
}
object AdUnitIdStyle {
  
  inline def apply(adUnitId: String, style: AdStyle): AdUnitIdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitIdStyle]
  }
  
  extension [Self <: AdUnitIdStyle](x: Self) {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: AdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
