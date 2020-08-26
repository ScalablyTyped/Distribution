package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessibilitySettings extends js.Object {
  var highContrast: Boolean = js.native
  var highContrastScheme: String = js.native
  var onhighcontrastchanged: js.Any = js.native
}

object IAccessibilitySettings {
  @scala.inline
  def apply(highContrast: Boolean, highContrastScheme: String, onhighcontrastchanged: js.Any): IAccessibilitySettings = {
    val __obj = js.Dynamic.literal(highContrast = highContrast.asInstanceOf[js.Any], highContrastScheme = highContrastScheme.asInstanceOf[js.Any], onhighcontrastchanged = onhighcontrastchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessibilitySettings]
  }
  @scala.inline
  implicit class IAccessibilitySettingsOps[Self <: IAccessibilitySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighContrast(value: Boolean): Self = this.set("highContrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighContrastScheme(value: String): Self = this.set("highContrastScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnhighcontrastchanged(value: js.Any): Self = this.set("onhighcontrastchanged", value.asInstanceOf[js.Any])
  }
  
}

