package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchToSpaceNDAttrs extends js.Object {
  var blockShape: js.Array[Double] = js.native
  var crops: js.Array[js.Array[Double]] = js.native
}

object BatchToSpaceNDAttrs {
  @scala.inline
  def apply(blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): BatchToSpaceNDAttrs = {
    val __obj = js.Dynamic.literal(blockShape = blockShape.asInstanceOf[js.Any], crops = crops.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchToSpaceNDAttrs]
  }
  @scala.inline
  implicit class BatchToSpaceNDAttrsOps[Self <: BatchToSpaceNDAttrs] (val x: Self) extends AnyVal {
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
    def setBlockShapeVarargs(value: Double*): Self = this.set("blockShape", js.Array(value :_*))
    @scala.inline
    def setBlockShape(value: js.Array[Double]): Self = this.set("blockShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropsVarargs(value: js.Array[Double]*): Self = this.set("crops", js.Array(value :_*))
    @scala.inline
    def setCrops(value: js.Array[js.Array[Double]]): Self = this.set("crops", value.asInstanceOf[js.Any])
  }
  
}

