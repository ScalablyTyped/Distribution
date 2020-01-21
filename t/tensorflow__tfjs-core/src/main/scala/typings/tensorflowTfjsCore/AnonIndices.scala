package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndices[T /* <: Tensor[Rank] */] extends js.Object {
  var indices: T
  var values: T
}

object AnonIndices {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](indices: T, values: T): AnonIndices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndices[T]]
  }
}

