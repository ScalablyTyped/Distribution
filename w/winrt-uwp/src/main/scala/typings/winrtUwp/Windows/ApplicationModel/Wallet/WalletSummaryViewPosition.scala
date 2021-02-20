package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletSummaryViewPosition extends StObject
/** Describes the position in the summary view of a wallet item that a WalletItemCustomProperty should be displayed. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletSummaryViewPosition")
@js.native
object WalletSummaryViewPosition extends StObject {
  
  /** The first summary line. */
  @js.native
  sealed trait field1 extends WalletSummaryViewPosition
  
  /** The second summary line. */
  @js.native
  sealed trait field2 extends WalletSummaryViewPosition
  
  /** The item is hidden in the summary view. */
  @js.native
  sealed trait hidden extends WalletSummaryViewPosition
}
