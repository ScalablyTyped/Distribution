package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object initializerConfigMod {
  
  type ConstantSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant, 
    typings.tensorflowTfjsLayers.initializerConfigMod.ConstantConfig
  ]
  
  type IdentitySerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity, 
    typings.tensorflowTfjsLayers.initializerConfigMod.IdentityConfig
  ]
  
  type InitializerSerialization = typings.tensorflowTfjsLayers.initializerConfigMod.ZerosSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.OnesSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.ConstantSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.RandomUniformSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.RandomNormalSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.IdentitySerialization | typings.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingSerialization | typings.tensorflowTfjsLayers.initializerConfigMod.OrthogonalSerialization
  
  type OnesSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones, js.Object]
  
  type OrthogonalSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal, 
    typings.tensorflowTfjsLayers.initializerConfigMod.OrthogonalConfig
  ]
  
  type RandomNormalSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal, 
    typings.tensorflowTfjsLayers.initializerConfigMod.RandomNormalConfig
  ]
  
  type RandomUniformSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform, 
    typings.tensorflowTfjsLayers.initializerConfigMod.RandomUniformConfig
  ]
  
  type TruncatedNormalSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal, 
    typings.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalConfig
  ]
  
  type VarianceScalingSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling, 
    typings.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingConfig
  ]
  
  type ZerosSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros, js.Object]
}
