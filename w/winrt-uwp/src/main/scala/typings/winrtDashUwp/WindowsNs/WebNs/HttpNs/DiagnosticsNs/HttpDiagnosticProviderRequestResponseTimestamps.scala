package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides all the timestamps for connection events. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps")
@js.native
abstract class HttpDiagnosticProviderRequestResponseTimestamps () extends js.Object {
  /** Gets the last time local cache was checked. */
  var cacheCheckedTimestamp: Date = js.native
  /** Gets the timestamp for the end of the TCP connection phase. */
  var connectionCompletedTimestamp: Date = js.native
  /** Gets the timestamp for the start of the TCP connection phase. */
  var connectionInitiatedTimestamp: Date = js.native
  /** Gets the time of the DNS name resolution. */
  var nameResolvedTimestamp: Date = js.native
  /** Gets the timestamp for the last byte sent. */
  var requestCompletedTimestamp: Date = js.native
  /** Gets the timestamp for the first byte sent. */
  var requestSentTimestamp: Date = js.native
  /** Gets the timestamp for the last byte received. */
  var responseCompletedTimestamp: Date = js.native
  /** Gets the timestamp for the fir byte received. */
  var responseReceivedTimestamp: Date = js.native
  /** Gets the time of the SSL handshake negotiation. */
  var sslNegotiatedTimestamp: Date = js.native
}

