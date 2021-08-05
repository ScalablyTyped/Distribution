package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessibilitySettings extends StObject {
  
  var highContrast: Boolean
  
  var highContrastScheme: String
  
  var onhighcontrastchanged: js.Any
}
object IAccessibilitySettings {
  
  inline def apply(highContrast: Boolean, highContrastScheme: String, onhighcontrastchanged: js.Any): IAccessibilitySettings = {
    val __obj = js.Dynamic.literal(highContrast = highContrast.asInstanceOf[js.Any], highContrastScheme = highContrastScheme.asInstanceOf[js.Any], onhighcontrastchanged = onhighcontrastchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessibilitySettings]
  }
  
  extension [Self <: IAccessibilitySettings](x: Self) {
    
    inline def setHighContrast(value: Boolean): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
    
    inline def setHighContrastScheme(value: String): Self = StObject.set(x, "highContrastScheme", value.asInstanceOf[js.Any])
    
    inline def setOnhighcontrastchanged(value: js.Any): Self = StObject.set(x, "onhighcontrastchanged", value.asInstanceOf[js.Any])
  }
}
