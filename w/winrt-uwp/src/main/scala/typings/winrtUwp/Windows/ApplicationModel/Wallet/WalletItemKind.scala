package typings.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletItemKind extends js.Object

/** Represents the kinds (classifications) of wallet items supported. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletItemKind")
@js.native
object WalletItemKind extends js.Object {
  /** A boarding pass. */
  @js.native
  sealed trait boardingPass extends WalletItemKind
  
  /** A deal. */
  @js.native
  sealed trait deal extends WalletItemKind
  
  /** A general item. */
  @js.native
  sealed trait general extends WalletItemKind
  
  /** The item is invalid. */
  @js.native
  sealed trait invalid extends WalletItemKind
  
  /** A membership card. */
  @js.native
  sealed trait membershipCard extends WalletItemKind
  
  /** A payment instrument. */
  @js.native
  sealed trait paymentInstrument extends WalletItemKind
  
  /** A ticket. */
  @js.native
  sealed trait ticket extends WalletItemKind
  
}

