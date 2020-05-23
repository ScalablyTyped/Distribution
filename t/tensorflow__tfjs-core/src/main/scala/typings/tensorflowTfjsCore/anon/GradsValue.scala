package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradsValue[O /* <: Tensor[Rank] */] extends js.Object {
  var grads: js.Array[Tensor[Rank]]
  var value: O
}

object GradsValue {
  @scala.inline
  def apply[O](grads: js.Array[Tensor[Rank]], value: O): GradsValue[O] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradsValue[O]]
  }
}

