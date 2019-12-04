package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersAdvancedUnderscoreActivationUnderscoreSerializationMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.ELU
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.LeakyReLU
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.PReLU
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.ReLU
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Softmax
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.ThresholdedReLU
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization

  type AdvancedActivationLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization.AdvancedActivationLayerSerialization['class_name'] */ js.Any
  type AdvancedActivationLayerSerialization = ReLULayerSerialization | LeakyReLULayerSerialization | PReLULayerSerialization | ELULayerSerialization | ThresholdedReLULayerSerialization | SoftmaxLayerSerialization
  type ELULayerSerialization = BaseLayerSerialization[ELU, ELULayerConfig]
  type LeakyReLULayerSerialization = BaseLayerSerialization[LeakyReLU, LeakyReLULayerConfig]
  type PReLULayerSerialization = BaseLayerSerialization[PReLU, PReLULayerConfig]
  type ReLULayerSerialization = BaseLayerSerialization[ReLU, ReLULayerConfig]
  type SoftmaxLayerSerialization = BaseLayerSerialization[Softmax, SoftmaxLayerConfig]
  type ThresholdedReLULayerSerialization = BaseLayerSerialization[ThresholdedReLU, ThresholdedReLULayerConfig]
}
