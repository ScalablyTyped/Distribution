package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestSent event. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs")
@js.native
abstract class HttpDiagnosticProviderRequestSentEventArgs () extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: java.lang.String = js.native
  /** Gets the type of operation initiating this request. */
  var initiator: HttpDiagnosticRequestInitiator = js.native
  /** Gets the HttpRequestMessage including headers. */
  var message: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpRequestMessage = js.native
  /** Gets the process ID. */
  var processId: scala.Double = js.native
  /** Gets the source location call stack. */
  var sourceLocations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpDiagnosticSourceLocation] = js.native
  /** Gets the thread ID. */
  var threadId: scala.Double = js.native
  /** Gets the timestamp of when the HttpRequestMessage was sent. */
  var timestamp: stdLib.Date = js.native
}

