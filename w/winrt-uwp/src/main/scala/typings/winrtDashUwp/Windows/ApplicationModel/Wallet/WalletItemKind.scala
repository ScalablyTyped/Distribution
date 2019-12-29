package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletItemKind with Double] = js.native
  /* 5 */ @js.native
  object boardingPass extends TopLevel[boardingPass with Double]
  
  /* 1 */ @js.native
  object deal extends TopLevel[deal with Double]
  
  /* 2 */ @js.native
  object general extends TopLevel[general with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 6 */ @js.native
  object membershipCard extends TopLevel[membershipCard with Double]
  
  /* 3 */ @js.native
  object paymentInstrument extends TopLevel[paymentInstrument with Double]
  
  /* 4 */ @js.native
  object ticket extends TopLevel[ticket with Double]
  
}

