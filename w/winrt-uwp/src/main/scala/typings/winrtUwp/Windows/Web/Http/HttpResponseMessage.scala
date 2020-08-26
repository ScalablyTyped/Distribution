package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Web.Http.Headers.HttpResponseHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP response message including headers, the status code, and data. */
@js.native
trait HttpResponseMessage extends js.Object {
  /** Gets or sets the content of the HTTP response message on the HttpResponseMessage object. */
  var content: IHttpContent = js.native
  /** Gets the collection of HTTP response headers associated with the HttpResponseMessage that were sent by the server. */
  var headers: HttpResponseHeaderCollection = js.native
  /** Gets a value that indicates whether the HTTP response was successful. */
  var isSuccessStatusCode: Boolean = js.native
  /** Gets or sets the reason phrase which typically is sent by servers together with the status code. */
  var reasonPhrase: String = js.native
  /** Gets or sets the request message which led to this response message. */
  var requestMessage: HttpRequestMessage = js.native
  /** Gets the source of the data received in the HttpResponseMessage . */
  var source: HttpResponseMessageSource = js.native
  /** Gets or sets the status code of the HTTP response. */
  var statusCode: HttpStatusCode = js.native
  /** Gets or sets the HTTP protocol version used on the HttpResponseMessage object. */
  var version: HttpVersion = js.native
  /** Closes the HttpResponseMessage instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Throws an exception if the IsSuccessStatusCode property for the HTTP response is false.
    * @return The HTTP response if the request was successful.
    */
  def ensureSuccessStatusCode(): HttpResponseMessage = js.native
}

object HttpResponseMessage {
  @scala.inline
  def apply(
    close: () => Unit,
    content: IHttpContent,
    ensureSuccessStatusCode: () => HttpResponseMessage,
    headers: HttpResponseHeaderCollection,
    isSuccessStatusCode: Boolean,
    reasonPhrase: String,
    requestMessage: HttpRequestMessage,
    source: HttpResponseMessageSource,
    statusCode: HttpStatusCode,
    version: HttpVersion
  ): HttpResponseMessage = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), content = content.asInstanceOf[js.Any], ensureSuccessStatusCode = js.Any.fromFunction0(ensureSuccessStatusCode), headers = headers.asInstanceOf[js.Any], isSuccessStatusCode = isSuccessStatusCode.asInstanceOf[js.Any], reasonPhrase = reasonPhrase.asInstanceOf[js.Any], requestMessage = requestMessage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseMessage]
  }
  @scala.inline
  implicit class HttpResponseMessageOps[Self <: HttpResponseMessage] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setContent(value: IHttpContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnsureSuccessStatusCode(value: () => HttpResponseMessage): Self = this.set("ensureSuccessStatusCode", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaders(value: HttpResponseHeaderCollection): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSuccessStatusCode(value: Boolean): Self = this.set("isSuccessStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonPhrase(value: String): Self = this.set("reasonPhrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestMessage(value: HttpRequestMessage): Self = this.set("requestMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: HttpResponseMessageSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: HttpStatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: HttpVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

