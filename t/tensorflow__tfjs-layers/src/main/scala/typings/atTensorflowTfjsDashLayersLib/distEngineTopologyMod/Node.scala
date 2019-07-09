package typings
package atTensorflowTfjsDashLayersLib.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "Node")
@js.native
class Node protected () extends js.Object {
  def this(args: NodeArgs) = this()
  def this(args: NodeArgs, callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs) = this()
  var callArgs: js.UndefOr[atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs] = js.native
  val id: scala.Double = js.native
  /**
    * A list of layers, the same length as `inputTensors`, the layers from where
    * `inputTensors` originate.
    */
  var inboundLayers: js.Array[Layer] = js.native
  /** List of input masks (a mask can be a tensor, or null). */
  var inputMasks: js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  /** List of input shape tuples. */
  var inputShapes: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape | js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape] = js.native
  /** List of input tensors. */
  var inputTensors: js.Array[SymbolicTensor] = js.native
  /**
    * A list of integers, the same length as `inboundLayers`. `nodeIndices[i]` is
    * the origin node of `inputTensors[i]` (necessary since each inbound layer
    * might have several nodes, e.g. if the layer is being shared with a
    * different data stream).
    */
  var nodeIndices: js.Array[scala.Double] = js.native
  /**
    * The layer that takes `inputTensors` and turns them into `outputTensors`
    * (the node gets created when the `call` method of the layer is called).
    */
  var outboundLayer: Layer = js.native
  /** List of output masks (a mask can be a tensor, or null). */
  var outputMasks: js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  /** List of output shape tuples. */
  var outputShapes: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape | js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape] = js.native
  /** List of output tensors. */
  var outputTensors: js.Array[SymbolicTensor] = js.native
  /**
    * A list of integers, the same length as `inboundLayers`. `tensorIndices[i]`
    * is the index of `inputTensors[i]` within the output of the inbound layer
    * (necessary since each inbound layer might have multiple tensor outputs,
    * with each one being independently manipulable).
    */
  var tensorIndices: js.Array[scala.Double] = js.native
  def getConfig(): atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict = js.native
}

