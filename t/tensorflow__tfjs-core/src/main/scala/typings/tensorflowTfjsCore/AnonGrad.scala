package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrad[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] extends js.Object {
  var grad: I
  var value: O
}

object AnonGrad {
  @scala.inline
  def apply[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */](grad: I, value: O): AnonGrad[O, I] = {
    val __obj = js.Dynamic.literal(grad = grad.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGrad[O, I]]
  }
}

