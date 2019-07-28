package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dy[T /* <: Tensor[Rank] */] extends js.Object {
  var value: T
  def gradFunc(dy: T, saved: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]]
}

object Anon_Dy {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](gradFunc: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]], value: T): Anon_Dy[T] = {
    val __obj = js.Dynamic.literal(gradFunc = js.Any.fromFunction2(gradFunc), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dy[T]]
  }
}

