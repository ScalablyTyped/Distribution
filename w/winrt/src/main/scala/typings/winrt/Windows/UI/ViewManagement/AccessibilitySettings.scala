package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilitySettings
  extends StObject
     with IAccessibilitySettings
object AccessibilitySettings {
  
  inline def apply(highContrast: Boolean, highContrastScheme: String, onhighcontrastchanged: js.Any): AccessibilitySettings = {
    val __obj = js.Dynamic.literal(highContrast = highContrast.asInstanceOf[js.Any], highContrastScheme = highContrastScheme.asInstanceOf[js.Any], onhighcontrastchanged = onhighcontrastchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilitySettings]
  }
}
