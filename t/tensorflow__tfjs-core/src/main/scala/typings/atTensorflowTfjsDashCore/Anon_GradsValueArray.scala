package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GradsValueArray[O /* <: Tensor[Rank] */] extends js.Object {
  var grads: js.Array[Tensor[Rank]]
  var value: O
}

object Anon_GradsValueArray {
  @scala.inline
  def apply[O /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: O): Anon_GradsValueArray[O] = {
    val __obj = js.Dynamic.literal(grads = grads, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GradsValueArray[O]]
  }
}

