package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.Http.Headers.HttpRequestHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP request message including headers. */
trait HttpRequestMessage extends js.Object {
  /** Gets or sets the HTTP content to send to the server on the HttpRequestMessage object. */
  var content: IHttpContent
  /** Gets the collection of the HTTP request headers associated with the HttpRequestMessage . */
  var headers: HttpRequestHeaderCollection
  /** Gets or sets the HTTP method to be performed on the request URI. */
  var method: HttpMethod
  /** Gets a set of properties on the HttpRequestMessage instance that are for use by the developer. */
  var properties: IMap[String, _]
  /** Gets or sets the Uri used for the HttpRequestMessage object. */
  var requestUri: Uri
  /** Get information about the underlying transport socket used by an HTTP connection. */
  var transportInformation: HttpTransportInformation
  /** Closes the HttpRequestMessage instance and releases allocated resources. */
  def close(): Unit
}

object HttpRequestMessage {
  @scala.inline
  def apply(
    close: () => Unit,
    content: IHttpContent,
    headers: HttpRequestHeaderCollection,
    method: HttpMethod,
    properties: IMap[String, _],
    requestUri: Uri,
    transportInformation: HttpTransportInformation
  ): HttpRequestMessage = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], requestUri = requestUri.asInstanceOf[js.Any], transportInformation = transportInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestMessage]
  }
}

