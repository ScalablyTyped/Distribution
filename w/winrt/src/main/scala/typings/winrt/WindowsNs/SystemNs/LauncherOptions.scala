package typings.winrt.WindowsNs.SystemNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.LauncherOptions")
@js.native
class LauncherOptions () extends ILauncherOptions {
  /* CompleteClass */
  override var contentType: String = js.native
  /* CompleteClass */
  override var desiredRemainingView: ViewSizePreference = js.native
  /* CompleteClass */
  override var displayApplicationPicker: Boolean = js.native
  /* CompleteClass */
  override var fallbackUri: Uri = js.native
  /* CompleteClass */
  override var preferredApplicationDisplayName: String = js.native
  /* CompleteClass */
  override var preferredApplicationPackageFamilyName: String = js.native
  /* CompleteClass */
  override var treatAsUntrusted: Boolean = js.native
  /* CompleteClass */
  override var uI: LauncherUIOptions = js.native
}

