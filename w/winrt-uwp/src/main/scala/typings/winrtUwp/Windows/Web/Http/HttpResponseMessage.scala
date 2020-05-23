package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Web.Http.Headers.HttpResponseHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP response message including headers, the status code, and data. */
trait HttpResponseMessage extends js.Object {
  /** Gets or sets the content of the HTTP response message on the HttpResponseMessage object. */
  var content: IHttpContent
  /** Gets the collection of HTTP response headers associated with the HttpResponseMessage that were sent by the server. */
  var headers: HttpResponseHeaderCollection
  /** Gets a value that indicates whether the HTTP response was successful. */
  var isSuccessStatusCode: Boolean
  /** Gets or sets the reason phrase which typically is sent by servers together with the status code. */
  var reasonPhrase: String
  /** Gets or sets the request message which led to this response message. */
  var requestMessage: HttpRequestMessage
  /** Gets the source of the data received in the HttpResponseMessage . */
  var source: HttpResponseMessageSource
  /** Gets or sets the status code of the HTTP response. */
  var statusCode: HttpStatusCode
  /** Gets or sets the HTTP protocol version used on the HttpResponseMessage object. */
  var version: HttpVersion
  /** Closes the HttpResponseMessage instance and releases allocated resources. */
  def close(): Unit
  /**
    * Throws an exception if the IsSuccessStatusCode property for the HTTP response is false.
    * @return The HTTP response if the request was successful.
    */
  def ensureSuccessStatusCode(): HttpResponseMessage
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
}

