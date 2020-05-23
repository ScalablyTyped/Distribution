package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.Http.Headers.HttpRequestHeaderCollection
import typings.winrtUwp.Windows.Web.Http.IHttpContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP request message including headers. */
@JSGlobal("Windows.Web.Http.HttpRequestMessage")
@js.native
/** Initializes a new instance of the HttpRequestMessage class. */
class HttpRequestMessage ()
  extends typings.winrtUwp.Windows.Web.Http.HttpRequestMessage {
  /**
    * Initializes a new instance of the HttpRequestMessage class with an HTTP method and a request Uri .
    * @param method The HTTP method to perform
    * @param uri The Uri to request.
    */
  def this(method: typings.winrtUwp.Windows.Web.Http.HttpMethod, uri: Uri) = this()
  /** Gets or sets the HTTP content to send to the server on the HttpRequestMessage object. */
  /* CompleteClass */
  override var content: IHttpContent = js.native
  /** Gets the collection of the HTTP request headers associated with the HttpRequestMessage . */
  /* CompleteClass */
  override var headers: HttpRequestHeaderCollection = js.native
  /** Gets or sets the HTTP method to be performed on the request URI. */
  /* CompleteClass */
  override var method: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  /** Gets a set of properties on the HttpRequestMessage instance that are for use by the developer. */
  /* CompleteClass */
  override var properties: IMap[String, _] = js.native
  /** Gets or sets the Uri used for the HttpRequestMessage object. */
  /* CompleteClass */
  override var requestUri: Uri = js.native
  /** Get information about the underlying transport socket used by an HTTP connection. */
  /* CompleteClass */
  override var transportInformation: typings.winrtUwp.Windows.Web.Http.HttpTransportInformation = js.native
  /** Closes the HttpRequestMessage instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

