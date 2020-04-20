package typings.tensorflowTfjsCore.tensorTypesMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTensor extends js.Object {
  var name: String
  var tensor: Tensor[Rank]
}

object NamedTensor {
  @scala.inline
  def apply(name: String, tensor: Tensor[Rank]): NamedTensor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tensor = tensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTensor]
  }
}

