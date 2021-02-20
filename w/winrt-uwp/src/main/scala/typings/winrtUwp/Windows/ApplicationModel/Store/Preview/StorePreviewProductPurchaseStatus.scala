package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorePreviewProductPurchaseStatus extends StObject
/** Defines values that are used to indicate the transaction status when purchasing an in-app product SKU by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus")
@js.native
object StorePreviewProductPurchaseStatus extends StObject {
  
  /** The transaction did not complete because this in-app product SKU has already been purchased by the user, and it cannot be purchased again. This value only applies to durable in-app products. */
  @js.native
  sealed trait alreadyPurchased extends StorePreviewProductPurchaseStatus
  
  /** The transaction did not complete because the last purchase of this consumable in-app product SKU has not been reported as fulfilled to the Windows Store. This value only applies to consumable in-app products. */
  @js.native
  sealed trait notFulfilled extends StorePreviewProductPurchaseStatus
  
  /** The purchase did not occur because the user decided not to complete the transaction (or the transaction failed for other reasons). */
  @js.native
  sealed trait notPurchased extends StorePreviewProductPurchaseStatus
  
  /** The transaction succeeded and the user has been notified. */
  @js.native
  sealed trait succeeded extends StorePreviewProductPurchaseStatus
}
