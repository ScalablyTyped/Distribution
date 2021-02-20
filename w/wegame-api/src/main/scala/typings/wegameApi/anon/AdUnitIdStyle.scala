package typings.wegameApi.anon

import typings.wegameApi.wx.types.AdStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdUnitIdStyle extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String = js.native
  
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle = js.native
}
object AdUnitIdStyle {
  
  @scala.inline
  def apply(adUnitId: String, style: AdStyle): AdUnitIdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitIdStyle]
  }
  
  @scala.inline
  implicit class AdUnitIdStyleMutableBuilder[Self <: AdUnitIdStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: AdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
