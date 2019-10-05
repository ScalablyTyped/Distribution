package typings.atTensorflowTfjsDashLayers.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "getSourceInputs")
@js.native
object getSourceInputs extends js.Object {
  def apply(tensor: SymbolicTensor): js.Array[SymbolicTensor] = js.native
  def apply(tensor: SymbolicTensor, layer: Layer): js.Array[SymbolicTensor] = js.native
  def apply(tensor: SymbolicTensor, layer: Layer, nodeIndex: Double): js.Array[SymbolicTensor] = js.native
}

