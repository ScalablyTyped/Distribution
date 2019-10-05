package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

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
  
  /* 5 */ val boardingPass: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.boardingPass with Double = js.native
  /* 1 */ val deal: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.deal with Double = js.native
  /* 2 */ val general: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.general with Double = js.native
  /* 0 */ val invalid: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.invalid with Double = js.native
  /* 6 */ val membershipCard: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.membershipCard with Double = js.native
  /* 3 */ val paymentInstrument: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.paymentInstrument with Double = js.native
  /* 4 */ val ticket: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletItemKind.ticket with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletItemKind with Double] = js.native
}

