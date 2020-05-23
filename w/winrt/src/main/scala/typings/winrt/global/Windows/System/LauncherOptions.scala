package typings.winrt.global.Windows.System

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.LauncherOptions")
@js.native
class LauncherOptions ()
  extends typings.winrt.Windows.System.LauncherOptions {
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
  override var uI: typings.winrt.Windows.System.LauncherUIOptions = js.native
}

