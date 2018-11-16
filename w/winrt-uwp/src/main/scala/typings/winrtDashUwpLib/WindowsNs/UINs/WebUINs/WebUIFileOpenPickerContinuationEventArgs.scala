package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires after the app was suspended for a file open picker operation. */
@JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerContinuationEventArgs")
@js.native
abstract class WebUIFileOpenPickerContinuationEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets a set of values populated by the app before a FileOpenPicker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the files for which the app was activated. */
  var files: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

