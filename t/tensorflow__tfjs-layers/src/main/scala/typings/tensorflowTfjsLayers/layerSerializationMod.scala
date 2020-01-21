package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.advancedActivationSerializationMod.AdvancedActivationLayerSerialization
import typings.tensorflowTfjsLayers.convolutionalDepthwiseSerializationMod.ConvolutionalDepthwiseLayerSerialization
import typings.tensorflowTfjsLayers.convolutionalSerializationMod.ConvolutionalLayerSerialization
import typings.tensorflowTfjsLayers.coreSerializationMod.CoreLayerSerialization
import typings.tensorflowTfjsLayers.embeddingsSerializationMod.EmbeddingLayerSerialization
import typings.tensorflowTfjsLayers.inputConfigMod.InputLayerSerialization
import typings.tensorflowTfjsLayers.mergeSerializationMod.MergeLayerSerialization
import typings.tensorflowTfjsLayers.normalizationSerializationMod.NormalizationLayerSerialization
import typings.tensorflowTfjsLayers.paddingSerializationMod.PaddingLayerSerialization
import typings.tensorflowTfjsLayers.poolingSerializationMod.PoolingLayerSerialization
import typings.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/layer_serialization", JSImport.Namespace)
@js.native
object layerSerializationMod extends js.Object {
  val layerClassNames: js.Array[LayerClassName] = js.native
  type LayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/layer_serialization.LayerSerialization['class_name'] */ js.Any
  type LayerSerialization = AdvancedActivationLayerSerialization | ConvolutionalDepthwiseLayerSerialization | ConvolutionalLayerSerialization | CoreLayerSerialization | EmbeddingLayerSerialization | MergeLayerSerialization | NormalizationLayerSerialization | PaddingLayerSerialization | PoolingLayerSerialization | RecurrentLayerSerialization | InputLayerSerialization
}

