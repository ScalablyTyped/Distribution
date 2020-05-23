package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched as the result of a wallet action. */
@JSGlobal("Windows.ApplicationModel.Activation.WalletActionActivatedEventArgs")
@js.native
abstract class WalletActionActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.WalletActionActivatedEventArgs {
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  /* CompleteClass */
  override var actionId: String = js.native
  /** Gets the action that was performed on the WalletItem . */
  /* CompleteClass */
  override var actionKind: WalletActionKind = js.native
  /** Gets the ID of the WalletItem on which the user performed the action. */
  /* CompleteClass */
  override var itemId: String = js.native
  /** Gets the type of action that was performed on the WalletItem . */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

