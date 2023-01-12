package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRandUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "MPRandGauss")
  @js.native
  open class MPRandGauss protected ()
    extends StObject
       with RandomBase {
    def this(mean: Double, stdDeviation: Double) = this()
    def this(mean: Double, stdDeviation: Double, dtype: float32 | int32) = this()
    def this(mean: Double, stdDeviation: Double, dtype: float32 | int32, truncated: Boolean) = this()
    def this(mean: Double, stdDeviation: Double, dtype: Unit, truncated: Boolean) = this()
    def this(mean: Double, stdDeviation: Double, dtype: float32 | int32, truncated: Boolean, seed: Double) = this()
    def this(mean: Double, stdDeviation: Double, dtype: float32 | int32, truncated: Unit, seed: Double) = this()
    def this(mean: Double, stdDeviation: Double, dtype: Unit, truncated: Boolean, seed: Double) = this()
    def this(mean: Double, stdDeviation: Double, dtype: Unit, truncated: Unit, seed: Double) = this()
    
    /** Handles proper rounding for non-floating-point numbers. */
    /* private */ var convertValue: Any = js.native
    
    /* private */ var dtype: Any = js.native
    
    /** Returns true if less than 2-standard-deviations from the mean. */
    /* private */ var isValidTruncated: Any = js.native
    
    /* private */ var lower: Any = js.native
    
    /* private */ var mean: Any = js.native
    
    /* private */ var nextVal: Any = js.native
    
    /* CompleteClass */
    override def nextValue(): Double = js.native
    
    /* private */ var random: Any = js.native
    
    /* private */ var stdDev: Any = js.native
    
    /* private */ var truncated: Any = js.native
    
    /* private */ var upper: Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "RandGamma")
  @js.native
  open class RandGamma protected ()
    extends StObject
       with RandomGamma {
    def this(alpha: Double, beta: Double, dtype: float32 | int32) = this()
    def this(alpha: Double, beta: Double, dtype: float32 | int32, seed: Double) = this()
    
    /* private */ var alpha: Any = js.native
    
    /* private */ var beta: Any = js.native
    
    /* private */ var c: Any = js.native
    
    /** Handles proper rounding for non-floating-point numbers. */
    /* private */ var convertValue: Any = js.native
    
    /* private */ var d: Any = js.native
    
    /* private */ var dtype: Any = js.native
    
    /* CompleteClass */
    override def nextValue(): Double = js.native
    
    /* private */ var randn: Any = js.native
    
    /* private */ var randu: Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "UniformRandom")
  @js.native
  open class UniformRandom ()
    extends StObject
       with RandomBase {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
    def this(min: Unit, max: Double) = this()
    def this(min: Double, max: Double, dtype: float32 | int32) = this()
    def this(min: Double, max: Unit, dtype: float32 | int32) = this()
    def this(min: Unit, max: Double, dtype: float32 | int32) = this()
    def this(min: Unit, max: Unit, dtype: float32 | int32) = this()
    def this(min: Double, max: Double, dtype: float32 | int32, seed: String) = this()
    def this(min: Double, max: Double, dtype: float32 | int32, seed: Double) = this()
    def this(min: Double, max: Double, dtype: Unit, seed: String) = this()
    def this(min: Double, max: Double, dtype: Unit, seed: Double) = this()
    def this(min: Double, max: Unit, dtype: float32 | int32, seed: String) = this()
    def this(min: Double, max: Unit, dtype: float32 | int32, seed: Double) = this()
    def this(min: Double, max: Unit, dtype: Unit, seed: String) = this()
    def this(min: Double, max: Unit, dtype: Unit, seed: Double) = this()
    def this(min: Unit, max: Double, dtype: float32 | int32, seed: String) = this()
    def this(min: Unit, max: Double, dtype: float32 | int32, seed: Double) = this()
    def this(min: Unit, max: Double, dtype: Unit, seed: String) = this()
    def this(min: Unit, max: Double, dtype: Unit, seed: Double) = this()
    def this(min: Unit, max: Unit, dtype: float32 | int32, seed: String) = this()
    def this(min: Unit, max: Unit, dtype: float32 | int32, seed: Double) = this()
    def this(min: Unit, max: Unit, dtype: Unit, seed: String) = this()
    def this(min: Unit, max: Unit, dtype: Unit, seed: Double) = this()
    
    /** Handles proper rounding for non floating point numbers. */
    /* private */ var canReturnFloat: Any = js.native
    
    /* private */ var convertValue: Any = js.native
    
    /* private */ var dtype: Any = js.native
    
    /* private */ var min: Any = js.native
    
    /* CompleteClass */
    override def nextValue(): Double = js.native
    
    /* private */ var random: Any = js.native
    
    /* private */ var range: Any = js.native
  }
  
  inline def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def jarqueBeraNormalityTest(values: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jarqueBeraNormalityTest")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def jarqueBeraNormalityTest(values: TypedArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jarqueBeraNormalityTest")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait RandGammaDataTypes extends StObject {
    
    var float32: js.typedarray.Float32Array
    
    var int32: js.typedarray.Int32Array
  }
  object RandGammaDataTypes {
    
    inline def apply(float32: js.typedarray.Float32Array, int32: js.typedarray.Int32Array): RandGammaDataTypes = {
      val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandGammaDataTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandGammaDataTypes] (val x: Self) extends AnyVal {
      
      inline def setFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandNormalDataTypes extends StObject {
    
    var float32: js.typedarray.Float32Array
    
    var int32: js.typedarray.Int32Array
  }
  object RandNormalDataTypes {
    
    inline def apply(float32: js.typedarray.Float32Array, int32: js.typedarray.Int32Array): RandNormalDataTypes = {
      val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandNormalDataTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandNormalDataTypes] (val x: Self) extends AnyVal {
      
      inline def setFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandomBase extends StObject {
    
    def nextValue(): Double
  }
  object RandomBase {
    
    inline def apply(nextValue: () => Double): RandomBase = {
      val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
      __obj.asInstanceOf[RandomBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomBase] (val x: Self) extends AnyVal {
      
      inline def setNextValue(value: () => Double): Self = StObject.set(x, "nextValue", js.Any.fromFunction0(value))
    }
  }
  
  trait RandomGamma extends StObject {
    
    def nextValue(): Double
  }
  object RandomGamma {
    
    inline def apply(nextValue: () => Double): RandomGamma = {
      val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
      __obj.asInstanceOf[RandomGamma]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomGamma] (val x: Self) extends AnyVal {
      
      inline def setNextValue(value: () => Double): Self = StObject.set(x, "nextValue", js.Any.fromFunction0(value))
    }
  }
}
