package typings.winrtUwp.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.Http.Headers.HttpRequestHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP request message including headers. */
@js.native
trait HttpRequestMessage extends js.Object {
  /** Gets or sets the HTTP content to send to the server on the HttpRequestMessage object. */
  var content: IHttpContent = js.native
  /** Gets the collection of the HTTP request headers associated with the HttpRequestMessage . */
  var headers: HttpRequestHeaderCollection = js.native
  /** Gets or sets the HTTP method to be performed on the request URI. */
  var method: HttpMethod = js.native
  /** Gets a set of properties on the HttpRequestMessage instance that are for use by the developer. */
  var properties: IMap[String, _] = js.native
  /** Gets or sets the Uri used for the HttpRequestMessage object. */
  var requestUri: Uri = js.native
  /** Get information about the underlying transport socket used by an HTTP connection. */
  var transportInformation: HttpTransportInformation = js.native
  /** Closes the HttpRequestMessage instance and releases allocated resources. */
  def close(): Unit = js.native
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
  @scala.inline
  implicit class HttpRequestMessageOps[Self <: HttpRequestMessage] (val x: Self) extends AnyVal {
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
    def setHeaders(value: HttpRequestHeaderCollection): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: HttpMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IMap[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestUri(value: Uri): Self = this.set("requestUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportInformation(value: HttpTransportInformation): Self = this.set("transportInformation", value.asInstanceOf[js.Any])
  }
  
}

