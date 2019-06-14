package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

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
  sealed trait boardingPass
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /** A deal. */
  @js.native
  sealed trait deal
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /** A general item. */
  @js.native
  sealed trait general
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /** The item is invalid. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /** A membership card. */
  @js.native
  sealed trait membershipCard
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /** A payment instrument. */
  @js.native
  sealed trait paymentInstrument
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /** A ticket. */
  @js.native
  sealed trait ticket
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind
  
  /* 5 */ val boardingPass: boardingPass with scala.Double = js.native
  /* 1 */ val deal: deal with scala.Double = js.native
  /* 2 */ val general: general with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 6 */ val membershipCard: membershipCard with scala.Double = js.native
  /* 3 */ val paymentInstrument: paymentInstrument with scala.Double = js.native
  /* 4 */ val ticket: ticket with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind with scala.Double
  ] = js.native
}

