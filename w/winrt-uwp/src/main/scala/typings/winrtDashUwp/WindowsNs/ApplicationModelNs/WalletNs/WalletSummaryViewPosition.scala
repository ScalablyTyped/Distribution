package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs

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
  
  /* 1 */ val field1: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition.field1 with Double = js.native
  /* 2 */ val field2: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition.field2 with Double = js.native
  /* 0 */ val hidden: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition.hidden with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletSummaryViewPosition with Double] = js.native
}

