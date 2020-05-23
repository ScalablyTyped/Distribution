package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that involves a consumable add-on for the current app. */
@JSGlobal("Windows.Services.Store.StoreConsumableResult")
@js.native
abstract class StoreConsumableResult ()
  extends typings.winrtUwp.Windows.Services.Store.StoreConsumableResult {
  /** Gets the remaining balance for the consumable add-on. */
  /* CompleteClass */
  override var balanceRemaining: Double = js.native
  /** Gets the error code for the request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets the status of the request. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus = js.native
  /** Gets the tracking ID that was submitted with the ReportConsumableFulfillmentAsync request. */
  /* CompleteClass */
  override var trackingId: String = js.native
}

