package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Web.Http.Headers.HttpResponseHeaderCollection
import typings.winrtUwp.Windows.Web.Http.IHttpContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP response message including headers, the status code, and data. */
@JSGlobal("Windows.Web.Http.HttpResponseMessage")
@js.native
/** Initializes a new instance of the HttpResponseMessage class. */
class HttpResponseMessage ()
  extends typings.winrtUwp.Windows.Web.Http.HttpResponseMessage {
  /**
    * Initializes a new instance of the HttpResponseMessage class with a specific HttpStatusCode .
    * @param statusCode The status code of the HTTP response.
    */
  def this(statusCode: typings.winrtUwp.Windows.Web.Http.HttpStatusCode) = this()
  /** Gets or sets the content of the HTTP response message on the HttpResponseMessage object. */
  /* CompleteClass */
  override var content: IHttpContent = js.native
  /** Gets the collection of HTTP response headers associated with the HttpResponseMessage that were sent by the server. */
  /* CompleteClass */
  override var headers: HttpResponseHeaderCollection = js.native
  /** Gets a value that indicates whether the HTTP response was successful. */
  /* CompleteClass */
  override var isSuccessStatusCode: Boolean = js.native
  /** Gets or sets the reason phrase which typically is sent by servers together with the status code. */
  /* CompleteClass */
  override var reasonPhrase: String = js.native
  /** Gets or sets the request message which led to this response message. */
  /* CompleteClass */
  override var requestMessage: typings.winrtUwp.Windows.Web.Http.HttpRequestMessage = js.native
  /** Gets the source of the data received in the HttpResponseMessage . */
  /* CompleteClass */
  override var source: typings.winrtUwp.Windows.Web.Http.HttpResponseMessageSource = js.native
  /** Gets or sets the status code of the HTTP response. */
  /* CompleteClass */
  override var statusCode: typings.winrtUwp.Windows.Web.Http.HttpStatusCode = js.native
  /** Gets or sets the HTTP protocol version used on the HttpResponseMessage object. */
  /* CompleteClass */
  override var version: typings.winrtUwp.Windows.Web.Http.HttpVersion = js.native
  /** Closes the HttpResponseMessage instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Throws an exception if the IsSuccessStatusCode property for the HTTP response is false.
    * @return The HTTP response if the request was successful.
    */
  /* CompleteClass */
  override def ensureSuccessStatusCode(): typings.winrtUwp.Windows.Web.Http.HttpResponseMessage = js.native
}

