package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupListTheme extends StObject {
  
  var cellFontColor: String
}
object PopupListTheme {
  
  inline def apply(cellFontColor: String): PopupListTheme = {
    val __obj = js.Dynamic.literal(cellFontColor = cellFontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupListTheme]
  }
  
  extension [Self <: PopupListTheme](x: Self) {
    
    inline def setCellFontColor(value: String): Self = StObject.set(x, "cellFontColor", value.asInstanceOf[js.Any])
  }
}
