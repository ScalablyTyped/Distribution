package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indices[T /* <: Tensor[Rank] */] extends js.Object {
  var indices: T
  var values: T
}

object Anon_Indices {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](indices: T, values: T): Anon_Indices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Indices[T]]
  }
}

