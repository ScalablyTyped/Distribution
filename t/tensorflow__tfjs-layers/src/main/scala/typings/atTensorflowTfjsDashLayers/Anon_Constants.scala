package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constants extends js.Object {
  var constants: js.Array[SymbolicTensor | Tensor[Rank]]
  var initialState: js.Array[SymbolicTensor | Tensor[Rank]]
  var inputs: Tensor[Rank] | SymbolicTensor
}

object Anon_Constants {
  @scala.inline
  def apply(
    constants: js.Array[SymbolicTensor | Tensor[Rank]],
    initialState: js.Array[SymbolicTensor | Tensor[Rank]],
    inputs: Tensor[Rank] | SymbolicTensor
  ): Anon_Constants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Constants]
  }
}

