package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncherOptions extends js.Object {
  var contentType: java.lang.String
  var desiredRemainingView: winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  var displayApplicationPicker: scala.Boolean
  var fallbackUri: winrtLib.WindowsNs.FoundationNs.Uri
  var preferredApplicationDisplayName: java.lang.String
  var preferredApplicationPackageFamilyName: java.lang.String
  var treatAsUntrusted: scala.Boolean
  var uI: LauncherUIOptions
}

object ILauncherOptions {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    desiredRemainingView: winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference,
    displayApplicationPicker: scala.Boolean,
    fallbackUri: winrtLib.WindowsNs.FoundationNs.Uri,
    preferredApplicationDisplayName: java.lang.String,
    preferredApplicationPackageFamilyName: java.lang.String,
    treatAsUntrusted: scala.Boolean,
    uI: LauncherUIOptions
  ): ILauncherOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType, desiredRemainingView = desiredRemainingView, displayApplicationPicker = displayApplicationPicker, fallbackUri = fallbackUri, preferredApplicationDisplayName = preferredApplicationDisplayName, preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName, treatAsUntrusted = treatAsUntrusted, uI = uI)
  
    __obj.asInstanceOf[ILauncherOptions]
  }
}

