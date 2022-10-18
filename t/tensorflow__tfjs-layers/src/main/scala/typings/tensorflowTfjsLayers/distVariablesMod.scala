package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Variable_
import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVariablesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/variables", "LayerVariable")
  @js.native
  open class LayerVariable protected () extends StObject {
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
    def this(`val`: Tensor[Rank], dtype: Unit, name: String) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Unit, constraint: Constraint) = this()
    
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
    
    def trainable: Boolean = js.native
    
    /* private */ var trainable_ : Any = js.native
    
    def trainable_=(trainable: Boolean): Unit = js.native
    
    /* protected */ val `val`: Variable_[Rank] = js.native
    
    /**
      * Update the value of the Variable.
      *
      * @param newVal: The new value to update to. Must be consistent with the
      *   dtype and shape of the Variable.
      * @return This Variable.
      */
    def write(newVal: Tensor[Rank]): this.type = js.native
  }
  
  inline def batchGetValue(xs: js.Array[LayerVariable]): js.Array[Tensor[Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("batchGetValue")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tensor[Rank]]]
  
  inline def batchSetValue(variablesAndValues: js.Array[js.Tuple2[LayerVariable, Tensor[Rank]]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("batchSetValue")(variablesAndValues.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def eyeVariable(size: Double): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("eyeVariable")(size.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def eyeVariable(size: Double, dtype: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("eyeVariable")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def eyeVariable(size: Double, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("eyeVariable")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def eyeVariable(size: Double, dtype: DataType, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("eyeVariable")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def gradients(lossFn: js.Function0[Scalar], variables: js.Array[LayerVariable]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gradients")(lossFn.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  
  inline def onesLike(x: Tensor[Rank]): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(x.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def onesLike(x: Tensor[Rank], dtype: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def onesLike(x: Tensor[Rank], dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def onesLike(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def onesVariable(shape: Shape): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("onesVariable")(shape.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def onesVariable(shape: Shape, dtype: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("onesVariable")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def onesVariable(shape: Shape, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("onesVariable")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def onesVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("onesVariable")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def randomNormalVariable(shape: Shape): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def randomUniformVariable(shape: Shape, minval: Double, maxval: Double, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformVariable")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def truncatedNormalVariable(shape: Shape): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Double, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Double, stddev: Unit, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Double, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType, seed: Double): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType, seed: Double, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def truncatedNormalVariable(shape: Shape, mean: Unit, stddev: Unit, dtype: DataType, seed: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormalVariable")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def update(x: LayerVariable, xNew: Tensor[Rank]): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(x.asInstanceOf[js.Any], xNew.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def updateAdd(x: LayerVariable, increment: Tensor[Rank]): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAdd")(x.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def updateSub(x: LayerVariable, decrement: Tensor[Rank]): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSub")(x.asInstanceOf[js.Any], decrement.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def variable(x: Tensor[Rank]): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: Unit, name: String, constraint: Constraint): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: Unit, name: Unit, constraint: Constraint): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: DataType, name: String, constraint: Constraint): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def variable(x: Tensor[Rank], dtype: DataType, name: Unit, constraint: Constraint): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def zerosLike(x: Tensor[Rank]): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def zerosLike(x: Tensor[Rank], dtype: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def zerosLike(x: Tensor[Rank], dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def zerosLike(x: Tensor[Rank], dtype: DataType, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  
  inline def zerosVariable(shape: Shape): LayerVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("zerosVariable")(shape.asInstanceOf[js.Any]).asInstanceOf[LayerVariable]
  inline def zerosVariable(shape: Shape, dtype: Unit, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("zerosVariable")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def zerosVariable(shape: Shape, dtype: DataType): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("zerosVariable")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
  inline def zerosVariable(shape: Shape, dtype: DataType, name: String): LayerVariable = (^.asInstanceOf[js.Dynamic].applyDynamic("zerosVariable")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LayerVariable]
}
