package typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNNCell")
@js.native
abstract class RNNCell () extends Layer {
  var dropoutMask: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  var recurrentDropoutMask: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * Size(s) of the states.
    * For RNN cells with only a single state, this is a single integer.
    */
  var stateSize: Double | js.Array[Double] = js.native
}

