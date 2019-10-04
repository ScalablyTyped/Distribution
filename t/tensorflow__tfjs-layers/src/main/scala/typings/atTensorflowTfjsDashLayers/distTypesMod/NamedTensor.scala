package typings.atTensorflowTfjsDashLayers.distTypesMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
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
    val __obj = js.Dynamic.literal(name = name, tensor = tensor)
  
    __obj.asInstanceOf[NamedTensor]
  }
}

