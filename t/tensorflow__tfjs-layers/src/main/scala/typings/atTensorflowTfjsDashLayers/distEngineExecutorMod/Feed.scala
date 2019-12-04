package typings.atTensorflowTfjsDashLayers.distEngineExecutorMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var key: SymbolicTensor
  var value: Tensor[Rank]
}

object Feed {
  @scala.inline
  def apply(key: SymbolicTensor, value: Tensor[Rank]): Feed = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Feed]
  }
}

