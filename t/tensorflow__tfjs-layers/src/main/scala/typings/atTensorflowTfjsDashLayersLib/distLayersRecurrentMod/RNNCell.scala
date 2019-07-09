package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNNCell")
@js.native
abstract class RNNCell ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  var dropoutMask: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  var recurrentDropoutMask: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  /**
    * Size(s) of the states.
    * For RNN cells with only a single state, this is a single integer.
    */
  var stateSize: scala.Double | js.Array[scala.Double] = js.native
}

