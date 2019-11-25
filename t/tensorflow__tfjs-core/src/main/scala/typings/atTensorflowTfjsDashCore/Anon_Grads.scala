package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grads[T /* <: Tensor[Rank] */] extends js.Object {
  var grads: js.Array[Tensor[Rank]]
  var value: T
}

object Anon_Grads {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: T): Anon_Grads[T] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Grads[T]]
  }
}

