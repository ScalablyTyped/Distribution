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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("desiredRemainingView")(desiredRemainingView)
    __obj.updateDynamic("displayApplicationPicker")(displayApplicationPicker)
    __obj.updateDynamic("fallbackUri")(fallbackUri)
    __obj.updateDynamic("preferredApplicationDisplayName")(preferredApplicationDisplayName)
    __obj.updateDynamic("preferredApplicationPackageFamilyName")(preferredApplicationPackageFamilyName)
    __obj.updateDynamic("treatAsUntrusted")(treatAsUntrusted)
    __obj.updateDynamic("uI")(uI)
    __obj.asInstanceOf[ILauncherOptions]
  }
}

