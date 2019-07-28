package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletActionKind extends js.Object

/** Represents the action that was taken on the item that caused your app to launch. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletActionKind")
@js.native
object WalletActionKind extends js.Object {
  /** A message was tapped. */
  @js.native
  sealed trait message extends WalletActionKind
  
  /** The UI item "see more transactions" was tapped. */
  @js.native
  sealed trait moreTransactions extends WalletActionKind
  
  /** The item was opened. */
  @js.native
  sealed trait openItem extends WalletActionKind
  
  /** A transaction was tapped. */
  @js.native
  sealed trait transaction extends WalletActionKind
  
  /** A verb was tapped. */
  @js.native
  sealed trait verb extends WalletActionKind
  
  /* 3 */ val message: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind.message with Double = js.native
  /* 2 */ val moreTransactions: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind.moreTransactions with Double = js.native
  /* 0 */ val openItem: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind.openItem with Double = js.native
  /* 1 */ val transaction: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind.transaction with Double = js.native
  /* 4 */ val verb: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind.verb with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletActionKind with Double] = js.native
}

