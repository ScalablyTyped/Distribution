package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGradsValue[O /* <: Tensor[Rank] */] extends js.Object {
  var grads: js.Array[Tensor[Rank]]
  var value: O
}

object AnonGradsValue {
  @scala.inline
  def apply[O /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: O): AnonGradsValue[O] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGradsValue[O]]
  }
}

