package typings
package atTensorflowTfjsDashLayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatOptimizerUnderscoreConfigMod {
  type AdadeltaSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.AdadeltaOptimizer, 
    AdadeltaOptimizerConfig
  ]
  type AdagradSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.AdagradOptimizer, 
    AdagradOptimizerConfig
  ]
  type AdamSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.AdamOptimizer, 
    AdamOptimizerConfig
  ]
  type AdamaxSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.AdamaxOptimizer, 
    AdamaxOptimizerConfig
  ]
  type MomentumSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.MomentumOptimizer, 
    MomentumOptimizerConfig
  ]
  type OptimizerClassName = /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */ js.Any
  type OptimizerSerialization = AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  type RMSPropSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.RMSPropOptimizer, 
    RMSPropOptimizerConfig
  ]
  type SGDSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.SGDOptimizer, 
    SGDOptimizerConfig
  ]
}
