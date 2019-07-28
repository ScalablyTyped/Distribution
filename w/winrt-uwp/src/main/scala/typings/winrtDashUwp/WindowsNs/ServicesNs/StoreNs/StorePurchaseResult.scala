package typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs

import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to purchase an app or product that is offered by the app. */
@JSGlobal("Windows.Services.Store.StorePurchaseResult")
@js.native
abstract class StorePurchaseResult () extends js.Object {
  /** Gets the error code for the purchase request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the status of the purchase request. */
  var status: StorePurchaseStatus = js.native
}

