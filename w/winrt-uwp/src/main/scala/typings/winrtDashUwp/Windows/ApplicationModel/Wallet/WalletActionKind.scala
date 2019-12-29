package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletActionKind with Double] = js.native
  /* 3 */ @js.native
  object message extends TopLevel[message with Double]
  
  /* 2 */ @js.native
  object moreTransactions extends TopLevel[moreTransactions with Double]
  
  /* 0 */ @js.native
  object openItem extends TopLevel[openItem with Double]
  
  /* 1 */ @js.native
  object transaction extends TopLevel[transaction with Double]
  
  /* 4 */ @js.native
  object verb extends TopLevel[verb with Double]
  
}

