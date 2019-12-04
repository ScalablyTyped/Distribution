package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersMergeUnderscoreSerializationMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Add
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Average
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Concatenate
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Dot
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Maximum
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Minimum
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Multiply
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig

  type AddLayerSerialization = BaseLayerSerialization[Add, LayerConfig]
  type AverageLayerSerialization = BaseLayerSerialization[Average, LayerConfig]
  type ConcatenateLayerSerialization = BaseLayerSerialization[Concatenate, ConcatenateLayerConfig]
  type DotLayerSerialization = BaseLayerSerialization[Dot, DotLayerConfig]
  type MaximumLayerSerialization = BaseLayerSerialization[Maximum, LayerConfig]
  type MergeLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */ js.Any
  type MergeLayerSerialization = AddLayerSerialization | MultiplyLayerSerialization | AverageLayerSerialization | MaximumLayerSerialization | MinimumLayerSerialization | ConcatenateLayerSerialization | DotLayerSerialization
  type MinimumLayerSerialization = BaseLayerSerialization[Minimum, LayerConfig]
  type MultiplyLayerSerialization = BaseLayerSerialization[Multiply, LayerConfig]
}
