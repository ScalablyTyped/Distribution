package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.std.Int32Array
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "MPRandGauss")
  @js.native
  class MPRandGauss protected () extends RandomBase {
    def this(mean: Double, stdDeviation: Double) = this()
    def this(mean: Double, stdDeviation: Double, dtype: float32 | int32) = this()
    def this(mean: Double, stdDeviation: Double, dtype: js.UndefOr[float32 | int32], truncated: Boolean) = this()
    def this(
      mean: Double,
      stdDeviation: Double,
      dtype: js.UndefOr[float32 | int32],
      truncated: js.UndefOr[scala.Nothing],
      seed: Double
    ) = this()
    def this(
      mean: Double,
      stdDeviation: Double,
      dtype: js.UndefOr[float32 | int32],
      truncated: Boolean,
      seed: Double
    ) = this()
    
    /** Handles proper rounding for non-floating-point numbers. */
    var convertValue: js.Any = js.native
    
    var dtype: js.Any = js.native
    
    /** Returns true if less than 2-standard-deviations from the mean. */
    var isValidTruncated: js.Any = js.native
    
    var lower: js.Any = js.native
    
    var mean: js.Any = js.native
    
    var nextVal: js.Any = js.native
    
    var random: js.Any = js.native
    
    var stdDev: js.Any = js.native
    
    var truncated: js.Any = js.native
    
    var upper: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "RandGamma")
  @js.native
  class RandGamma protected () extends RandomGamma {
    def this(alpha: Double, beta: Double, dtype: float32) = this()
    def this(alpha: Double, beta: Double, dtype: int32) = this()
    def this(alpha: Double, beta: Double, dtype: float32, seed: Double) = this()
    def this(alpha: Double, beta: Double, dtype: int32, seed: Double) = this()
    
    var alpha: js.Any = js.native
    
    var beta: js.Any = js.native
    
    var c: js.Any = js.native
    
    /** Handles proper rounding for non-floating-point numbers. */
    var convertValue: js.Any = js.native
    
    var d: js.Any = js.native
    
    var dtype: js.Any = js.native
    
    var randn: js.Any = js.native
    
    var randu: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "UniformRandom")
  @js.native
  class UniformRandom () extends RandomBase {
    def this(min: Double) = this()
    def this(min: js.UndefOr[scala.Nothing], max: Double) = this()
    def this(min: Double, max: Double) = this()
    def this(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dtype: float32 | int32) = this()
    def this(min: js.UndefOr[scala.Nothing], max: Double, dtype: float32 | int32) = this()
    def this(min: Double, max: js.UndefOr[scala.Nothing], dtype: float32 | int32) = this()
    def this(min: Double, max: Double, dtype: float32 | int32) = this()
    def this(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      dtype: js.UndefOr[float32 | int32],
      seed: String
    ) = this()
    def this(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      dtype: js.UndefOr[float32 | int32],
      seed: Double
    ) = this()
    def this(min: js.UndefOr[scala.Nothing], max: Double, dtype: js.UndefOr[float32 | int32], seed: String) = this()
    def this(min: js.UndefOr[scala.Nothing], max: Double, dtype: js.UndefOr[float32 | int32], seed: Double) = this()
    def this(min: Double, max: js.UndefOr[scala.Nothing], dtype: js.UndefOr[float32 | int32], seed: String) = this()
    def this(min: Double, max: js.UndefOr[scala.Nothing], dtype: js.UndefOr[float32 | int32], seed: Double) = this()
    def this(min: Double, max: Double, dtype: js.UndefOr[float32 | int32], seed: String) = this()
    def this(min: Double, max: Double, dtype: js.UndefOr[float32 | int32], seed: Double) = this()
    
    /** Handles proper rounding for non floating point numbers. */
    var canReturnFloat: js.Any = js.native
    
    var convertValue: js.Any = js.native
    
    var dtype: js.Any = js.native
    
    var min: js.Any = js.native
    
    var random: js.Any = js.native
    
    var range: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "expectArrayInMeanStdRange")
  @js.native
  def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "expectArrayInMeanStdRange")
  @js.native
  def expectArrayInMeanStdRange(actual: js.Array[Double], expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "expectArrayInMeanStdRange")
  @js.native
  def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "expectArrayInMeanStdRange")
  @js.native
  def expectArrayInMeanStdRange(actual: TypedArray, expectedMean: Double, expectedStdDev: Double, epsilon: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "jarqueBeraNormalityTest")
  @js.native
  def jarqueBeraNormalityTest(values: js.Array[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "jarqueBeraNormalityTest")
  @js.native
  def jarqueBeraNormalityTest(values: TypedArray): Unit = js.native
  
  @js.native
  trait RandGammaDataTypes extends StObject {
    
    var float32: Float32Array = js.native
    
    var int32: Int32Array = js.native
  }
  object RandGammaDataTypes {
    
    @scala.inline
    def apply(float32: Float32Array, int32: Int32Array): RandGammaDataTypes = {
      val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandGammaDataTypes]
    }
    
    @scala.inline
    implicit class RandGammaDataTypesMutableBuilder[Self <: RandGammaDataTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat32(value: Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt32(value: Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandNormalDataTypes extends StObject {
    
    var float32: Float32Array = js.native
    
    var int32: Int32Array = js.native
  }
  object RandNormalDataTypes {
    
    @scala.inline
    def apply(float32: Float32Array, int32: Int32Array): RandNormalDataTypes = {
      val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandNormalDataTypes]
    }
    
    @scala.inline
    implicit class RandNormalDataTypesMutableBuilder[Self <: RandNormalDataTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat32(value: Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt32(value: Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandomBase extends StObject {
    
    def nextValue(): Double = js.native
  }
  object RandomBase {
    
    @scala.inline
    def apply(nextValue: () => Double): RandomBase = {
      val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
      __obj.asInstanceOf[RandomBase]
    }
    
    @scala.inline
    implicit class RandomBaseMutableBuilder[Self <: RandomBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextValue(value: () => Double): Self = StObject.set(x, "nextValue", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RandomGamma extends StObject {
    
    def nextValue(): Double = js.native
  }
  object RandomGamma {
    
    @scala.inline
    def apply(nextValue: () => Double): RandomGamma = {
      val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
      __obj.asInstanceOf[RandomGamma]
    }
    
    @scala.inline
    implicit class RandomGammaMutableBuilder[Self <: RandomGamma] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextValue(value: () => Double): Self = StObject.set(x, "nextValue", js.Any.fromFunction0(value))
    }
  }
}
