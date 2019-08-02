package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adadelta
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adagrad
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adam
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adamax
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Momentum
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RMSProp
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SGD
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatOptimizerUnderscoreConfigMod {
  type AdadeltaSerialization = BaseSerialization[Adadelta, AdadeltaOptimizerConfig]
  type AdagradSerialization = BaseSerialization[Adagrad, AdagradOptimizerConfig]
  type AdamSerialization = BaseSerialization[Adam, AdamOptimizerConfig]
  type AdamaxSerialization = BaseSerialization[Adamax, AdamaxOptimizerConfig]
  type MomentumSerialization = BaseSerialization[Momentum, MomentumOptimizerConfig]
  type OptimizerClassName = /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */ js.Any
  type OptimizerSerialization = AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  type RMSPropSerialization = BaseSerialization[RMSProp, RMSPropOptimizerConfig]
  type SGDSerialization = BaseSerialization[SGD, SGDOptimizerConfig]
}
