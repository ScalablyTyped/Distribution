package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadCastToAttrs extends js.Object {
  var inputShape: js.Array[Double]
  var shape: js.Array[Double]
}

object BroadCastToAttrs {
  @scala.inline
  def apply(inputShape: js.Array[Double], shape: js.Array[Double]): BroadCastToAttrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadCastToAttrs]
  }
}

