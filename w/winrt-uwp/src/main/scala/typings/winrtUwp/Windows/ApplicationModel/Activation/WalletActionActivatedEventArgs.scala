package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched as the result of a wallet action. */
@js.native
trait WalletActionActivatedEventArgs extends js.Object {
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

object WalletActionActivatedEventArgs {
  @scala.inline
  def apply(
    actionId: String,
    actionKind: WalletActionKind,
    itemId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WalletActionActivatedEventArgs = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], actionKind = actionKind.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletActionActivatedEventArgs]
  }
  @scala.inline
  implicit class WalletActionActivatedEventArgsOps[Self <: WalletActionActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionKind(value: WalletActionKind): Self = this.set("actionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

