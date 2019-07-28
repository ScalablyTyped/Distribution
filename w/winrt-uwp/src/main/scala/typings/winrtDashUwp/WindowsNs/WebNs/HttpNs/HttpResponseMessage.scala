package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpResponseHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP response message including headers, the status code, and data. */
@JSGlobal("Windows.Web.Http.HttpResponseMessage")
@js.native
/** Initializes a new instance of the HttpResponseMessage class. */
class HttpResponseMessage () extends js.Object {
  /**
    * Initializes a new instance of the HttpResponseMessage class with a specific HttpStatusCode .
    * @param statusCode The status code of the HTTP response.
    */
  def this(statusCode: HttpStatusCode) = this()
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

