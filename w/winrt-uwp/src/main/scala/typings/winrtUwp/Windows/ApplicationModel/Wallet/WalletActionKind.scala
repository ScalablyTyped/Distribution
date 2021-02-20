package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletActionKind extends StObject
/** Represents the action that was taken on the item that caused your app to launch. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletActionKind")
@js.native
object WalletActionKind extends StObject {
  
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
}
