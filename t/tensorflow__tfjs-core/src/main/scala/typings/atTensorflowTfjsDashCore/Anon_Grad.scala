package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grad[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] extends js.Object {
  var grad: I
  var value: O
}

object Anon_Grad {
  @scala.inline
  def apply[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */](grad: I, value: O): Anon_Grad[O, I] = {
    val __obj = js.Dynamic.literal(grad = grad.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Grad[O, I]]
  }
}

