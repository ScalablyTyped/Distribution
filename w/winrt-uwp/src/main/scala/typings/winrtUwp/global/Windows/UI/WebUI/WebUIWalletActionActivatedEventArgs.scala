package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched as the result of a wallet action. */
@JSGlobal("Windows.UI.WebUI.WebUIWalletActionActivatedEventArgs")
@js.native
abstract class WebUIWalletActionActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIWalletActionActivatedEventArgs {
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  /* CompleteClass */
  override var actionId: String = js.native
  /** Gets the action that was performed on the WalletItem. */
  /* CompleteClass */
  override var actionKind: WalletActionKind = js.native
  /** Gets the app activation operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the ID of the WalletItem on which the user performed the action. */
  /* CompleteClass */
  override var itemId: String = js.native
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

