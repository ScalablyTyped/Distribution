package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNNCell")
@js.native
abstract class RNNCell () extends Layer {
  def this(args: LayerArgs) = this()
  
  var dropoutMask: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  
  var recurrentDropoutMask: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  
  /**
    * Size(s) of the states.
    * For RNN cells with only a single state, this is a single integer.
    */
  var stateSize: Double | js.Array[Double] = js.native
}
