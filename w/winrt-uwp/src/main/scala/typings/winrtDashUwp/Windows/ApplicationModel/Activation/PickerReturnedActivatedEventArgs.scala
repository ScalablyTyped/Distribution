package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Activated event when it occurs after a picker returns. */
@JSGlobal("Windows.ApplicationModel.Activation.PickerReturnedActivatedEventArgs")
@js.native
abstract class PickerReturnedActivatedEventArgs () extends js.Object {
  /** Gets the reason that this app is being activated. */
  var kind: ActivationKind = js.native
  /** Gets an identifier indicating the picker operation that was performed prior to the activation. */
  var pickerOperationId: String = js.native
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

