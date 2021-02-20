package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Variable_
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variablesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "LayerVariable")
  @js.native
  class LayerVariable protected () extends StObject {
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
    def this(`val`: Tensor[Rank]) = this()
    def this(`val`: Tensor[Rank], dtype: DataType) = this()
    def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean
    ) = this()
    def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: js.UndefOr[scala.Nothing], trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: String,
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: String,
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: js.UndefOr[scala.Nothing],
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: String,
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
    
    /* protected */ def assertNotDisposed(): Unit = js.native
    
    val constraint: Constraint = js.native
    
    /**
      * Dispose this LayersVariable instance from memory.
      */
    def dispose(): Unit = js.native
    
    val dtype: DataType = js.native
    
    val id: Double = js.native
    
    val name: String = js.native
    
    val originalName: String = js.native
    
    /**
      * Get a snapshot of the Variable's value.
      *
      * The returned value is a snapshot of the Variable's value at the time of
      * the invocation. Future mutations in the value of the tensor will only
      * be reflected by future calls to this method.
      */
    def read(): Tensor[Rank] = js.native
    
    val shape: Shape = js.native
    
    var trainable: Boolean = js.native
    
    var trainable_ : js.Any = js.native
    
    val `val`: Variable_[Rank] = js.native
    
    /**
      * Update the value of the Variable.
      *
      * @param newVal: The new value to update to. Must be consistent with the
      *   dtype and shape of the Variable.
      * @return This Variable.
      */
    def write(newVal: Tensor[Rank]): this.type = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "batchGetValue")
  @js.native
  def batchGetValue(xs: js.Array[LayerVariable]): js.Array[Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "batchSetValue")
  @js.native
  def batchSetValue(variablesAndValues: js.Array[js.Tuple2[LayerVariable, Tensor[Rank]]]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "eyeVariable")
  @js.native
  def eyeVariable(size: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "eyeVariable")
  @js.native
  def eyeVariable(size: Double, dtype: js.UndefOr[scala.Nothing], name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "eyeVariable")
  @js.native
  def eyeVariable(size: Double, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "eyeVariable")
  @js.native
  def eyeVariable(size: Double, dtype: DataType, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "gradients")
  @js.native
  def gradients(lossFn: js.Function0[Scalar], variables: js.Array[LayerVariable]): js.Array[Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesLike")
  @js.native
  def onesLike(x: Tensor[Rank]): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesLike")
  @js.native
  def onesLike(x: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesLike")
  @js.native
  def onesLike(x: Tensor[Rank], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesLike")
  @js.native
  def onesLike(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesVariable")
  @js.native
  def onesVariable(shape: Shape): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesVariable")
  @js.native
  def onesVariable(shape: Shape, dtype: js.UndefOr[scala.Nothing], name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesVariable")
  @js.native
  def onesVariable(shape: Shape, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "onesVariable")
  @js.native
  def onesVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: js.UndefOr[scala.Nothing], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: DataType,
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: js.UndefOr[scala.Nothing], seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: Double,
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomNormalVariable")
  @js.native
  def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(
    shape: Shape,
    minval: Double,
    maxval: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: js.UndefOr[scala.Nothing], seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(
    shape: Shape,
    minval: Double,
    maxval: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(
    shape: Shape,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "randomUniformVariable")
  @js.native
  def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Double, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: js.UndefOr[scala.Nothing], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: DataType,
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: js.UndefOr[scala.Nothing], seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double,
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(
    shape: Shape,
    mean: Double,
    stddev: Double,
    dtype: DataType,
    seed: js.UndefOr[scala.Nothing],
    name: String
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "truncatedNormalVariable")
  @js.native
  def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "update")
  @js.native
  def update(x: LayerVariable, xNew: Tensor[Rank]): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "updateAdd")
  @js.native
  def updateAdd(x: LayerVariable, increment: Tensor[Rank]): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "updateSub")
  @js.native
  def updateSub(x: LayerVariable, decrement: Tensor[Rank]): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank]): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(
    x: Tensor[Rank],
    dtype: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    constraint: Constraint
  ): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String, constraint: Constraint): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank], dtype: DataType, name: js.UndefOr[scala.Nothing], constraint: Constraint): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "variable")
  @js.native
  def variable(x: Tensor[Rank], dtype: DataType, name: String, constraint: Constraint): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosLike")
  @js.native
  def zerosLike(x: Tensor[Rank]): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosLike")
  @js.native
  def zerosLike(x: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosLike")
  @js.native
  def zerosLike(x: Tensor[Rank], dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosLike")
  @js.native
  def zerosLike(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosVariable")
  @js.native
  def zerosVariable(shape: Shape): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosVariable")
  @js.native
  def zerosVariable(shape: Shape, dtype: js.UndefOr[scala.Nothing], name: String): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosVariable")
  @js.native
  def zerosVariable(shape: Shape, dtype: DataType): LayerVariable = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "zerosVariable")
  @js.native
  def zerosVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = js.native
}
