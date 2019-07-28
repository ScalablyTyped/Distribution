package typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data that is returned by a server response. */
@JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
@js.native
abstract class ResponseInformation () extends js.Object {
  /** Gets the URI that contains the requested data. */
  var actualUri: Uri = js.native
  /** Gets all response headers sent by the server. */
  var headers: IMapView[String, String] = js.native
  /** Gets a value that specifies whether the download is resumable. */
  var isResumable: Boolean = js.native
  /** Gets the status code returned by the server. */
  var statusCode: Double = js.native
}

