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
  
  val nothingToFulfill: nothingToFulfill with java.lang.String = js.native
  val purchasePending: purchasePending with java.lang.String = js.native
  val purchaseReverted: purchaseReverted with java.lang.String = js.native
  val serverError: serverError with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.FulfillmentResult with java.lang.String
  ] = js.native
}

