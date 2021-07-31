package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletItemKind extends StObject
/** Represents the kinds (classifications) of wallet items supported. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletItemKind")
@js.native
object WalletItemKind extends StObject {
  
  /** A boarding pass. */
  @js.native
  sealed trait boardingPass
    extends StObject
       with WalletItemKind
  
  /** A deal. */
  @js.native
  sealed trait deal
    extends StObject
       with WalletItemKind
  
  /** A general item. */
  @js.native
  sealed trait general
    extends StObject
       with WalletItemKind
  
  /** The item is invalid. */
  @js.native
  sealed trait invalid
    extends StObject
       with WalletItemKind
  
  /** A membership card. */
  @js.native
  sealed trait membershipCard
    extends StObject
       with WalletItemKind
  
  /** A payment instrument. */
  @js.native
  sealed trait paymentInstrument
    extends StObject
       with WalletItemKind
  
  /** A ticket. */
  @js.native
  sealed trait ticket
    extends StObject
       with WalletItemKind
}
