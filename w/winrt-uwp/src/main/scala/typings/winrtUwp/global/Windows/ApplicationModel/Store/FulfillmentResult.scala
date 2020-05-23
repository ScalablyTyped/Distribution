package typings.winrtUwp.global.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines values used to indicate fulfillment status for a consumable in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.FulfillmentResult")
@js.native
object FulfillmentResult extends js.Object {
  /* 1 */ val nothingToFulfill: typings.winrtUwp.Windows.ApplicationModel.Store.FulfillmentResult.nothingToFulfill with Double = js.native
  /* 2 */ val purchasePending: typings.winrtUwp.Windows.ApplicationModel.Store.FulfillmentResult.purchasePending with Double = js.native
  /* 3 */ val purchaseReverted: typings.winrtUwp.Windows.ApplicationModel.Store.FulfillmentResult.purchaseReverted with Double = js.native
  /* 4 */ val serverError: typings.winrtUwp.Windows.ApplicationModel.Store.FulfillmentResult.serverError with Double = js.native
  /* 0 */ val succeeded: typings.winrtUwp.Windows.ApplicationModel.Store.FulfillmentResult.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.ApplicationModel.Store.FulfillmentResult with Double] = js.native
}

