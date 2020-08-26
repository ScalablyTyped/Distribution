package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.std.Date
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ResponseReceived event. */
@js.native
trait HttpDiagnosticProviderResponseReceivedEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String = js.native
  /** Gets the HttpResponseMessage including headers, the status code, and data. */
  var message: HttpResponseMessage = js.native
  /** Gets the timestamp of when the HttpResponseMessage was received. */
  var timestamp: Date = js.native
}

object HttpDiagnosticProviderResponseReceivedEventArgs {
  @scala.inline
  def apply(activityId: String, message: HttpResponseMessage, timestamp: Date): HttpDiagnosticProviderResponseReceivedEventArgs = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderResponseReceivedEventArgs]
  }
  @scala.inline
  implicit class HttpDiagnosticProviderResponseReceivedEventArgsOps[Self <: HttpDiagnosticProviderResponseReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setActivityId(value: String): Self = this.set("activityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: HttpResponseMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

