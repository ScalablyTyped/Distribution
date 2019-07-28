package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the RequestResponseCompleted event. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs")
@js.native
abstract class HttpDiagnosticProviderRequestResponseCompletedEventArgs () extends js.Object {
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

