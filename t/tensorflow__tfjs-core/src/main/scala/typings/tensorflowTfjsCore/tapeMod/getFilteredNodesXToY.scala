package typings.tensorflowTfjsCore.tapeMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/tape", "getFilteredNodesXToY")
@js.native
object getFilteredNodesXToY extends js.Object {
  
  def apply(tape: js.Array[TapeNode], xs: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Array[TapeNode] = js.native
}
