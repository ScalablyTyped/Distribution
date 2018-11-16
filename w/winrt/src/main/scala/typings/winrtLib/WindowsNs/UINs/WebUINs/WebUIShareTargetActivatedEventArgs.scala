package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIShareTargetActivatedEventArgs")
@js.native
class WebUIShareTargetActivatedEventArgs ()
  extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.IShareTargetActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var kind: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /* CompleteClass */
  override var shareOperation: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs.ShareOperation = js.native
  /* CompleteClass */
  override var splashScreen: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

