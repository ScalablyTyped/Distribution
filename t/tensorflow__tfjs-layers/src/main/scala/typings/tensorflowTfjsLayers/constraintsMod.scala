package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraintsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "Constraint")
  @js.native
  abstract class Constraint () extends Serializable {
    
    @JSName("apply")
    def apply(w: Tensor[Rank]): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "MaxNorm")
  @js.native
  class MaxNorm protected () extends Constraint {
    def this(args: MaxNormArgs) = this()
    
    var axis: js.Any = js.native
    
    val defaultAxis: js.Any = js.native
    
    val defaultMaxValue: js.Any = js.native
    
    var maxValue: js.Any = js.native
  }
  /* static members */
  object MaxNorm {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/constraints", "MaxNorm.className")
    @js.native
    val className: /* "MaxNorm" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "MinMaxNorm")
  @js.native
  class MinMaxNorm protected () extends Constraint {
    def this(args: MinMaxNormArgs) = this()
    
    var axis: js.Any = js.native
    
    val defaultAxis: js.Any = js.native
    
    val defaultMaxValue: js.Any = js.native
    
    val defaultMinValue: js.Any = js.native
    
    val defaultRate: js.Any = js.native
    
    var maxValue: js.Any = js.native
    
    var minValue: js.Any = js.native
    
    var rate: js.Any = js.native
  }
  /* static members */
  object MinMaxNorm {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/constraints", "MinMaxNorm.className")
    @js.native
    val className: /* "MinMaxNorm" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "NonNeg")
  @js.native
  class NonNeg () extends Constraint
  /* static members */
  object NonNeg {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/constraints", "NonNeg.className")
    @js.native
    val className: /* "NonNeg" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "UnitNorm")
  @js.native
  class UnitNorm protected () extends Constraint {
    def this(args: UnitNormArgs) = this()
    
    var axis: js.Any = js.native
    
    val defaultAxis: js.Any = js.native
  }
  /* static members */
  object UnitNorm {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/constraints", "UnitNorm.className")
    @js.native
    val className: /* "UnitNorm" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "deserializeConstraint")
  @js.native
  def deserializeConstraint(config: ConfigDict): Constraint = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "deserializeConstraint")
  @js.native
  def deserializeConstraint(config: ConfigDict, customObjects: ConfigDict): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "getConstraint")
  @js.native
  def getConstraint(identifier: ConfigDict): Constraint = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "getConstraint")
  @js.native
  def getConstraint(identifier: Constraint): Constraint = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "getConstraint")
  @js.native
  def getConstraint(identifier: ConstraintIdentifier): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "serializeConstraint")
  @js.native
  def serializeConstraint(constraint: Constraint): ConfigDictValue = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.maxNorm_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.minMaxNorm_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nonNeg_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.unitNorm_
    - java.lang.String
  */
  type ConstraintIdentifier = _ConstraintIdentifier | String
  
  @js.native
  trait MaxNormArgs extends StObject {
    
    /**
      * Axis along which to calculate norms.
      *
      *  For instance, in a `Dense` layer the weight matrix
      *  has shape `[inputDim, outputDim]`,
      *  set `axis` to `0` to constrain each weight vector
      *  of length `[inputDim,]`.
      *  In a `Conv2D` layer with `dataFormat="channels_last"`,
      *  the weight tensor has shape
      *  `[rows, cols, inputDepth, outputDepth]`,
      *  set `axis` to `[0, 1, 2]`
      *  to constrain the weights of each filter tensor of size
      *  `[rows, cols, inputDepth]`.
      */
    var axis: js.UndefOr[Double] = js.native
    
    /**
      * Maximum norm for incoming weights
      */
    var maxValue: js.UndefOr[Double] = js.native
  }
  object MaxNormArgs {
    
    @scala.inline
    def apply(): MaxNormArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxNormArgs]
    }
    
    @scala.inline
    implicit class MaxNormArgsMutableBuilder[Self <: MaxNormArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    }
  }
  
  @js.native
  trait MinMaxNormArgs extends StObject {
    
    /**
      * Axis along which to calculate norms.
      * For instance, in a `Dense` layer the weight matrix
      * has shape `[inputDim, outputDim]`,
      * set `axis` to `0` to constrain each weight vector
      * of length `[inputDim,]`.
      * In a `Conv2D` layer with `dataFormat="channels_last"`,
      * the weight tensor has shape
      * `[rows, cols, inputDepth, outputDepth]`,
      * set `axis` to `[0, 1, 2]`
      * to constrain the weights of each filter tensor of size
      * `[rows, cols, inputDepth]`.
      */
    var axis: js.UndefOr[Double] = js.native
    
    /**
      * Maximum norm for incoming weights
      */
    var maxValue: js.UndefOr[Double] = js.native
    
    /**
      * Minimum norm for incoming weights
      */
    var minValue: js.UndefOr[Double] = js.native
    
    /**
      * Rate for enforcing the constraint: weights will be rescaled to yield:
      * `(1 - rate) * norm + rate * norm.clip(minValue, maxValue)`.
      * Effectively, this means that rate=1.0 stands for strict
      * enforcement of the constraint, while rate<1.0 means that
      * weights will be rescaled at each step to slowly move
      * towards a value inside the desired interval.
      */
    var rate: js.UndefOr[Double] = js.native
  }
  object MinMaxNormArgs {
    
    @scala.inline
    def apply(): MinMaxNormArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinMaxNormArgs]
    }
    
    @scala.inline
    implicit class MinMaxNormArgsMutableBuilder[Self <: MinMaxNormArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
  
  @js.native
  trait UnitNormArgs extends StObject {
    
    /**
      * Axis along which to calculate norms.
      *
      * For instance, in a `Dense` layer the weight matrix
      * has shape `[inputDim, outputDim]`,
      * set `axis` to `0` to constrain each weight vector
      * of length `[inputDim,]`.
      * In a `Conv2D` layer with `dataFormat="channels_last"`,
      * the weight tensor has shape
      * [rows, cols, inputDepth, outputDepth]`,
      * set `axis` to `[0, 1, 2]`
      * to constrain the weights of each filter tensor of size
      * `[rows, cols, inputDepth]`.
      */
    var axis: js.UndefOr[Double] = js.native
  }
  object UnitNormArgs {
    
    @scala.inline
    def apply(): UnitNormArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitNormArgs]
    }
    
    @scala.inline
    implicit class UnitNormArgsMutableBuilder[Self <: UnitNormArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  trait _ConstraintIdentifier extends StObject
}
