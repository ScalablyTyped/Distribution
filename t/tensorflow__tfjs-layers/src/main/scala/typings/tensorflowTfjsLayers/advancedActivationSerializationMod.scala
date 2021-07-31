package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advancedActivationSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization", "advancedActivationLayerClassNames")
  @js.native
  val advancedActivationLayerClassNames: js.Array[AdvancedActivationLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization.AdvancedActivationLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
  */
  trait AdvancedActivationLayerClassName extends StObject
  object AdvancedActivationLayerClassName {
    
    @scala.inline
    def ELU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU = "ELU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU]
    
    @scala.inline
    def LeakyReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    @scala.inline
    def PReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    @scala.inline
    def ReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    @scala.inline
    def Softmax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    @scala.inline
    def ThresholdedReLU: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
  }
  
  type AdvancedActivationLayerSerialization = ReLULayerSerialization | LeakyReLULayerSerialization | PReLULayerSerialization | ELULayerSerialization | ThresholdedReLULayerSerialization | SoftmaxLayerSerialization
  
  trait ELULayerConfig
    extends StObject
       with LayerConfig {
    
    var alpha: js.UndefOr[Double] = js.undefined
  }
  object ELULayerConfig {
    
    @scala.inline
    def apply(): ELULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ELULayerConfig]
    }
    
    @scala.inline
    implicit class ELULayerConfigMutableBuilder[Self <: ELULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  type ELULayerSerialization = BaseLayerSerialization[ELU, ELULayerConfig]
  
  trait LeakyReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var alpha: js.UndefOr[Double] = js.undefined
  }
  object LeakyReLULayerConfig {
    
    @scala.inline
    def apply(): LeakyReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeakyReLULayerConfig]
    }
    
    @scala.inline
    implicit class LeakyReLULayerConfigMutableBuilder[Self <: LeakyReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  type LeakyReLULayerSerialization = BaseLayerSerialization[LeakyReLU, LeakyReLULayerConfig]
  
  trait PReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var alpha_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var alpha_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var alpha_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var shared_axes: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object PReLULayerConfig {
    
    @scala.inline
    def apply(): PReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PReLULayerConfig]
    }
    
    @scala.inline
    implicit class PReLULayerConfigMutableBuilder[Self <: PReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha_constraint(value: ConstraintSerialization): Self = StObject.set(x, "alpha_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha_constraintUndefined: Self = StObject.set(x, "alpha_constraint", js.undefined)
      
      @scala.inline
      def setAlpha_initializer(value: InitializerSerialization): Self = StObject.set(x, "alpha_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha_initializerUndefined: Self = StObject.set(x, "alpha_initializer", js.undefined)
      
      @scala.inline
      def setAlpha_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "alpha_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha_regularizerUndefined: Self = StObject.set(x, "alpha_regularizer", js.undefined)
      
      @scala.inline
      def setShared_axes(value: Double | js.Array[Double]): Self = StObject.set(x, "shared_axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared_axesUndefined: Self = StObject.set(x, "shared_axes", js.undefined)
      
      @scala.inline
      def setShared_axesVarargs(value: Double*): Self = StObject.set(x, "shared_axes", js.Array(value :_*))
    }
  }
  
  type PReLULayerSerialization = BaseLayerSerialization[PReLU, PReLULayerConfig]
  
  trait ReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var max_value: js.UndefOr[Double] = js.undefined
  }
  object ReLULayerConfig {
    
    @scala.inline
    def apply(): ReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReLULayerConfig]
    }
    
    @scala.inline
    implicit class ReLULayerConfigMutableBuilder[Self <: ReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    }
  }
  
  type ReLULayerSerialization = BaseLayerSerialization[ReLU, ReLULayerConfig]
  
  trait SoftmaxLayerConfig
    extends StObject
       with LayerConfig {
    
    var axis: js.UndefOr[Double] = js.undefined
  }
  object SoftmaxLayerConfig {
    
    @scala.inline
    def apply(): SoftmaxLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoftmaxLayerConfig]
    }
    
    @scala.inline
    implicit class SoftmaxLayerConfigMutableBuilder[Self <: SoftmaxLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type SoftmaxLayerSerialization = BaseLayerSerialization[Softmax, SoftmaxLayerConfig]
  
  trait ThresholdedReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var theta: js.UndefOr[Double] = js.undefined
  }
  object ThresholdedReLULayerConfig {
    
    @scala.inline
    def apply(): ThresholdedReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdedReLULayerConfig]
    }
    
    @scala.inline
    implicit class ThresholdedReLULayerConfigMutableBuilder[Self <: ThresholdedReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    }
  }
  
  type ThresholdedReLULayerSerialization = BaseLayerSerialization[ThresholdedReLU, ThresholdedReLULayerConfig]
}
