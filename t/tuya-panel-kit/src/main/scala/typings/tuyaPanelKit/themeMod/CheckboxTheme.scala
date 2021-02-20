package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxTheme extends StObject {
  
  var activeColor: String = js.native
  
  var disabledColor: String = js.native
  
  var fontColor: String = js.native
  
  var size: Double = js.native
}
object CheckboxTheme {
  
  @scala.inline
  def apply(activeColor: String, disabledColor: String, fontColor: String, size: Double): CheckboxTheme = {
    val __obj = js.Dynamic.literal(activeColor = activeColor.asInstanceOf[js.Any], disabledColor = disabledColor.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxTheme]
  }
  
  @scala.inline
  implicit class CheckboxThemeMutableBuilder[Self <: CheckboxTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
