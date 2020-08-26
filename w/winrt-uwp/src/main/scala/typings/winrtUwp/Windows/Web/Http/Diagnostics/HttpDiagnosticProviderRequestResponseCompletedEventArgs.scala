package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestResponseCompleted event. */
@js.native
trait HttpDiagnosticProviderRequestResponseCompletedEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String = js.native
  /** Gets the type of operation initiating this request. */
  var initiator: HttpDiagnosticRequestInitiator = js.native
  var processId: js.Any = js.native
   /* unmapped type */ /** Gets the URI of the requested response. */
  var requestedUri: Uri = js.native
  var sourceLocations: js.Any = js.native
   /* unmapped type */ var threadId: js.Any = js.native
   /* unmapped type */ /** Gets the timestamp for connection events. */
  var timestamps: HttpDiagnosticProviderRequestResponseTimestamps = js.native
}

object HttpDiagnosticProviderRequestResponseCompletedEventArgs {
  @scala.inline
  def apply(
    activityId: String,
    initiator: HttpDiagnosticRequestInitiator,
    processId: js.Any,
    requestedUri: Uri,
    sourceLocations: js.Any,
    threadId: js.Any,
    timestamps: HttpDiagnosticProviderRequestResponseTimestamps
  ): HttpDiagnosticProviderRequestResponseCompletedEventArgs = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceLocations = sourceLocations.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseCompletedEventArgs]
  }
  @scala.inline
  implicit class HttpDiagnosticProviderRequestResponseCompletedEventArgsOps[Self <: HttpDiagnosticProviderRequestResponseCompletedEventArgs] (val x: Self) extends AnyVal {
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
    def setProcessId(value: js.Any): Self = this.set("processId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedUri(value: Uri): Self = this.set("requestedUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLocations(value: js.Any): Self = this.set("sourceLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadId(value: js.Any): Self = this.set("threadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamps(value: HttpDiagnosticProviderRequestResponseTimestamps): Self = this.set("timestamps", value.asInstanceOf[js.Any])
  }
  
}

