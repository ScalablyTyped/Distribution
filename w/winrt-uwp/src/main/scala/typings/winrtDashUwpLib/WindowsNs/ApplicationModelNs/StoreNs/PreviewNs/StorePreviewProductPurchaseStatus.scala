package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorePreviewProductPurchaseStatus extends js.Object

/** Defines values that are used to indicate the transaction status when purchasing an in-app product SKU by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus")
@js.native
object StorePreviewProductPurchaseStatus extends js.Object {
  /** The transaction did not complete because this in-app product SKU has already been purchased by the user, and it cannot be purchased again. This value only applies to durable in-app products. */
  @js.native
  sealed trait alreadyPurchased
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StorePreviewProductPurchaseStatus
  
  /** The transaction did not complete because the last purchase of this consumable in-app product SKU has not been reported as fulfilled to the Windows Store. This value only applies to consumable in-app products. */
  @js.native
  sealed trait notFulfilled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StorePreviewProductPurchaseStatus
  
  /** The purchase did not occur because the user decided not to complete the transaction (or the transaction failed for other reasons). */
  @js.native
  sealed trait notPurchased
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StorePreviewProductPurchaseStatus
  
  /** The transaction succeeded and the user has been notified. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StorePreviewProductPurchaseStatus
  
  val alreadyPurchased: alreadyPurchased with java.lang.String = js.native
  val notFulfilled: notFulfilled with java.lang.String = js.native
  val notPurchased: notPurchased with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.StorePreviewProductPurchaseStatus with java.lang.String
  ] = js.native
}

