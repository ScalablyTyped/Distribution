package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  /**
    * 推荐单元 id
    */
  var adUnitId: String
  
  /**
    * 小游戏推荐banner组件样式
    */
  var style: Left
}
object Style {
  
  @scala.inline
  def apply(adUnitId: String, style: Left): Style = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Left): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
