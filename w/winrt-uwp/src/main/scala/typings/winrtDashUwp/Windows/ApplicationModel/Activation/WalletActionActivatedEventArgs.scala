package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched as the result of a wallet action. */
@JSGlobal("Windows.ApplicationModel.Activation.WalletActionActivatedEventArgs")
@js.native
abstract class WalletActionActivatedEventArgs () extends js.Object {
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  var actionId: String = js.native
  /** Gets the action that was performed on the WalletItem . */
  var actionKind: WalletActionKind = js.native
  /** Gets the ID of the WalletItem on which the user performed the action. */
  var itemId: String = js.native
  /** Gets the type of action that was performed on the WalletItem . */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

