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
  
  val alreadyPurchased: alreadyPurchased with java.lang.String = js.native
  val notFulfilled: notFulfilled with java.lang.String = js.native
  val notPurchased: notPurchased with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductPurchaseStatus with java.lang.String
  ] = js.native
}

