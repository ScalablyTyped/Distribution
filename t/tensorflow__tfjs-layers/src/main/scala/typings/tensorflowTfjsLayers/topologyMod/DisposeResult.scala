package typings.tensorflowTfjsLayers.topologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisposeResult extends js.Object {
  /**
    * Number of variables dispose in this dispose call.
    */
  var numDisposedVariables: Double = js.native
  /**
    * Reference count after the dispose call.
    */
  var refCountAfterDispose: Double = js.native
}

object DisposeResult {
  @scala.inline
  def apply(numDisposedVariables: Double, refCountAfterDispose: Double): DisposeResult = {
    val __obj = js.Dynamic.literal(numDisposedVariables = numDisposedVariables.asInstanceOf[js.Any], refCountAfterDispose = refCountAfterDispose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisposeResult]
  }
  @scala.inline
  implicit class DisposeResultOps[Self <: DisposeResult] (val x: Self) extends AnyVal {
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
    def setNumDisposedVariables(value: Double): Self = this.set("numDisposedVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefCountAfterDispose(value: Double): Self = this.set("refCountAfterDispose", value.asInstanceOf[js.Any])
  }
  
}

