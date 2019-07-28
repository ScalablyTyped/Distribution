package typings.atTensorflowTfjsDashLayers.distVariablesMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/variables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def batchGetValue(xs: js.Array[LayerVariable]): js.Array[Tensor[Rank]] = js.native
  def batchSetValue(variablesAndValues: js.Array[js.Tuple2[LayerVariable, Tensor[Rank]]]): Unit = js.native
  def eyeVariable(size: Double): LayerVariable = js.native
  def eyeVariable(size: Double, dtype: DataType): LayerVariable = js.native
  def eyeVariable(size: Double, dtype: DataType, name: String): LayerVariable = js.native
  def gradients(lossFn: js.Function0[Scalar], variables: js.Array[LayerVariable]): js.Array[Tensor[Rank]] = js.native
  def onesLike(x: Tensor[Rank]): LayerVariable = js.native
  def onesLike(x: Tensor[Rank], dtype: DataType): LayerVariable = js.native
  def onesLike(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = js.native
  def onesVariable(shape: Shape): LayerVariable = js.native
  def onesVariable(shape: Shape, dtype: DataType): LayerVariable = js.native
  def onesVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = js.native
  def randomNormalVariable(shape: Shape): LayerVariable = js.native
  def randomNormalVariable(shape: Shape, mean: Double): LayerVariable = js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double): LayerVariable = js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType): LayerVariable = js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double): LayerVariable = js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType): LayerVariable = js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Double, name: String): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape, mean: Double): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = js.native
  def update(x: LayerVariable, xNew: Tensor[Rank]): LayerVariable = js.native
  def updateAdd(x: LayerVariable, increment: Tensor[Rank]): LayerVariable = js.native
  def updateSub(x: LayerVariable, decrement: Tensor[Rank]): LayerVariable = js.native
  def variable(x: Tensor[Rank]): LayerVariable = js.native
  def variable(x: Tensor[Rank], dtype: DataType): LayerVariable = js.native
  def variable(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = js.native
  def variable(x: Tensor[Rank], dtype: DataType, name: String, constraint: Constraint): LayerVariable = js.native
  def zerosLike(x: Tensor[Rank]): LayerVariable = js.native
  def zerosLike(x: Tensor[Rank], dtype: DataType): LayerVariable = js.native
  def zerosLike(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = js.native
  def zerosVariable(shape: Shape): LayerVariable = js.native
  def zerosVariable(shape: Shape, dtype: DataType): LayerVariable = js.native
  def zerosVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = js.native
}

