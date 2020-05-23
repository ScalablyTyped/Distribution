package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user tries to pick files or folders that are provided by the app. */
@JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs")
@js.native
abstract class WebUIFileOpenPickerActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  /* CompleteClass */
  override var callerPackageFamilyName: String = js.native
  /** Gets the letterbox UI of the file picker that is displayed when the user wants to pick files or folders that are provided by the app. */
  /* CompleteClass */
  override var fileOpenPickerUI: FileOpenPickerUI = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

