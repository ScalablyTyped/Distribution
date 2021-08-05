package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.std.Int32Array
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "MPRandGauss")
  @js.native
  class MPRandGauss protected ()
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
    /* private */ var convertValue: js.Any = js.native
    
    /* private */ var dtype: js.Any = js.native
    
    /** Returns true if less than 2-standard-deviations from the mean. */
    /* private */ var isValidTruncated: js.Any = js.native
    
    /* private */ var lower: js.Any = js.native
    
    /* private */ var mean: js.Any = js.native
    
    /* private */ var nextVal: js.Any = js.native
    
    /* CompleteClass */
    override def nextValue(): Double = js.native
    
    /* private */ var random: js.Any = js.native
    
    /* private */ var stdDev: js.Any = js.native
    
    /* private */ var truncated: js.Any = js.native
    
    /* private */ var upper: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "RandGamma")
  @js.native
  class RandGamma protected ()
    extends StObject
       with RandomGamma {
    def this(alpha: Double, beta: Double, dtype: float32) = this()
    def this(alpha: Double, beta: Double, dtype: int32) = this()
    def this(alpha: Double, beta: Double, dtype: float32, seed: Double) = this()
    def this(alpha: Double, beta: Double, dtype: int32, seed: Double) = this()
    
    /* private */ var alpha: js.Any = js.native
    
    /* private */ var beta: js.Any = js.native
    
    /* private */ var c: js.Any = js.native
    
    /** Handles proper rounding for non-floating-point numbers. */
    /* private */ var convertValue: js.Any = js.native
    
    /* private */ var d: js.Any = js.native
    
    /* private */ var dtype: js.Any = js.native
    
    /* CompleteClass */
    override def nextValue(): Double = js.native
    
    /* private */ var randn: js.Any = js.native
    
    /* private */ var randu: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "UniformRandom")
  @js.native
  class UniformRandom ()
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
    /* private */ var canReturnFloat: js.Any = js.native
    
    /* private */ var convertValue: js.Any = js.native
    
    /* private */ var dtype: js.Any = js.native
    
    /* private */ var min: js.Any = js.native
    
    /* CompleteClass */
    override def nextValue(): Double = js.native
    
    /* private */ var random: js.Any = js.native
    
    /* private */ var range: js.Any = js.native
  }
  
  inline def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectArrayInMeanStdRange")(actual.asInstanceOf[js.Any], expectedMean.asInstanceOf[js.Any], expectedStdDev.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def jarqueBeraNormalityTest(values: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jarqueBeraNormalityTest")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def jarqueBeraNormalityTest(values: TypedArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jarqueBeraNormalityTest")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait RandGammaDataTypes extends StObject {
    
    var float32: Float32Array
    
    var int32: Int32Array
  }
  object RandGammaDataTypes {
    
    inline def apply(float32: Float32Array, int32: Int32Array): RandGammaDataTypes = {
      val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandGammaDataTypes]
    }
    
    extension [Self <: RandGammaDataTypes](x: Self) {
      
      inline def setFloat32(value: Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandNormalDataTypes extends StObject {
    
    var float32: Float32Array
    
    var int32: Int32Array
  }
  object RandNormalDataTypes {
    
    inline def apply(float32: Float32Array, int32: Int32Array): RandNormalDataTypes = {
      val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandNormalDataTypes]
    }
    
    extension [Self <: RandNormalDataTypes](x: Self) {
      
      inline def setFloat32(value: Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
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
    
    extension [Self <: RandomBase](x: Self) {
      
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
    
    extension [Self <: RandomGamma](x: Self) {
      
      inline def setNextValue(value: () => Double): Self = StObject.set(x, "nextValue", js.Any.fromFunction0(value))
    }
  }
}
