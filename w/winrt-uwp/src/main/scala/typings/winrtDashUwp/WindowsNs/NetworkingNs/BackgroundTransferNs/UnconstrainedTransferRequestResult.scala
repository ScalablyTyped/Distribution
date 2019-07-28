package typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result a request for unconstrained transfers from a BackgroundDownloader or BackgroundUploader object. */
@JSGlobal("Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult")
@js.native
abstract class UnconstrainedTransferRequestResult () extends js.Object {
  /** Gets a value that indicates if the download or upload operations will run without the resource restrictions normally associated with background network operations while a device running on battery. */
  var isUnconstrained: Boolean = js.native
}

