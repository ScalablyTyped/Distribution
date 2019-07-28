package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FulfillmentResult extends js.Object

/** Defines values used to indicate fulfillment status for a consumable in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.FulfillmentResult")
@js.native
object FulfillmentResult extends js.Object {
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
  
  /* 1 */ val nothingToFulfill: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult.nothingToFulfill with Double = js.native
  /* 2 */ val purchasePending: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult.purchasePending with Double = js.native
  /* 3 */ val purchaseReverted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult.purchaseReverted with Double = js.native
  /* 4 */ val serverError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult.serverError with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FulfillmentResult with Double] = js.native
}

