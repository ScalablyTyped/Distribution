package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/optimizer_config", "optimizerClassNames")
  @js.native
  val optimizerClassNames: js.Array[OptimizerClassName] = js.native
  
  @js.native
  trait AdadeltaOptimizerConfig extends StObject {
    
    var epsilon: Double = js.native
    
    var learning_rate: Double = js.native
    
    var rho: Double = js.native
  }
  object AdadeltaOptimizerConfig {
    
    @scala.inline
    def apply(epsilon: Double, learning_rate: Double, rho: Double): AdadeltaOptimizerConfig = {
      val __obj = js.Dynamic.literal(epsilon = epsilon.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any], rho = rho.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdadeltaOptimizerConfig]
    }
    
    @scala.inline
    implicit class AdadeltaOptimizerConfigMutableBuilder[Self <: AdadeltaOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRho(value: Double): Self = StObject.set(x, "rho", value.asInstanceOf[js.Any])
    }
  }
  
  type AdadeltaSerialization = BaseSerialization[Adadelta, AdadeltaOptimizerConfig]
  
  @js.native
  trait AdagradOptimizerConfig extends StObject {
    
    var initial_accumulator_value: js.UndefOr[Double] = js.native
    
    var learning_rate: Double = js.native
  }
  object AdagradOptimizerConfig {
    
    @scala.inline
    def apply(learning_rate: Double): AdagradOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdagradOptimizerConfig]
    }
    
    @scala.inline
    implicit class AdagradOptimizerConfigMutableBuilder[Self <: AdagradOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial_accumulator_value(value: Double): Self = StObject.set(x, "initial_accumulator_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial_accumulator_valueUndefined: Self = StObject.set(x, "initial_accumulator_value", js.undefined)
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type AdagradSerialization = BaseSerialization[Adagrad, AdagradOptimizerConfig]
  
  @js.native
  trait AdamOptimizerConfig extends StObject {
    
    var beta1: Double = js.native
    
    var beta2: Double = js.native
    
    var epsilon: js.UndefOr[Double] = js.native
    
    var learning_rate: Double = js.native
  }
  object AdamOptimizerConfig {
    
    @scala.inline
    def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamOptimizerConfig = {
      val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdamOptimizerConfig]
    }
    
    @scala.inline
    implicit class AdamOptimizerConfigMutableBuilder[Self <: AdamOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeta1(value: Double): Self = StObject.set(x, "beta1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta2(value: Double): Self = StObject.set(x, "beta2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type AdamSerialization = BaseSerialization[Adam, AdamOptimizerConfig]
  
  @js.native
  trait AdamaxOptimizerConfig extends StObject {
    
    var beta1: Double = js.native
    
    var beta2: Double = js.native
    
    var decay: js.UndefOr[Double] = js.native
    
    var epsilon: js.UndefOr[Double] = js.native
    
    var learning_rate: Double = js.native
  }
  object AdamaxOptimizerConfig {
    
    @scala.inline
    def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamaxOptimizerConfig = {
      val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdamaxOptimizerConfig]
    }
    
    @scala.inline
    implicit class AdamaxOptimizerConfigMutableBuilder[Self <: AdamaxOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeta1(value: Double): Self = StObject.set(x, "beta1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta2(value: Double): Self = StObject.set(x, "beta2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type AdamaxSerialization = BaseSerialization[Adamax, AdamaxOptimizerConfig]
  
  @js.native
  trait MomentumOptimizerConfig extends StObject {
    
    var learning_rate: Double = js.native
    
    var momentum: Double = js.native
    
    var use_nesterov: js.UndefOr[Boolean] = js.native
  }
  object MomentumOptimizerConfig {
    
    @scala.inline
    def apply(learning_rate: Double, momentum: Double): MomentumOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any])
      __obj.asInstanceOf[MomentumOptimizerConfig]
    }
    
    @scala.inline
    implicit class MomentumOptimizerConfigMutableBuilder[Self <: MomentumOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_nesterov(value: Boolean): Self = StObject.set(x, "use_nesterov", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_nesterovUndefined: Self = StObject.set(x, "use_nesterov", js.undefined)
    }
  }
  
  type MomentumSerialization = BaseSerialization[Momentum, MomentumOptimizerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum
  */
  trait OptimizerClassName extends StObject
  object OptimizerClassName {
    
    @scala.inline
    def Adadelta: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta = "Adadelta".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta]
    
    @scala.inline
    def Adagrad: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad = "Adagrad".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad]
    
    @scala.inline
    def Adam: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam = "Adam".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam]
    
    @scala.inline
    def Adamax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax = "Adamax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax]
    
    @scala.inline
    def Momentum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum = "Momentum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum]
    
    @scala.inline
    def RMSProp: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp = "RMSProp".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp]
    
    @scala.inline
    def SGD: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD = "SGD".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD]
  }
  
  type OptimizerSerialization = AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  
  @js.native
  trait RMSPropOptimizerConfig extends StObject {
    
    var centered: js.UndefOr[Boolean] = js.native
    
    var decay: js.UndefOr[Double] = js.native
    
    var epsilon: js.UndefOr[Double] = js.native
    
    var learning_rate: Double = js.native
    
    var momentum: js.UndefOr[Double] = js.native
  }
  object RMSPropOptimizerConfig {
    
    @scala.inline
    def apply(learning_rate: Double): RMSPropOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[RMSPropOptimizerConfig]
    }
    
    @scala.inline
    implicit class RMSPropOptimizerConfigMutableBuilder[Self <: RMSPropOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    }
  }
  
  type RMSPropSerialization = BaseSerialization[RMSProp, RMSPropOptimizerConfig]
  
  @js.native
  trait SGDOptimizerConfig extends StObject {
    
    var learning_rate: Double = js.native
  }
  object SGDOptimizerConfig {
    
    @scala.inline
    def apply(learning_rate: Double): SGDOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SGDOptimizerConfig]
    }
    
    @scala.inline
    implicit class SGDOptimizerConfigMutableBuilder[Self <: SGDOptimizerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type SGDSerialization = BaseSerialization[SGD, SGDOptimizerConfig]
}
