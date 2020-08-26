package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpaceToBatchNDAttrs extends js.Object {
  var blockShape: js.Array[Double] = js.native
  var paddings: js.Array[js.Array[Double]] = js.native
}

object SpaceToBatchNDAttrs {
  @scala.inline
  def apply(blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): SpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(blockShape = blockShape.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceToBatchNDAttrs]
  }
  @scala.inline
  implicit class SpaceToBatchNDAttrsOps[Self <: SpaceToBatchNDAttrs] (val x: Self) extends AnyVal {
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
    def setPaddingsVarargs(value: js.Array[Double]*): Self = this.set("paddings", js.Array(value :_*))
    @scala.inline
    def setPaddings(value: js.Array[js.Array[Double]]): Self = this.set("paddings", value.asInstanceOf[js.Any])
  }
  
}

