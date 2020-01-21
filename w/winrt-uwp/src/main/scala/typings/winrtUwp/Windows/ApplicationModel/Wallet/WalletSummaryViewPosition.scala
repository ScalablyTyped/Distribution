package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletSummaryViewPosition extends js.Object

/** Describes the position in the summary view of a wallet item that a WalletItemCustomProperty should be displayed. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletSummaryViewPosition")
@js.native
object WalletSummaryViewPosition extends js.Object {
  /** The first summary line. */
  @js.native
  sealed trait field1 extends WalletSummaryViewPosition
  
  /** The second summary line. */
  @js.native
  sealed trait field2 extends WalletSummaryViewPosition
  
  /** The item is hidden in the summary view. */
  @js.native
  sealed trait hidden extends WalletSummaryViewPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletSummaryViewPosition with Double] = js.native
  /* 1 */ @js.native
  object field1 extends TopLevel[field1 with Double]
  
  /* 2 */ @js.native
  object field2 extends TopLevel[field2 with Double]
  
  /* 0 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
}

