package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConstants extends js.Object {
  var constants: js.Array[SymbolicTensor | Tensor[Rank]]
  var initialState: js.Array[SymbolicTensor | Tensor[Rank]]
  var inputs: Tensor[Rank] | SymbolicTensor
}

object AnonConstants {
  @scala.inline
  def apply(
    constants: js.Array[SymbolicTensor | Tensor[Rank]],
    initialState: js.Array[SymbolicTensor | Tensor[Rank]],
    inputs: Tensor[Rank] | SymbolicTensor
  ): AnonConstants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConstants]
  }
}

