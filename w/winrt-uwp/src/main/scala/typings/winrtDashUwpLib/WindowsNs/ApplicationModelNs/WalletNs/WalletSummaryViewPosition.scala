package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

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
  sealed trait field1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition
  
  /** The second summary line. */
  @js.native
  sealed trait field2
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition
  
  /** The item is hidden in the summary view. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition
  
  /* 1 */ val field1: field1 with scala.Double = js.native
  /* 2 */ val field2: field2 with scala.Double = js.native
  /* 0 */ val hidden: hidden with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletSummaryViewPosition with scala.Double
  ] = js.native
}

