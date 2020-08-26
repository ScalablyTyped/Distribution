package typings.winrtUwp.Windows.Web.Http.Diagnostics

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides all the timestamps for connection events. */
@js.native
trait HttpDiagnosticProviderRequestResponseTimestamps extends js.Object {
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
  @scala.inline
  implicit class HttpDiagnosticProviderRequestResponseTimestampsOps[Self <: HttpDiagnosticProviderRequestResponseTimestamps] (val x: Self) extends AnyVal {
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
    def setCacheCheckedTimestamp(value: Date): Self = this.set("cacheCheckedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionCompletedTimestamp(value: Date): Self = this.set("connectionCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionInitiatedTimestamp(value: Date): Self = this.set("connectionInitiatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameResolvedTimestamp(value: Date): Self = this.set("nameResolvedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestCompletedTimestamp(value: Date): Self = this.set("requestCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestSentTimestamp(value: Date): Self = this.set("requestSentTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseCompletedTimestamp(value: Date): Self = this.set("responseCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseReceivedTimestamp(value: Date): Self = this.set("responseReceivedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSslNegotiatedTimestamp(value: Date): Self = this.set("sslNegotiatedTimestamp", value.asInstanceOf[js.Any])
  }
  
}

