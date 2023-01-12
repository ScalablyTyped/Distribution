package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationSerialization
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersCoreSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization", "coreLayerClassNames")
  @js.native
  val coreLayerClassNames: js.Array[CoreLayerClassName] = js.native
  
  trait ActivationLayerConfig
    extends StObject
       with LayerConfig {
    
    var activation: ActivationSerialization
  }
  object ActivationLayerConfig {
    
    inline def apply(activation: ActivationSerialization): ActivationLayerConfig = {
      val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivationLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActivationLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    }
  }
  
  type ActivationLayerSerialization = BaseLayerSerialization[Activation, ActivationLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization.CoreLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
  */
  trait CoreLayerClassName extends StObject
  object CoreLayerClassName {
    
    inline def Activation: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    inline def Dense: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense = "Dense".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense]
    
    inline def Dropout: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout = "Dropout".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout]
    
    inline def Flatten: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten = "Flatten".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten]
    
    inline def Masking: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    inline def Permute: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    inline def RepeatVector: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    inline def Reshape: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
  }
  
  type CoreLayerSerialization = DropoutLayerSerialization | DenseLayerSerialization | FlattenLayerSerialization | ActivationLayerSerialization | RepeatVectorLayerSerialization | ReshapeLayerSerialization | PermuteLayerSerialization | MaskingLayerSerialization
  
  trait DenseLayerConfig
    extends StObject
       with LayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.undefined
    
    var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var input_dim: js.UndefOr[Double] = js.undefined
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var units: Double
    
    var use_bias: js.UndefOr[Boolean] = js.undefined
  }
  object DenseLayerConfig {
    
    inline def apply(units: Double): DenseLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[DenseLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DenseLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setActivity_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "activity_regularizer", value.asInstanceOf[js.Any])
      
      inline def setActivity_regularizerUndefined: Self = StObject.set(x, "activity_regularizer", js.undefined)
      
      inline def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      inline def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      inline def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      inline def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      inline def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      inline def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      inline def setInput_dim(value: Double): Self = StObject.set(x, "input_dim", value.asInstanceOf[js.Any])
      
      inline def setInput_dimUndefined: Self = StObject.set(x, "input_dim", js.undefined)
      
      inline def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      inline def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      inline def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      inline def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      inline def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      inline def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      inline def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type DenseLayerSerialization = BaseLayerSerialization[Dense, DenseLayerConfig]
  
  trait DropoutLayerConfig
    extends StObject
       with LayerConfig {
    
    var noise_shape: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rate: Double
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object DropoutLayerConfig {
    
    inline def apply(rate: Double): DropoutLayerConfig = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropoutLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropoutLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setNoise_shape(value: js.Array[Double]): Self = StObject.set(x, "noise_shape", value.asInstanceOf[js.Any])
      
      inline def setNoise_shapeUndefined: Self = StObject.set(x, "noise_shape", js.undefined)
      
      inline def setNoise_shapeVarargs(value: Double*): Self = StObject.set(x, "noise_shape", js.Array(value*))
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type DropoutLayerSerialization = BaseLayerSerialization[Dropout, DropoutLayerConfig]
  
  type FlattenLayerSerialization = BaseLayerSerialization[Flatten, LayerConfig]
  
  trait MaskingLayerConfig
    extends StObject
       with LayerConfig {
    
    var maskValue: Double
  }
  object MaskingLayerConfig {
    
    inline def apply(maskValue: Double): MaskingLayerConfig = {
      val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskingLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskingLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setMaskValue(value: Double): Self = StObject.set(x, "maskValue", value.asInstanceOf[js.Any])
    }
  }
  
  type MaskingLayerSerialization = BaseLayerSerialization[Masking, MaskingLayerConfig]
  
  trait PermuteLayerConfig
    extends StObject
       with LayerConfig {
    
    var dims: js.Array[Double]
  }
  object PermuteLayerConfig {
    
    inline def apply(dims: js.Array[Double]): PermuteLayerConfig = {
      val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermuteLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermuteLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setDims(value: js.Array[Double]): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
      
      inline def setDimsVarargs(value: Double*): Self = StObject.set(x, "dims", js.Array(value*))
    }
  }
  
  type PermuteLayerSerialization = BaseLayerSerialization[Permute, PermuteLayerConfig]
  
  trait RepeatVectorLayerConfig
    extends StObject
       with LayerConfig {
    
    var n: Double
  }
  object RepeatVectorLayerConfig {
    
    inline def apply(n: Double): RepeatVectorLayerConfig = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepeatVectorLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepeatVectorLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  type RepeatVectorLayerSerialization = BaseLayerSerialization[RepeatVector, RepeatVectorLayerConfig]
  
  trait ReshapeLayerConfig
    extends StObject
       with LayerConfig {
    
    var target_shape: Shape
  }
  object ReshapeLayerConfig {
    
    inline def apply(target_shape: Shape): ReshapeLayerConfig = {
      val __obj = js.Dynamic.literal(target_shape = target_shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReshapeLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReshapeLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setTarget_shape(value: Shape): Self = StObject.set(x, "target_shape", value.asInstanceOf[js.Any])
      
      inline def setTarget_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "target_shape", js.Array(value*))
    }
  }
  
  type ReshapeLayerSerialization = BaseLayerSerialization[Reshape, ReshapeLayerConfig]
}
