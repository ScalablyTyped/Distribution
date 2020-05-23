package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestResponseCompleted event. */
trait HttpDiagnosticProviderRequestResponseCompletedEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String
  /** Gets the type of operation initiating this request. */
  var initiator: HttpDiagnosticRequestInitiator
  var processId: js.Any
   /* unmapped type */ /** Gets the URI of the requested response. */
  var requestedUri: Uri
  var sourceLocations: js.Any
   /* unmapped type */ var threadId: js.Any
   /* unmapped type */ /** Gets the timestamp for connection events. */
  var timestamps: HttpDiagnosticProviderRequestResponseTimestamps
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
}

