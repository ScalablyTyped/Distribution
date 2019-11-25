package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatInitializerUnderscoreConfigMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Constant
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Identity
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Ones
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Orthogonal
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RandomNormal
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RandomUniform
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.TruncatedNormal
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.VarianceScaling
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Zeros
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type ConstantSerialization = BaseSerialization[Constant, ConstantConfig]
  type IdentitySerialization = BaseSerialization[Identity, IdentityConfig]
  type InitializerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */ js.Any
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  type OnesSerialization = BaseSerialization[Ones, js.Object]
  type OrthogonalSerialization = BaseSerialization[Orthogonal, OrthogonalConfig]
  type RandomNormalSerialization = BaseSerialization[RandomNormal, RandomNormalConfig]
  type RandomUniformSerialization = BaseSerialization[RandomUniform, RandomUniformConfig]
  type TruncatedNormalSerialization = BaseSerialization[TruncatedNormal, TruncatedNormalConfig]
  type VarianceScalingSerialization = BaseSerialization[VarianceScaling, VarianceScalingConfig]
  type ZerosSerialization = BaseSerialization[Zeros, js.Object]
}
