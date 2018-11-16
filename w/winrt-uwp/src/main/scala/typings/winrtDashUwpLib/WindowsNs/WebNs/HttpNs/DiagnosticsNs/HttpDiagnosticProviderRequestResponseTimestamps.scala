package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides all the timestamps for connection events. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps")
@js.native
abstract class HttpDiagnosticProviderRequestResponseTimestamps () extends js.Object {
  /** Gets the last time local cache was checked. */
  var cacheCheckedTimestamp: stdLib.Date = js.native
  /** Gets the timestamp for the end of the TCP connection phase. */
  var connectionCompletedTimestamp: stdLib.Date = js.native
  /** Gets the timestamp for the start of the TCP connection phase. */
  var connectionInitiatedTimestamp: stdLib.Date = js.native
  /** Gets the time of the DNS name resolution. */
  var nameResolvedTimestamp: stdLib.Date = js.native
  /** Gets the timestamp for the last byte sent. */
  var requestCompletedTimestamp: stdLib.Date = js.native
  /** Gets the timestamp for the first byte sent. */
  var requestSentTimestamp: stdLib.Date = js.native
  /** Gets the timestamp for the last byte received. */
  var responseCompletedTimestamp: stdLib.Date = js.native
  /** Gets the timestamp for the fir byte received. */
  var responseReceivedTimestamp: stdLib.Date = js.native
  /** Gets the time of the SSL handshake negotiation. */
  var sslNegotiatedTimestamp: stdLib.Date = js.native
}

