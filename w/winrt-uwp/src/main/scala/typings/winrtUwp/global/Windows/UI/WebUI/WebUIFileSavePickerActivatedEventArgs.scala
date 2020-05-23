package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires when the user saves a file through the file picker and selects the app as the location. */
@JSGlobal("Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs")
@js.native
abstract class WebUIFileSavePickerActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  /* CompleteClass */
  override var callerPackageFamilyName: String = js.native
  /** Gets the ID of the enterprise that owns the file. */
  /* CompleteClass */
  override var enterpriseId: String = js.native
  /** Gets the letterbox UI of the file picker that is displayed when the user saves a file and selects the app as the save location. */
  /* CompleteClass */
  override var fileSavePickerUI: FileSavePickerUI = js.native
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

