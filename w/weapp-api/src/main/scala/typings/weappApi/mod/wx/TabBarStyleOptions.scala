package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarStyleOptions extends CommonCallbackOptions {
  
  //  tab 的背景色，HexColor
  var backgroundColor: String = js.native
  
  //  tabBar上边框的颜色， 仅支持 black/white
  var borderStyle: String = js.native
  
  //  tab 上的文字默认颜色，HexColor
  var color: String = js.native
  
  //  tab 上的文字选中时的颜色，HexColor
  var selectedColor: String = js.native
}
object TabBarStyleOptions {
  
  @scala.inline
  def apply(backgroundColor: String, borderStyle: String, color: String, selectedColor: String): TabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarStyleOptions]
  }
  
  @scala.inline
  implicit class TabBarStyleOptionsMutableBuilder[Self <: TabBarStyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
  }
}
