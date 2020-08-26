package typings.tensorflowTfjsCore.segmentUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatherOpShapeInfo extends js.Object {
  var batchSize: Double = js.native
  var dimSize: Double = js.native
  var outputShape: js.Array[Double] = js.native
  var sliceSize: Double = js.native
}

object GatherOpShapeInfo {
  @scala.inline
  def apply(batchSize: Double, dimSize: Double, outputShape: js.Array[Double], sliceSize: Double): GatherOpShapeInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dimSize = dimSize.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatherOpShapeInfo]
  }
  @scala.inline
  implicit class GatherOpShapeInfoOps[Self <: GatherOpShapeInfo] (val x: Self) extends AnyVal {
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
    def setDimSize(value: Double): Self = this.set("dimSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputShapeVarargs(value: Double*): Self = this.set("outputShape", js.Array(value :_*))
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = this.set("outputShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSliceSize(value: Double): Self = this.set("sliceSize", value.asInstanceOf[js.Any])
  }
  
}

