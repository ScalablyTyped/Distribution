package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersCoreUnderscoreSerializationMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Activation
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Dense
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Dropout
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Flatten
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Masking
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Permute
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RepeatVector
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Reshape
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig

  type ActivationLayerSerialization = BaseLayerSerialization[Activation, ActivationLayerConfig]
  type CoreLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization.CoreLayerSerialization['class_name'] */ js.Any
  type CoreLayerSerialization = DropoutLayerSerialization | DenseLayerSerialization | FlattenLayerSerialization | ActivationLayerSerialization | RepeatVectorLayerSerialization | ReshapeLayerSerialization | PermuteLayerSerialization | MaskingLayerSerialization
  type DenseLayerSerialization = BaseLayerSerialization[Dense, DenseLayerConfig]
  type DropoutLayerSerialization = BaseLayerSerialization[Dropout, DropoutLayerConfig]
  type FlattenLayerSerialization = BaseLayerSerialization[Flatten, LayerConfig]
  type MaskingLayerSerialization = BaseLayerSerialization[Masking, MaskingLayerConfig]
  type PermuteLayerSerialization = BaseLayerSerialization[Permute, PermuteLayerConfig]
  type RepeatVectorLayerSerialization = BaseLayerSerialization[RepeatVector, RepeatVectorLayerConfig]
  type ReshapeLayerSerialization = BaseLayerSerialization[Reshape, ReshapeLayerConfig]
}
