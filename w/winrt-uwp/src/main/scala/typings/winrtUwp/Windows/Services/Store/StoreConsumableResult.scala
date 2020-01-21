package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that involves a consumable add-on for the current app. */
@JSGlobal("Windows.Services.Store.StoreConsumableResult")
@js.native
abstract class StoreConsumableResult () extends js.Object {
  /** Gets the remaining balance for the consumable add-on. */
  var balanceRemaining: Double = js.native
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the status of the request. */
  var status: StoreConsumableStatus = js.native
  /** Gets the tracking ID that was submitted with the ReportConsumableFulfillmentAsync request. */
  var trackingId: String = js.native
}

