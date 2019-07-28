package typings.winrt.WindowsNs.UINs.WebUINs

import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.IShareTargetActivatedEventArgs
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs.ShareOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIShareTargetActivatedEventArgs")
@js.native
class WebUIShareTargetActivatedEventArgs ()
  extends IShareTargetActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var shareOperation: ShareOperation = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

