package typings.winrtUwp.Windows.ApplicationModel.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FulfillmentResult extends StObject
/** Defines values used to indicate fulfillment status for a consumable in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.FulfillmentResult")
@js.native
object FulfillmentResult extends StObject {
  
  /** The specified transaction ID has been passed or the consumable in-app product has already been fulfilled. */
  @js.native
  sealed trait nothingToFulfill extends FulfillmentResult
  
  /** The purchase is not complete. At this point it is still possible for the transaction to be reversed due to provider failures and/or risk checks. */
  @js.native
  sealed trait purchasePending extends FulfillmentResult
  
  /** The purchase request has been reverted. */
  @js.native
  sealed trait purchaseReverted extends FulfillmentResult
  
  /** There was an issue receiving fulfillment status. */
  @js.native
  sealed trait serverError extends FulfillmentResult
  
  /** The purchased consumable in-app product was fulfilled. */
  @js.native
  sealed trait succeeded extends FulfillmentResult
}
