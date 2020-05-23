package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data that is returned by a server response. */
trait ResponseInformation extends js.Object {
  /** Gets the URI that contains the requested data. */
  var actualUri: Uri
  /** Gets all response headers sent by the server. */
  var headers: IMapView[String, String]
  /** Gets a value that specifies whether the download is resumable. */
  var isResumable: Boolean
  /** Gets the status code returned by the server. */
  var statusCode: Double
}

object ResponseInformation {
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): ResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
}

