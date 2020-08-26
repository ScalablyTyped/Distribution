package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILauncherOptions extends js.Object {
  var contentType: String = js.native
  var desiredRemainingView: ViewSizePreference = js.native
  var displayApplicationPicker: Boolean = js.native
  var fallbackUri: Uri = js.native
  var preferredApplicationDisplayName: String = js.native
  var preferredApplicationPackageFamilyName: String = js.native
  var treatAsUntrusted: Boolean = js.native
  var uI: LauncherUIOptions = js.native
}

object ILauncherOptions {
  @scala.inline
  def apply(
    contentType: String,
    desiredRemainingView: ViewSizePreference,
    displayApplicationPicker: Boolean,
    fallbackUri: Uri,
    preferredApplicationDisplayName: String,
    preferredApplicationPackageFamilyName: String,
    treatAsUntrusted: Boolean,
    uI: LauncherUIOptions
  ): ILauncherOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], displayApplicationPicker = displayApplicationPicker.asInstanceOf[js.Any], fallbackUri = fallbackUri.asInstanceOf[js.Any], preferredApplicationDisplayName = preferredApplicationDisplayName.asInstanceOf[js.Any], preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName.asInstanceOf[js.Any], treatAsUntrusted = treatAsUntrusted.asInstanceOf[js.Any], uI = uI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILauncherOptions]
  }
  @scala.inline
  implicit class ILauncherOptionsOps[Self <: ILauncherOptions] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredRemainingView(value: ViewSizePreference): Self = this.set("desiredRemainingView", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayApplicationPicker(value: Boolean): Self = this.set("displayApplicationPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallbackUri(value: Uri): Self = this.set("fallbackUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredApplicationDisplayName(value: String): Self = this.set("preferredApplicationDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredApplicationPackageFamilyName(value: String): Self = this.set("preferredApplicationPackageFamilyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreatAsUntrusted(value: Boolean): Self = this.set("treatAsUntrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUI(value: LauncherUIOptions): Self = this.set("uI", value.asInstanceOf[js.Any])
  }
  
}

