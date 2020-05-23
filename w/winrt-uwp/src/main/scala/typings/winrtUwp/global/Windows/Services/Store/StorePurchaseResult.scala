package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to purchase an app or product that is offered by the app. */
@JSGlobal("Windows.Services.Store.StorePurchaseResult")
@js.native
abstract class StorePurchaseResult ()
  extends typings.winrtUwp.Windows.Services.Store.StorePurchaseResult {
  /** Gets the error code for the purchase request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets the status of the purchase request. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus = js.native
}

