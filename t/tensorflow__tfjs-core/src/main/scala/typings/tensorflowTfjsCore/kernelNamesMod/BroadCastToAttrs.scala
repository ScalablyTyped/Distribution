package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadCastToAttrs extends js.Object {
  var inputShape: js.Array[Double] = js.native
  var shape: js.Array[Double] = js.native
}

object BroadCastToAttrs {
  @scala.inline
  def apply(inputShape: js.Array[Double], shape: js.Array[Double]): BroadCastToAttrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadCastToAttrs]
  }
  @scala.inline
  implicit class BroadCastToAttrsOps[Self <: BroadCastToAttrs] (val x: Self) extends AnyVal {
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
    def setInputShapeVarargs(value: Double*): Self = this.set("inputShape", js.Array(value :_*))
    @scala.inline
    def setInputShape(value: js.Array[Double]): Self = this.set("inputShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
  
}

