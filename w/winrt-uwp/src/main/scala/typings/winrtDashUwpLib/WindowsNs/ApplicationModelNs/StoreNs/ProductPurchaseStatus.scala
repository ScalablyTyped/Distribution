package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProductPurchaseStatus extends js.Object

/** Defines values used to indicate the transaction status when purchasing an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductPurchaseStatus")
@js.native
object ProductPurchaseStatus extends js.Object {
  /** The transaction did not complete because this in-app product has already been purchased by the user, and it cannot be purchased again. */
  @js.native
  sealed trait alreadyPurchased
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseStatus
  
  /** The transaction did not complete because the last purchase of this consumable in-app product has not been reported as fulfilled to the Windows Store. */
  @js.native
  sealed trait notFulfilled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseStatus
  
  /** The purchase did not occur because the user decided not to complete the transaction (or the transaction failed for other reasons). */
  @js.native
  sealed trait notPurchased
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseStatus
  
  /** The transaction succeeded and the user has been notified. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseStatus
  
  /* 1 */ val alreadyPurchased: alreadyPurchased with scala.Double = js.native
  /* 2 */ val notFulfilled: notFulfilled with scala.Double = js.native
  /* 3 */ val notPurchased: notPurchased with scala.Double = js.native
  /* 0 */ val succeeded: succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseStatus with scala.Double
  ] = js.native
}

