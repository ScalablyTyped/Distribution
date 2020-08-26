package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result a request for unconstrained transfers from a BackgroundDownloader or BackgroundUploader object. */
@js.native
trait UnconstrainedTransferRequestResult extends js.Object {
  /** Gets a value that indicates if the download or upload operations will run without the resource restrictions normally associated with background network operations while a device running on battery. */
  var isUnconstrained: Boolean = js.native
}

object UnconstrainedTransferRequestResult {
  @scala.inline
  def apply(isUnconstrained: Boolean): UnconstrainedTransferRequestResult = {
    val __obj = js.Dynamic.literal(isUnconstrained = isUnconstrained.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnconstrainedTransferRequestResult]
  }
  @scala.inline
  implicit class UnconstrainedTransferRequestResultOps[Self <: UnconstrainedTransferRequestResult] (val x: Self) extends AnyVal {
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
    def setIsUnconstrained(value: Boolean): Self = this.set("isUnconstrained", value.asInstanceOf[js.Any])
  }
  
}

