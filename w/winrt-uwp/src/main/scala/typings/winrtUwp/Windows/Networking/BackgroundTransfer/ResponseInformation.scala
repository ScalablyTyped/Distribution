package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data that is returned by a server response. */
@js.native
trait ResponseInformation extends js.Object {
  /** Gets the URI that contains the requested data. */
  var actualUri: Uri = js.native
  /** Gets all response headers sent by the server. */
  var headers: IMapView[String, String] = js.native
  /** Gets a value that specifies whether the download is resumable. */
  var isResumable: Boolean = js.native
  /** Gets the status code returned by the server. */
  var statusCode: Double = js.native
}

object ResponseInformation {
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): ResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
  @scala.inline
  implicit class ResponseInformationOps[Self <: ResponseInformation] (val x: Self) extends AnyVal {
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
    def setActualUri(value: Uri): Self = this.set("actualUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: IMapView[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResumable(value: Boolean): Self = this.set("isResumable", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

