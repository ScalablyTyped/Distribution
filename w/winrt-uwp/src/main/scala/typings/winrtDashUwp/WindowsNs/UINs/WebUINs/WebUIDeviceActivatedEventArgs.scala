package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for a device that invokes AutoPlay. */
@JSGlobal("Windows.UI.WebUI.WebUIDeviceActivatedEventArgs")
@js.native
abstract class WebUIDeviceActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the device identifier for the device that invoked AutoPlay. */
  var deviceInformationId: String = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action associated with the activated device. */
  var verb: String = js.native
}

