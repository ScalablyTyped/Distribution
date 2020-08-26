package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResponseInformation extends js.Object {
  var actualUri: Uri = js.native
  var headers: IMapView[String, String] = js.native
  var isResumable: Boolean = js.native
  var statusCode: Double = js.native
}

object IResponseInformation {
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): IResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseInformation]
  }
  @scala.inline
  implicit class IResponseInformationOps[Self <: IResponseInformation] (val x: Self) extends AnyVal {
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

