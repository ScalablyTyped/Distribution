package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ResponseReceived event. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs")
@js.native
abstract class HttpDiagnosticProviderResponseReceivedEventArgs () extends js.Object {
  /** Gets a locally unique ID for this activity, for correlating with other events. */
  var activityId: String = js.native
  /** Gets the HttpResponseMessage including headers, the status code, and data. */
  var message: HttpResponseMessage = js.native
  /** Gets the timestamp of when the HttpResponseMessage was received. */
  var timestamp: Date = js.native
}

