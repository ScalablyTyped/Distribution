package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGradFunc[T /* <: Tensor[Rank] */] extends js.Object {
  var value: T
  def gradFunc(dy: T, saved: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]]
}

object AnonGradFunc {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](gradFunc: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]], value: T): AnonGradFunc[T] = {
    val __obj = js.Dynamic.literal(gradFunc = js.Any.fromFunction2(gradFunc), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGradFunc[T]]
  }
}

