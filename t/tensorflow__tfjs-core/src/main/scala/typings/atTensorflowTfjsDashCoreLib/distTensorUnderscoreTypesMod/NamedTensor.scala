package typings
package atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTensor extends js.Object {
  var name: java.lang.String
  var tensor: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
}

object NamedTensor {
  @scala.inline
  def apply(
    name: java.lang.String,
    tensor: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): NamedTensor = {
    val __obj = js.Dynamic.literal(name = name, tensor = tensor)
  
    __obj.asInstanceOf[NamedTensor]
  }
}

