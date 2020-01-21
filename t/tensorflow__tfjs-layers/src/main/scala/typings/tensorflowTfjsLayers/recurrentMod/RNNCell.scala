package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNNCell")
@js.native
abstract class RNNCell () extends Layer {
  var dropoutMask: Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
  var recurrentDropoutMask: Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
  /**
    * Size(s) of the states.
    * For RNN cells with only a single state, this is a single integer.
    */
  var stateSize: Double | js.Array[Double] = js.native
}

