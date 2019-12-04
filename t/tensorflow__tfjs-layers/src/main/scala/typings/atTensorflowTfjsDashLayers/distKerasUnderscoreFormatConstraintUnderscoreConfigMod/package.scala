package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatConstraintUnderscoreConfigMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MaxNorm
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MinMaxNorm
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.NonNeg
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.UnitNorm
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type ConstraintClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */ js.Any
  type ConstraintSerialization = MaxNormSerialization | NonNegSerialization | UnitNormSerialization | MinMaxNormSerialization
  type MaxNormSerialization = BaseSerialization[MaxNorm, MaxNormConfig]
  type MinMaxNormSerialization = BaseSerialization[MinMaxNorm, MinMaxNormConfig]
  type NonNegSerialization = BaseSerialization[NonNeg, Null]
  type UnitNormSerialization = BaseSerialization[UnitNorm, UnitNormConfig]
}
