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
  
  val boardingPass: boardingPass with java.lang.String = js.native
  val deal: deal with java.lang.String = js.native
  val general: general with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val membershipCard: membershipCard with java.lang.String = js.native
  val paymentInstrument: paymentInstrument with java.lang.String = js.native
  val ticket: ticket with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletItemKind with java.lang.String
  ] = js.native
}

