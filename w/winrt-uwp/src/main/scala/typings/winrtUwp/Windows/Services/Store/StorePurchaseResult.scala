package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to purchase an app or product that is offered by the app. */
trait StorePurchaseResult extends js.Object {
  /** Gets the error code for the purchase request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets the status of the purchase request. */
  var status: StorePurchaseStatus
}

object StorePurchaseResult {
  @scala.inline
  def apply(extendedError: WinRTError, status: StorePurchaseStatus): StorePurchaseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseResult]
  }
}

