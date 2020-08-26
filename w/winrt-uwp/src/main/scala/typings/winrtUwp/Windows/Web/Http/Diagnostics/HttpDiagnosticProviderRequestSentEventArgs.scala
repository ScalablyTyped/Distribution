package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Web.Http.HttpRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestSent event. */
@js.native
trait HttpDiagnosticProviderRequestSentEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String = js.native
  /** Gets the type of operation initiating this request. */
  var initiator: HttpDiagnosticRequestInitiator = js.native
  /** Gets the HttpRequestMessage including headers. */
  var message: HttpRequestMessage = js.native
  /** Gets the process ID. */
  var processId: Double = js.native
  /** Gets the source location call stack. */
  var sourceLocations: IVectorView[HttpDiagnosticSourceLocation] = js.native
  /** Gets the thread ID. */
  var threadId: Double = js.native
  /** Gets the timestamp of when the HttpRequestMessage was sent. */
  var timestamp: Date = js.native
}

object HttpDiagnosticProviderRequestSentEventArgs {
  @scala.inline
  def apply(
    activityId: String,
    initiator: HttpDiagnosticRequestInitiator,
    message: HttpRequestMessage,
    processId: Double,
    sourceLocations: IVectorView[HttpDiagnosticSourceLocation],
    threadId: Double,
    timestamp: Date
  ): HttpDiagnosticProviderRequestSentEventArgs = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderRequestSentEventArgs]
  }
  @scala.inline
  implicit class HttpDiagnosticProviderRequestSentEventArgsOps[Self <: HttpDiagnosticProviderRequestSentEventArgs] (val x: Self) extends AnyVal {
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
    def setInitiator(value: HttpDiagnosticRequestInitiator): Self = this.set("initiator", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: HttpRequestMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLocations(value: IVectorView[HttpDiagnosticSourceLocation]): Self = this.set("sourceLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadId(value: Double): Self = this.set("threadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

