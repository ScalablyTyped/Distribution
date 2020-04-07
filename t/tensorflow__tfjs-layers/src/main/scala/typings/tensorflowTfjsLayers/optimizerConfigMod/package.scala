package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optimizerConfigMod {
  type AdadeltaSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.AdadeltaOptimizerConfig
  ]
  type AdagradSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.AdagradOptimizerConfig
  ]
  type AdamSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.AdamOptimizerConfig
  ]
  type AdamaxSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.AdamaxOptimizerConfig
  ]
  type MomentumSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.MomentumOptimizerConfig
  ]
  type OptimizerSerialization = typings.tensorflowTfjsLayers.optimizerConfigMod.AdadeltaSerialization | typings.tensorflowTfjsLayers.optimizerConfigMod.AdagradSerialization | typings.tensorflowTfjsLayers.optimizerConfigMod.AdamSerialization | typings.tensorflowTfjsLayers.optimizerConfigMod.AdamaxSerialization | typings.tensorflowTfjsLayers.optimizerConfigMod.MomentumSerialization | typings.tensorflowTfjsLayers.optimizerConfigMod.RMSPropSerialization | typings.tensorflowTfjsLayers.optimizerConfigMod.SGDSerialization
  type RMSPropSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.RMSPropOptimizerConfig
  ]
  type SGDSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD, 
    typings.tensorflowTfjsLayers.optimizerConfigMod.SGDOptimizerConfig
  ]
}
