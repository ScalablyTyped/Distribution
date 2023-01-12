package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupNumberSelectorTheme extends StObject {
  
  var cellPlusColor: String
  
  var maximumTrackTintColor: String
}
object PopupNumberSelectorTheme {
  
  inline def apply(cellPlusColor: String, maximumTrackTintColor: String): PopupNumberSelectorTheme = {
    val __obj = js.Dynamic.literal(cellPlusColor = cellPlusColor.asInstanceOf[js.Any], maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupNumberSelectorTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupNumberSelectorTheme] (val x: Self) extends AnyVal {
    
    inline def setCellPlusColor(value: String): Self = StObject.set(x, "cellPlusColor", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
  }
}
