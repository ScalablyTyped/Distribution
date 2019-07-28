package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.AdadeltaOptimizer
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.AdagradOptimizer
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.AdamOptimizer
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.AdamaxOptimizer
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MomentumOptimizer
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RMSPropOptimizer
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SGDOptimizer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatOptimizerUnderscoreConfigMod {
  type AdadeltaSerialization = BaseSerialization[AdadeltaOptimizer, AdadeltaOptimizerConfig]
  type AdagradSerialization = BaseSerialization[AdagradOptimizer, AdagradOptimizerConfig]
  type AdamSerialization = BaseSerialization[AdamOptimizer, AdamOptimizerConfig]
  type AdamaxSerialization = BaseSerialization[AdamaxOptimizer, AdamaxOptimizerConfig]
  type MomentumSerialization = BaseSerialization[MomentumOptimizer, MomentumOptimizerConfig]
  type OptimizerClassName = /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */ js.Any
  type OptimizerSerialization = AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  type RMSPropSerialization = BaseSerialization[RMSPropOptimizer, RMSPropOptimizerConfig]
  type SGDSerialization = BaseSerialization[SGDOptimizer, SGDOptimizerConfig]
}
