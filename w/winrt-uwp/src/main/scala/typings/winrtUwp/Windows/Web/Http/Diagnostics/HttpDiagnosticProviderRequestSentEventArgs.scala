package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Web.Http.HttpRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestSent event. */
trait HttpDiagnosticProviderRequestSentEventArgs extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String
  /** Gets the type of operation initiating this request. */
  var initiator: HttpDiagnosticRequestInitiator
  /** Gets the HttpRequestMessage including headers. */
  var message: HttpRequestMessage
  /** Gets the process ID. */
  var processId: Double
  /** Gets the source location call stack. */
  var sourceLocations: IVectorView[HttpDiagnosticSourceLocation]
  /** Gets the thread ID. */
  var threadId: Double
  /** Gets the timestamp of when the HttpRequestMessage was sent. */
  var timestamp: Date
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
}

