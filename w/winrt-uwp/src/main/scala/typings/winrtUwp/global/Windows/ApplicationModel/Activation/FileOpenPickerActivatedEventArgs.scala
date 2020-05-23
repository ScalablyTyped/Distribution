package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user tries to pick files or folders that are provided by the app. */
@JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
@js.native
abstract class FileOpenPickerActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs {
  /** The package family name of the app that launched your app. */
  /* CompleteClass */
  override var callerPackageFamilyName: String = js.native
  /** Gets the letterbox UI of the file picker that is displayed when the user wants to pick files or folders that are provided by the app. */
  /* CompleteClass */
  override var fileOpenPickerUI: FileOpenPickerUI = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

