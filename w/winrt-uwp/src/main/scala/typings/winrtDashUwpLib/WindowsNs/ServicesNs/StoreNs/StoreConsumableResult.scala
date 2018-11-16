package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that involves a consumable add-on for the current app. */
@JSGlobal("Windows.Services.Store.StoreConsumableResult")
@js.native
abstract class StoreConsumableResult () extends js.Object {
  /** Gets the remaining balance for the consumable add-on. */
  var balanceRemaining: scala.Double = js.native
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Gets the status of the request. */
  var status: StoreConsumableStatus = js.native
  /** Gets the tracking ID that was submitted with the ReportConsumableFulfillmentAsync request. */
  var trackingId: java.lang.String = js.native
}

