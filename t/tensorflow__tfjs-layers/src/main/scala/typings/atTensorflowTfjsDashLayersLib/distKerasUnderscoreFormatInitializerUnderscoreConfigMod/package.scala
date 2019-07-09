package typings
package atTensorflowTfjsDashLayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatInitializerUnderscoreConfigMod {
  type ConstantSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.Constant, 
    ConstantConfig
  ]
  type IdentitySerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.Identity, 
    IdentityConfig
  ]
  type InitializerClassName = /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */ js.Any
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  type OnesSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.Ones, js.Object]
  type OrthogonalSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.Orthogonal, 
    OrthogonalConfig
  ]
  type RandomNormalSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.RandomNormal, 
    RandomNormalConfig
  ]
  type RandomUniformSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.RandomUniform, 
    RandomUniformConfig
  ]
  type TruncatedNormalSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.TruncatedNormal, 
    TruncatedNormalConfig
  ]
  type VarianceScalingSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.VarianceScaling, 
    VarianceScalingConfig
  ]
  type ZerosSerialization = atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.BaseSerialization[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.Zeros, 
    js.Object
  ]
}
