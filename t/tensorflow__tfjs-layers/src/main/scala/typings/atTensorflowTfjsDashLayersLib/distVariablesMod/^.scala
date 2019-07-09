package typings
package atTensorflowTfjsDashLayersLib.distVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/variables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def batchGetValue(xs: js.Array[LayerVariable]): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def batchSetValue(
    variablesAndValues: js.Array[
      js.Tuple2[
        LayerVariable, 
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]
    ]
  ): scala.Unit = js.native
  def eyeVariable(size: scala.Double): LayerVariable = js.native
  def eyeVariable(size: scala.Double, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): LayerVariable = js.native
  def eyeVariable(
    size: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String
  ): LayerVariable = js.native
  def gradients(
    lossFn: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar],
    variables: js.Array[LayerVariable]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def onesLike(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): LayerVariable = js.native
  def onesLike(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def onesLike(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String
  ): LayerVariable = js.native
  def onesVariable(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): LayerVariable = js.native
  def onesVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def onesVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String
  ): LayerVariable = js.native
  def randomNormalVariable(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): LayerVariable = js.native
  def randomNormalVariable(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, mean: scala.Double): LayerVariable = js.native
  def randomNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double
  ): LayerVariable = js.native
  def randomNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def randomNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    seed: scala.Double
  ): LayerVariable = js.native
  def randomNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    seed: scala.Double,
    name: java.lang.String
  ): LayerVariable = js.native
  def randomUniformVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    minval: scala.Double,
    maxval: scala.Double
  ): LayerVariable = js.native
  def randomUniformVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    minval: scala.Double,
    maxval: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def randomUniformVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    minval: scala.Double,
    maxval: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    seed: scala.Double
  ): LayerVariable = js.native
  def randomUniformVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    minval: scala.Double,
    maxval: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    seed: scala.Double,
    name: java.lang.String
  ): LayerVariable = js.native
  def truncatedNormalVariable(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): LayerVariable = js.native
  def truncatedNormalVariable(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, mean: scala.Double): LayerVariable = js.native
  def truncatedNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double
  ): LayerVariable = js.native
  def truncatedNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def truncatedNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    seed: scala.Double
  ): LayerVariable = js.native
  def truncatedNormalVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    mean: scala.Double,
    stddev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    seed: scala.Double,
    name: java.lang.String
  ): LayerVariable = js.native
  def update(
    x: LayerVariable,
    xNew: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): LayerVariable = js.native
  def updateAdd(
    x: LayerVariable,
    increment: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): LayerVariable = js.native
  def updateSub(
    x: LayerVariable,
    decrement: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): LayerVariable = js.native
  def variable(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): LayerVariable = js.native
  def variable(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def variable(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String
  ): LayerVariable = js.native
  def variable(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String,
    constraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ): LayerVariable = js.native
  def zerosLike(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): LayerVariable = js.native
  def zerosLike(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def zerosLike(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String
  ): LayerVariable = js.native
  def zerosVariable(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): LayerVariable = js.native
  def zerosVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): LayerVariable = js.native
  def zerosVariable(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String
  ): LayerVariable = js.native
}

