package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

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
  sealed trait nothingToFulfill
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult
  
  /** The purchase is not complete. At this point it is still possible for the transaction to be reversed due to provider failures and/or risk checks. */
  @js.native
  sealed trait purchasePending
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult
  
  /** The purchase request has been reverted. */
  @js.native
  sealed trait purchaseReverted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult
  
  /** There was an issue receiving fulfillment status. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult
  
  /** The purchased consumable in-app product was fulfilled. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult
  
  /* 1 */ val nothingToFulfill: nothingToFulfill with scala.Double = js.native
  /* 2 */ val purchasePending: purchasePending with scala.Double = js.native
  /* 3 */ val purchaseReverted: purchaseReverted with scala.Double = js.native
  /* 4 */ val serverError: serverError with scala.Double = js.native
  /* 0 */ val succeeded: succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult with scala.Double
  ] = js.native
}

