package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Activated event when it occurs after a picker returns. */
@JSGlobal("Windows.ApplicationModel.Activation.PickerReturnedActivatedEventArgs")
@js.native
abstract class PickerReturnedActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.PickerReturnedActivatedEventArgs {
  /** Gets the reason that this app is being activated. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets an identifier indicating the picker operation that was performed prior to the activation. */
  /* CompleteClass */
  override var pickerOperationId: String = js.native
  /** Gets the execution state of the app before this activation. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

