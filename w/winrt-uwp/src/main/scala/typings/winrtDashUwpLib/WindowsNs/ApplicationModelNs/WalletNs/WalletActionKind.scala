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
  
  val message: message with java.lang.String = js.native
  val moreTransactions: moreTransactions with java.lang.String = js.native
  val openItem: openItem with java.lang.String = js.native
  val transaction: transaction with java.lang.String = js.native
  val verb: verb with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletActionKind with java.lang.String
  ] = js.native
}

