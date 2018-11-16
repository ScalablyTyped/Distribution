package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched as the result of a wallet action. */
@JSGlobal("Windows.UI.WebUI.WebUIWalletActionActivatedEventArgs")
@js.native
abstract class WebUIWalletActionActivatedEventArgs () extends js.Object {
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  var actionId: java.lang.String = js.native
  /** Gets the action that was performed on the WalletItem. */
  var actionKind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind = js.native
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the ID of the WalletItem on which the user performed the action. */
  var itemId: java.lang.String = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

