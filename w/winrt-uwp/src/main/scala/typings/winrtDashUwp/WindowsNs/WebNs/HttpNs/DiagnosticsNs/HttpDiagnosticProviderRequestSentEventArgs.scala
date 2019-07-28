package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestSent event. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs")
@js.native
abstract class HttpDiagnosticProviderRequestSentEventArgs () extends js.Object {
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

