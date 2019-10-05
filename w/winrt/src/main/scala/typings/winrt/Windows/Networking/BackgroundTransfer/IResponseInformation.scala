package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponseInformation extends js.Object {
  var actualUri: Uri
  var headers: IMapView[String, String]
  var isResumable: Boolean
  var statusCode: Double
}

object IResponseInformation {
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): IResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri, headers = headers, isResumable = isResumable, statusCode = statusCode)
  
    __obj.asInstanceOf[IResponseInformation]
  }
}

