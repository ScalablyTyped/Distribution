package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraintsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "Constraint")
  @js.native
  abstract class Constraint () extends Serializable {
    
    @JSName("apply")
    def apply(w: Tensor[Rank]): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "MaxNorm")
  @js.native
  open class MaxNorm protected () extends Constraint {
    def this(args: MaxNormArgs) = this()
    
    /* private */ var axis: Any = js.native
    
    /* private */ val defaultAxis: Any = js.native
    
    /* private */ val defaultMaxValue: Any = js.native
    
    /* private */ var maxValue: Any = js.native
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
  open class MinMaxNorm protected () extends Constraint {
    def this(args: MinMaxNormArgs) = this()
    
    /* private */ var axis: Any = js.native
    
    /* private */ val defaultAxis: Any = js.native
    
    /* private */ val defaultMaxValue: Any = js.native
    
    /* private */ val defaultMinValue: Any = js.native
    
    /* private */ val defaultRate: Any = js.native
    
    /* private */ var maxValue: Any = js.native
    
    /* private */ var minValue: Any = js.native
    
    /* private */ var rate: Any = js.native
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
  open class NonNeg () extends Constraint
  /* static members */
  object NonNeg {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/constraints", "NonNeg.className")
    @js.native
    val className: /* "NonNeg" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/constraints", "UnitNorm")
  @js.native
  open class UnitNorm protected () extends Constraint {
    def this(args: UnitNormArgs) = this()
    
    /* private */ var axis: Any = js.native
    
    /* private */ val defaultAxis: Any = js.native
  }
  /* static members */
  object UnitNorm {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/constraints", "UnitNorm.className")
    @js.native
    val className: /* "UnitNorm" */ String = js.native
  }
  
  inline def deserializeConstraint(config: ConfigDict): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeConstraint")(config.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  inline def deserializeConstraint(config: ConfigDict, customObjects: ConfigDict): Constraint = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeConstraint")(config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[Constraint]
  
  inline def getConstraint(identifier: ConfigDict): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstraint")(identifier.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  inline def getConstraint(identifier: Constraint): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstraint")(identifier.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  inline def getConstraint(identifier: ConstraintIdentifier): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstraint")(identifier.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  inline def serializeConstraint(constraint: Constraint): ConfigDictValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeConstraint")(constraint.asInstanceOf[js.Any]).asInstanceOf[ConfigDictValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.maxNorm_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.minMaxNorm_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nonNeg_
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.unitNorm_
    - java.lang.String
  */
  type ConstraintIdentifier = _ConstraintIdentifier | String
  
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
    var axis: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum norm for incoming weights
      */
    var maxValue: js.UndefOr[Double] = js.undefined
  }
  object MaxNormArgs {
    
    inline def apply(): MaxNormArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxNormArgs]
    }
    
    extension [Self <: MaxNormArgs](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    }
  }
  
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
    var axis: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum norm for incoming weights
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum norm for incoming weights
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Rate for enforcing the constraint: weights will be rescaled to yield:
      * `(1 - rate) * norm + rate * norm.clip(minValue, maxValue)`.
      * Effectively, this means that rate=1.0 stands for strict
      * enforcement of the constraint, while rate<1.0 means that
      * weights will be rescaled at each step to slowly move
      * towards a value inside the desired interval.
      */
    var rate: js.UndefOr[Double] = js.undefined
  }
  object MinMaxNormArgs {
    
    inline def apply(): MinMaxNormArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinMaxNormArgs]
    }
    
    extension [Self <: MinMaxNormArgs](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
  
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
    var axis: js.UndefOr[Double] = js.undefined
  }
  object UnitNormArgs {
    
    inline def apply(): UnitNormArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitNormArgs]
    }
    
    extension [Self <: UnitNormArgs](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  trait _ConstraintIdentifier extends StObject
}
