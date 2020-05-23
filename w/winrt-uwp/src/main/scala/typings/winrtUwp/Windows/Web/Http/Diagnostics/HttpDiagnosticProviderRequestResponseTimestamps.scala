package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides all the timestamps for connection events. */
trait HttpDiagnosticProviderRequestResponseTimestamps extends js.Object {
  /** Gets the last time local cache was checked. */
  var cacheCheckedTimestamp: Date
  /** Gets the timestamp for the end of the TCP connection phase. */
  var connectionCompletedTimestamp: Date
  /** Gets the timestamp for the start of the TCP connection phase. */
  var connectionInitiatedTimestamp: Date
  /** Gets the time of the DNS name resolution. */
  var nameResolvedTimestamp: Date
  /** Gets the timestamp for the last byte sent. */
  var requestCompletedTimestamp: Date
  /** Gets the timestamp for the first byte sent. */
  var requestSentTimestamp: Date
  /** Gets the timestamp for the last byte received. */
  var responseCompletedTimestamp: Date
  /** Gets the timestamp for the fir byte received. */
  var responseReceivedTimestamp: Date
  /** Gets the time of the SSL handshake negotiation. */
  var sslNegotiatedTimestamp: Date
}

object HttpDiagnosticProviderRequestResponseTimestamps {
  @scala.inline
  def apply(
    cacheCheckedTimestamp: Date,
    connectionCompletedTimestamp: Date,
    connectionInitiatedTimestamp: Date,
    nameResolvedTimestamp: Date,
    requestCompletedTimestamp: Date,
    requestSentTimestamp: Date,
    responseCompletedTimestamp: Date,
    responseReceivedTimestamp: Date,
    sslNegotiatedTimestamp: Date
  ): HttpDiagnosticProviderRequestResponseTimestamps = {
    val __obj = js.Dynamic.literal(cacheCheckedTimestamp = cacheCheckedTimestamp.asInstanceOf[js.Any], connectionCompletedTimestamp = connectionCompletedTimestamp.asInstanceOf[js.Any], connectionInitiatedTimestamp = connectionInitiatedTimestamp.asInstanceOf[js.Any], nameResolvedTimestamp = nameResolvedTimestamp.asInstanceOf[js.Any], requestCompletedTimestamp = requestCompletedTimestamp.asInstanceOf[js.Any], requestSentTimestamp = requestSentTimestamp.asInstanceOf[js.Any], responseCompletedTimestamp = responseCompletedTimestamp.asInstanceOf[js.Any], responseReceivedTimestamp = responseReceivedTimestamp.asInstanceOf[js.Any], sslNegotiatedTimestamp = sslNegotiatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDiagnosticProviderRequestResponseTimestamps]
  }
}

