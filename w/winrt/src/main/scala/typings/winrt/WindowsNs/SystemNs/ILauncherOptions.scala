package typings.winrt.WindowsNs.SystemNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncherOptions extends js.Object {
  var contentType: String
  var desiredRemainingView: ViewSizePreference
  var displayApplicationPicker: Boolean
  var fallbackUri: Uri
  var preferredApplicationDisplayName: String
  var preferredApplicationPackageFamilyName: String
  var treatAsUntrusted: Boolean
  var uI: LauncherUIOptions
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
    val __obj = js.Dynamic.literal(contentType = contentType, desiredRemainingView = desiredRemainingView, displayApplicationPicker = displayApplicationPicker, fallbackUri = fallbackUri, preferredApplicationDisplayName = preferredApplicationDisplayName, preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName, treatAsUntrusted = treatAsUntrusted, uI = uI)
  
    __obj.asInstanceOf[ILauncherOptions]
  }
}

