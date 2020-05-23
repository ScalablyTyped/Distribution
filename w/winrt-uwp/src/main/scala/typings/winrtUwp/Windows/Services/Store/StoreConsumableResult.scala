package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that involves a consumable add-on for the current app. */
trait StoreConsumableResult extends js.Object {
  /** Gets the remaining balance for the consumable add-on. */
  var balanceRemaining: Double
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets the status of the request. */
  var status: StoreConsumableStatus
  /** Gets the tracking ID that was submitted with the ReportConsumableFulfillmentAsync request. */
  var trackingId: String
}

object StoreConsumableResult {
  @scala.inline
  def apply(
    balanceRemaining: Double,
    extendedError: WinRTError,
    status: StoreConsumableStatus,
    trackingId: String
  ): StoreConsumableResult = {
    val __obj = js.Dynamic.literal(balanceRemaining = balanceRemaining.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConsumableResult]
  }
}

