package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it uses the Contact Picker. */
@JSGlobal("Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs")
@js.native
abstract class WebUIContactPickerActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the letterbox UI of the contact picker that is displayed when the user wants to pick contacts that are provided by the app. */
  var contactPickerUI: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

