package typings.atTensorflowTfjsDashLayers.distEngineContainerMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerArgs extends js.Object {
  var inputs: SymbolicTensor | js.Array[SymbolicTensor]
  var name: js.UndefOr[String] = js.undefined
  var outputs: SymbolicTensor | js.Array[SymbolicTensor]
}

object ContainerArgs {
  @scala.inline
  def apply(
    inputs: SymbolicTensor | js.Array[SymbolicTensor],
    outputs: SymbolicTensor | js.Array[SymbolicTensor],
    name: String = null
  ): ContainerArgs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ContainerArgs]
  }
}

