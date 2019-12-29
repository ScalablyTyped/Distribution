package typings.winrtDashUwp.Windows.ApplicationModel.Store

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FulfillmentResult with Double] = js.native
  /* 1 */ @js.native
  object nothingToFulfill extends TopLevel[nothingToFulfill with Double]
  
  /* 2 */ @js.native
  object purchasePending extends TopLevel[purchasePending with Double]
  
  /* 3 */ @js.native
  object purchaseReverted extends TopLevel[purchaseReverted with Double]
  
  /* 4 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
}

