package typings.tensorflowTfjsCore.reduceUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduceInfo extends js.Object {
  var batchSize: Double = js.native
  var inSize: Double = js.native
  var windowSize: Double = js.native
}

object ReduceInfo {
  @scala.inline
  def apply(batchSize: Double, inSize: Double, windowSize: Double): ReduceInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduceInfo]
  }
  @scala.inline
  implicit class ReduceInfoOps[Self <: ReduceInfo] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setInSize(value: Double): Self = this.set("inSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowSize(value: Double): Self = this.set("windowSize", value.asInstanceOf[js.Any])
  }
  
}

