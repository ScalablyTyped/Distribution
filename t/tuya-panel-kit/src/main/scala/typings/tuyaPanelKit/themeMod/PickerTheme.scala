package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerTheme extends StObject {
  
  var fontColor: String
  
  var fontSize: Double
  
  var unitFontColor: String
  
  var unitFontSize: Double
}
object PickerTheme {
  
  @scala.inline
  def apply(fontColor: String, fontSize: Double, unitFontColor: String, unitFontSize: Double): PickerTheme = {
    val __obj = js.Dynamic.literal(fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], unitFontColor = unitFontColor.asInstanceOf[js.Any], unitFontSize = unitFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerTheme]
  }
  
  @scala.inline
  implicit class PickerThemeMutableBuilder[Self <: PickerTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontColor(value: String): Self = StObject.set(x, "unitFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontSize(value: Double): Self = StObject.set(x, "unitFontSize", value.asInstanceOf[js.Any])
  }
}
