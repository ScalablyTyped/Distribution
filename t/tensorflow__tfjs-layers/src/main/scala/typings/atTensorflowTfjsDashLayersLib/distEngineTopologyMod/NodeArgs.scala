package typings
package atTensorflowTfjsDashLayersLib.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeArgs extends js.Object {
  /**
    * A list of layers, the same length as `inputTensors`, the layers from where
    * `inputTensors` originate.
    */
  var inboundLayers: js.Array[Layer]
  /** List of input masks (a mask can be a tensor, or null). */
  var inputMasks: js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  /** List of input shape tuples. */
  var inputShapes: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape | js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape]
  /** List of input tensors. */
  var inputTensors: js.Array[SymbolicTensor]
  /**
    * A list of integers, the same length as `inboundLayers`. `nodeIndices[i]` is
    * the origin node of `inputTensors[i]` (necessary since each inbound layer
    * might have several nodes, e.g. if the layer is being shared with a
    * different data stream).
    */
  var nodeIndices: js.Array[scala.Double]
  /**
    * The layer that takes `inputTensors` and turns them into `outputTensors`.
    * (the node gets created when the `call` method of the layer is called).
    */
  var outboundLayer: Layer
  /** List of output masks (a mask can be a tensor, or null). */
  var outputMasks: js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  /** List of output shape tuples. */
  var outputShapes: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape | js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape]
  /** List of output tensors. */
  var outputTensors: js.Array[SymbolicTensor]
  /**
    * A list of integers, the same length as `inboundLayers`. `tensorIndices[i]`
    * is the index of `inputTensors[i]` within the output of the inbound layer
    * (necessary since each inbound layer might have multiple tensor outputs,
    * with each one being independently manipulable).
    */
  var tensorIndices: js.Array[scala.Double]
}

object NodeArgs {
  @scala.inline
  def apply(
    inboundLayers: js.Array[Layer],
    inputMasks: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    inputShapes: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape | js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    inputTensors: js.Array[SymbolicTensor],
    nodeIndices: js.Array[scala.Double],
    outboundLayer: Layer,
    outputMasks: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    outputShapes: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape | js.Array[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape],
    outputTensors: js.Array[SymbolicTensor],
    tensorIndices: js.Array[scala.Double]
  ): NodeArgs = {
    val __obj = js.Dynamic.literal(inboundLayers = inboundLayers, inputMasks = inputMasks, inputShapes = inputShapes.asInstanceOf[js.Any], inputTensors = inputTensors, nodeIndices = nodeIndices, outboundLayer = outboundLayer, outputMasks = outputMasks, outputShapes = outputShapes.asInstanceOf[js.Any], outputTensors = outputTensors, tensorIndices = tensorIndices)
  
    __obj.asInstanceOf[NodeArgs]
  }
}

