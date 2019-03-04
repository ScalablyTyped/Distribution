package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessibilitySettings extends js.Object {
  var highContrast: scala.Boolean
  var highContrastScheme: java.lang.String
  var onhighcontrastchanged: js.Any
}

object IAccessibilitySettings {
  @scala.inline
  def apply(highContrast: scala.Boolean, highContrastScheme: java.lang.String, onhighcontrastchanged: js.Any): IAccessibilitySettings = {
    val __obj = js.Dynamic.literal(highContrast = highContrast, highContrastScheme = highContrastScheme, onhighcontrastchanged = onhighcontrastchanged)
  
    __obj.asInstanceOf[IAccessibilitySettings]
  }
}

