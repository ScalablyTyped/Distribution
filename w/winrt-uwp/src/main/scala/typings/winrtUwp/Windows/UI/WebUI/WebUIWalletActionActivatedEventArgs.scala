package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched as the result of a wallet action. */
trait WebUIWalletActionActivatedEventArgs extends js.Object {
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  var actionId: String
  /** Gets the action that was performed on the WalletItem. */
  var actionKind: WalletActionKind
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation
  /** Gets the ID of the WalletItem on which the user performed the action. */
  var itemId: String
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}

object WebUIWalletActionActivatedEventArgs {
  @scala.inline
  def apply(
    actionId: String,
    actionKind: WalletActionKind,
    activatedOperation: ActivatedOperation,
    itemId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIWalletActionActivatedEventArgs = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], actionKind = actionKind.asInstanceOf[js.Any], activatedOperation = activatedOperation.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIWalletActionActivatedEventArgs]
  }
}

