package typings.tensorflowTfjsLayers.convolutionalRecurrentMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.recurrentMod.LSTMCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tensorflowTfjsCore.serializationMod.Serializable because Already inherited
- typings.tensorflowTfjsCore.baseMod.serialization.Serializable because Already inherited
- typings.tensorflowTfjsCore.mod.serialization.Serializable because Already inherited
- typings.tensorflowTfjsLayers.topologyMod.Layer because Already inherited
- typings.tensorflowTfjsLayers.recurrentMod.RNNCell because Already inherited
- typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvRNN2DCell because var conflicts: _addedWeightNames, _built, _callHook, _losses, _nonTrainableWeights, _refCount, _stateful, _trainableWeights, _updates, activityRegularizer, addInboundNode, batchInputShape, built, dropoutMask, dtype, fastWeightInitDuringBuild, getNodeAtIndex, inboundNodes, initialWeights, inputSpec, name, nonTrainableWeights, outboundNodes, recurrentDropoutMask, stateSize, supportsMasking, trainable, trainableWeights, trainable_. Inlined filters, kernelSize, strides, padding, dataFormat, dilationRate */ @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell")
@js.native
class ConvLSTM2DCell protected () extends LSTMCell {
  def this(args: ConvLSTM2DCellArgs) = this()
  
  val dataFormat: DataFormat = js.native
  
  val dilationRate: js.Array[Double] = js.native
  
  val filters: Double = js.native
  
  def inputConv(x: Tensor[Rank], w: Tensor[Rank]): Tensor[R3] = js.native
  def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: js.UndefOr[scala.Nothing], padding: PaddingMode): Tensor[R3] = js.native
  def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Tensor[Rank]): Tensor[R3] = js.native
  def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Tensor[Rank], padding: PaddingMode): Tensor[R3] = js.native
  
  val kernelSize: js.Array[Double] = js.native
  
  val padding: PaddingMode = js.native
  
  def recurrentConv(x: Tensor[Rank], w: Tensor[Rank]): Tensor[R3] = js.native
  
  val strides: js.Array[Double] = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell")
@js.native
object ConvLSTM2DCell extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
