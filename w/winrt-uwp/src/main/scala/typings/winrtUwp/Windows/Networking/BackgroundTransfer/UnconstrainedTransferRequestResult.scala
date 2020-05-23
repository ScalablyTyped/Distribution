package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result a request for unconstrained transfers from a BackgroundDownloader or BackgroundUploader object. */
trait UnconstrainedTransferRequestResult extends js.Object {
  /** Gets a value that indicates if the download or upload operations will run without the resource restrictions normally associated with background network operations while a device running on battery. */
  var isUnconstrained: Boolean
}

object UnconstrainedTransferRequestResult {
  @scala.inline
  def apply(isUnconstrained: Boolean): UnconstrainedTransferRequestResult = {
    val __obj = js.Dynamic.literal(isUnconstrained = isUnconstrained.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnconstrainedTransferRequestResult]
  }
}

