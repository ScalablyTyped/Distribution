package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request to purchase an app or product that is offered by the app. */
@js.native
trait StorePurchaseResult extends js.Object {
  /** Gets the error code for the purchase request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the status of the purchase request. */
  var status: StorePurchaseStatus = js.native
}

object StorePurchaseResult {
  @scala.inline
  def apply(extendedError: WinRTError, status: StorePurchaseStatus): StorePurchaseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseResult]
  }
  @scala.inline
  implicit class StorePurchaseResultOps[Self <: StorePurchaseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtendedError(value: WinRTError): Self = this.set("extendedError", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: StorePurchaseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

