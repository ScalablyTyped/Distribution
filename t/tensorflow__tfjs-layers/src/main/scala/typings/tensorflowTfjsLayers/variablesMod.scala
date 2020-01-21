package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsCore.mod.Variable_
import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/variables", JSImport.Namespace)
@js.native
object variablesMod extends js.Object {
  @js.native
  class LayerVariable protected () extends js.Object {
    /**
      * Construct Variable from a `tf.Tensor`.
      *
      * If not explicitly named, the Variable will be given a name with the
      * prefix 'Variable'. Variable names are unique. In the case of name
      * collision, suffixies '_<num>' will be added to the name.
      *
      * @param val Initial value of the Variable.
      * @param name Name of the variable. If `null` or `undefined` is provided, it
      *   will default a name with the prefix 'Variable'.
      * @param constraint Optional, projection function to be applied to the
      * variable after optimize updates
      * @throws ValueError if `name` is `null` or `undefined`.
      */
    def this(`val`: Tensor_[Rank]) = this()
    def this(`val`: Tensor_[Rank], dtype: DataType) = this()
    def this(`val`: Tensor_[Rank], dtype: DataType, name: String) = this()
    def this(`val`: Tensor_[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor_[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
    val constraint: Constraint = js.native
    val dtype: DataType = js.native
    val id: Double = js.native
    val name: String = js.native
    val originalName: String = js.native
    val shape: Shape = js.native
    var trainable: Boolean = js.native
    var trainable_ : js.Any = js.native
    val `val`: Variable_[Rank] = js.native
    /* protected */ def assertNotDisposed(): Unit = js.native
    /**
      * Dispose this LayersVariable instance from memory.
      */
    def dispose(): Unit = js.native
    /**
      * Get a snapshot of the Variable's value.
      *
      * The returned value is a snapshot of the Variable's value at the time of
      * the invocation. Future mutations in the value of the tensor will only
      * be reflected by future calls to this method.
      */
    def read(): Tensor_[Rank] = js.native
    /**
      * Update the value of the Variable.
      *
      * @param newVal: The new value to update to. Must be consistent with the
      *   dtype and shape of the Variable.
      * @return This Variable.
      */
    def write(newVal: Tensor_[Rank]): this.type = js.native
  }
  
  def batchGetValue(xs: js.Array[LayerVariable]): js.Array[Tensor_[Rank]] = js.native
  def batchSetValue(variablesAndValues: js.Array[js.Tuple2[LayerVariable, Tensor_[Rank]]]): Unit = js.native
  def eyeVariable(size: Double): LayerVariable = js.native
  def eyeVariable(size: Double, dtype: DataType): LayerVariable = js.native
  def eyeVariable(size: Double, dtype: DataType, name: String): LayerVariable = js.native
  def gradients(lossFn: js.Function0[Scalar], variables: js.Array[LayerVariable]): js.Array[Tensor_[Rank]] = js.native
  def onesLike(x: Tensor_[Rank]): LayerVariable = js.native
  def onesLike(x: Tensor_[Rank], dtype: DataType): LayerVariable = js.native
  def onesLike(x: Tensor_[Rank], dtype: DataType, name: String): LayerVariable = js.native
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
  def update(x: LayerVariable, xNew: Tensor_[Rank]): LayerVariable = js.native
  def updateAdd(x: LayerVariable, increment: Tensor_[Rank]): LayerVariable = js.native
  def updateSub(x: LayerVariable, decrement: Tensor_[Rank]): LayerVariable = js.native
  def variable(x: Tensor_[Rank]): LayerVariable = js.native
  def variable(x: Tensor_[Rank], dtype: DataType): LayerVariable = js.native
  def variable(x: Tensor_[Rank], dtype: DataType, name: String): LayerVariable = js.native
  def variable(x: Tensor_[Rank], dtype: DataType, name: String, constraint: Constraint): LayerVariable = js.native
  def zerosLike(x: Tensor_[Rank]): LayerVariable = js.native
  def zerosLike(x: Tensor_[Rank], dtype: DataType): LayerVariable = js.native
  def zerosLike(x: Tensor_[Rank], dtype: DataType, name: String): LayerVariable = js.native
  def zerosVariable(shape: Shape): LayerVariable = js.native
  def zerosVariable(shape: Shape, dtype: DataType): LayerVariable = js.native
  def zerosVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = js.native
}

