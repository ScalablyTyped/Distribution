package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrtDashUwp.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires after the app was suspended for a file save picker operation. */
@JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerContinuationEventArgs")
@js.native
abstract class FileSavePickerContinuationEventArgs () extends js.Object {
  /** Gets a set of values populated by the app before a FileSavePicker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet = js.native
  /** Gets the file selected by the user during the file save picker operation. */
  var file: StorageFile = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

