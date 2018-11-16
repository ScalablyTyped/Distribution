package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data that is returned by a server response. */
@JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
@js.native
abstract class ResponseInformation () extends js.Object {
  /** Gets the URI that contains the requested data. */
  var actualUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets all response headers sent by the server. */
  var headers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String] = js.native
  /** Gets a value that specifies whether the download is resumable. */
  var isResumable: scala.Boolean = js.native
  /** Gets the status code returned by the server. */
  var statusCode: scala.Double = js.native
}

