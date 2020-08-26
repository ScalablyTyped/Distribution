package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the message that the app service sent in response to a request. */
@js.native
trait AppServiceResponse extends js.Object {
  /** Gets the message that the response from the app service contains. */
  var message: ValueSet = js.native
  /** Gets the status for the response from the app service. */
  var status: AppServiceResponseStatus = js.native
}

object AppServiceResponse {
  @scala.inline
  def apply(message: ValueSet, status: AppServiceResponseStatus): AppServiceResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceResponse]
  }
  @scala.inline
  implicit class AppServiceResponseOps[Self <: AppServiceResponse] (val x: Self) extends AnyVal {
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
    def setMessage(value: ValueSet): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AppServiceResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

