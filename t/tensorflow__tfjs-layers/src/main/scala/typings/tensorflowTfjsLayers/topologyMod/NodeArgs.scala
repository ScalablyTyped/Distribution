package typings.tensorflowTfjsLayers.topologyMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeArgs extends js.Object {
  
  /**
    * A list of layers, the same length as `inputTensors`, the layers from where
    * `inputTensors` originate.
    */
  var inboundLayers: js.Array[Layer] = js.native
  
  /** List of input masks (a mask can be a tensor, or null). */
  var inputMasks: js.Array[Tensor[Rank]] = js.native
  
  /** List of input shape tuples. */
  var inputShapes: Shape | js.Array[Shape] = js.native
  
  /** List of input tensors. */
  var inputTensors: js.Array[SymbolicTensor] = js.native
  
  /**
    * A list of integers, the same length as `inboundLayers`. `nodeIndices[i]` is
    * the origin node of `inputTensors[i]` (necessary since each inbound layer
    * might have several nodes, e.g. if the layer is being shared with a
    * different data stream).
    */
  var nodeIndices: js.Array[Double] = js.native
  
  /**
    * The layer that takes `inputTensors` and turns them into `outputTensors`.
    * (the node gets created when the `call` method of the layer is called).
    */
  var outboundLayer: Layer = js.native
  
  /** List of output masks (a mask can be a tensor, or null). */
  var outputMasks: js.Array[Tensor[Rank]] = js.native
  
  /** List of output shape tuples. */
  var outputShapes: Shape | js.Array[Shape] = js.native
  
  /** List of output tensors. */
  var outputTensors: js.Array[SymbolicTensor] = js.native
  
  /**
    * A list of integers, the same length as `inboundLayers`. `tensorIndices[i]`
    * is the index of `inputTensors[i]` within the output of the inbound layer
    * (necessary since each inbound layer might have multiple tensor outputs,
    * with each one being independently manipulable).
    */
  var tensorIndices: js.Array[Double] = js.native
}
object NodeArgs {
  
  @scala.inline
  def apply(
    inboundLayers: js.Array[Layer],
    inputMasks: js.Array[Tensor[Rank]],
    inputShapes: Shape | js.Array[Shape],
    inputTensors: js.Array[SymbolicTensor],
    nodeIndices: js.Array[Double],
    outboundLayer: Layer,
    outputMasks: js.Array[Tensor[Rank]],
    outputShapes: Shape | js.Array[Shape],
    outputTensors: js.Array[SymbolicTensor],
    tensorIndices: js.Array[Double]
  ): NodeArgs = {
    val __obj = js.Dynamic.literal(inboundLayers = inboundLayers.asInstanceOf[js.Any], inputMasks = inputMasks.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], inputTensors = inputTensors.asInstanceOf[js.Any], nodeIndices = nodeIndices.asInstanceOf[js.Any], outboundLayer = outboundLayer.asInstanceOf[js.Any], outputMasks = outputMasks.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], outputTensors = outputTensors.asInstanceOf[js.Any], tensorIndices = tensorIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeArgs]
  }
  
  @scala.inline
  implicit class NodeArgsOps[Self <: NodeArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInboundLayersVarargs(value: Layer*): Self = this.set("inboundLayers", js.Array(value :_*))
    
    @scala.inline
    def setInboundLayers(value: js.Array[Layer]): Self = this.set("inboundLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMasksVarargs(value: Tensor[Rank]*): Self = this.set("inputMasks", js.Array(value :_*))
    
    @scala.inline
    def setInputMasks(value: js.Array[Tensor[Rank]]): Self = this.set("inputMasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputShapesVarargs(value: (Double | Null | Shape)*): Self = this.set("inputShapes", js.Array(value :_*))
    
    @scala.inline
    def setInputShapes(value: Shape | js.Array[Shape]): Self = this.set("inputShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTensorsVarargs(value: SymbolicTensor*): Self = this.set("inputTensors", js.Array(value :_*))
    
    @scala.inline
    def setInputTensors(value: js.Array[SymbolicTensor]): Self = this.set("inputTensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIndicesVarargs(value: Double*): Self = this.set("nodeIndices", js.Array(value :_*))
    
    @scala.inline
    def setNodeIndices(value: js.Array[Double]): Self = this.set("nodeIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundLayer(value: Layer): Self = this.set("outboundLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputMasksVarargs(value: Tensor[Rank]*): Self = this.set("outputMasks", js.Array(value :_*))
    
    @scala.inline
    def setOutputMasks(value: js.Array[Tensor[Rank]]): Self = this.set("outputMasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputShapesVarargs(value: (Double | Null | Shape)*): Self = this.set("outputShapes", js.Array(value :_*))
    
    @scala.inline
    def setOutputShapes(value: Shape | js.Array[Shape]): Self = this.set("outputShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputTensorsVarargs(value: SymbolicTensor*): Self = this.set("outputTensors", js.Array(value :_*))
    
    @scala.inline
    def setOutputTensors(value: js.Array[SymbolicTensor]): Self = this.set("outputTensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorIndicesVarargs(value: Double*): Self = this.set("tensorIndices", js.Array(value :_*))
    
    @scala.inline
    def setTensorIndices(value: js.Array[Double]): Self = this.set("tensorIndices", value.asInstanceOf[js.Any])
  }
}
