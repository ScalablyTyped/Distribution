package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indices[T /* <: Tensor[Rank] */] extends js.Object {
  var indices: T
  var values: T
}

object Indices {
  @scala.inline
  def apply[T](indices: T, values: T): Indices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices[T]]
  }
}

