package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIPrintTaskSettingsActivatedEventArgs")
@js.native
class WebUIPrintTaskSettingsActivatedEventArgs ()
  extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.IPrintTaskSettingsActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var configuration: winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.PrintTaskConfiguration = js.native
  /* CompleteClass */
  override var kind: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

