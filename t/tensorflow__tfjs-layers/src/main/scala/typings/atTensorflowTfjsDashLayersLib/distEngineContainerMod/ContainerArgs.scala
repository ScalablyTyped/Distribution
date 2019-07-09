package typings
package atTensorflowTfjsDashLayersLib.distEngineContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerArgs extends js.Object {
  var inputs: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor | js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor]
  var name: js.UndefOr[java.lang.String] = js.undefined
  var outputs: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor | js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor]
}

object ContainerArgs {
  @scala.inline
  def apply(
    inputs: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor | js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor],
    outputs: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor | js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor],
    name: java.lang.String = null
  ): ContainerArgs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ContainerArgs]
  }
}

