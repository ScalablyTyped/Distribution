package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

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
  sealed trait message
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind
  
  /** The UI item "see more transactions" was tapped. */
  @js.native
  sealed trait moreTransactions
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind
  
  /** The item was opened. */
  @js.native
  sealed trait openItem
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind
  
  /** A transaction was tapped. */
  @js.native
  sealed trait transaction
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind
  
  /** A verb was tapped. */
  @js.native
  sealed trait verb
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind
  
  /* 3 */ val message: message with scala.Double = js.native
  /* 2 */ val moreTransactions: moreTransactions with scala.Double = js.native
  /* 0 */ val openItem: openItem with scala.Double = js.native
  /* 1 */ val transaction: transaction with scala.Double = js.native
  /* 4 */ val verb: verb with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind with scala.Double
  ] = js.native
}

