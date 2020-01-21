package typings.tensorflowTfjsLayers.executorMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var key: SymbolicTensor
  var value: Tensor_[Rank]
}

object Feed {
  @scala.inline
  def apply(key: SymbolicTensor, value: Tensor_[Rank]): Feed = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Feed]
  }
}

