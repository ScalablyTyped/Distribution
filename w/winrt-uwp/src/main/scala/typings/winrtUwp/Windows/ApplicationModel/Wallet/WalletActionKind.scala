package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletActionKind extends StObject
/** Represents the action that was taken on the item that caused your app to launch. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletActionKind")
@js.native
object WalletActionKind extends StObject {
  
  /** A message was tapped. */
  @js.native
  sealed trait message
    extends StObject
       with WalletActionKind
  
  /** The UI item "see more transactions" was tapped. */
  @js.native
  sealed trait moreTransactions
    extends StObject
       with WalletActionKind
  
  /** The item was opened. */
  @js.native
  sealed trait openItem
    extends StObject
       with WalletActionKind
  
  /** A transaction was tapped. */
  @js.native
  sealed trait transaction
    extends StObject
       with WalletActionKind
  
  /** A verb was tapped. */
  @js.native
  sealed trait verb
    extends StObject
       with WalletActionKind
}
