package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersWrappersUnderscoreSerializationMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Bidirectional
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.TimeDistributed
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization

  type BidirectionalLayerSerialization = BaseLayerSerialization[Bidirectional, BidirectionalLayerConfig]
  type TimeDistributedLayerSerialization = BaseLayerSerialization[TimeDistributed, TimeDistributedLayerConfig]
  type WrapperLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */ js.Any
  type WrapperLayerSerialization = TimeDistributedLayerSerialization | BidirectionalLayerSerialization
}
