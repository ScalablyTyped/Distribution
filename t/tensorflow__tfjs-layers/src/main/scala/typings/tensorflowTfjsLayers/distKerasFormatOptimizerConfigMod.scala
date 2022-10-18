package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.BaseSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatOptimizerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/optimizer_config", "optimizerClassNames")
  @js.native
  val optimizerClassNames: js.Array[OptimizerClassName] = js.native
  
  trait AdadeltaOptimizerConfig extends StObject {
    
    var epsilon: Double
    
    var learning_rate: Double
    
    var rho: Double
  }
  object AdadeltaOptimizerConfig {
    
    inline def apply(epsilon: Double, learning_rate: Double, rho: Double): AdadeltaOptimizerConfig = {
      val __obj = js.Dynamic.literal(epsilon = epsilon.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any], rho = rho.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdadeltaOptimizerConfig]
    }
    
    extension [Self <: AdadeltaOptimizerConfig](x: Self) {
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
      
      inline def setRho(value: Double): Self = StObject.set(x, "rho", value.asInstanceOf[js.Any])
    }
  }
  
  type AdadeltaSerialization = BaseSerialization[Adadelta, AdadeltaOptimizerConfig]
  
  trait AdagradOptimizerConfig extends StObject {
    
    var initial_accumulator_value: js.UndefOr[Double] = js.undefined
    
    var learning_rate: Double
  }
  object AdagradOptimizerConfig {
    
    inline def apply(learning_rate: Double): AdagradOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdagradOptimizerConfig]
    }
    
    extension [Self <: AdagradOptimizerConfig](x: Self) {
      
      inline def setInitial_accumulator_value(value: Double): Self = StObject.set(x, "initial_accumulator_value", value.asInstanceOf[js.Any])
      
      inline def setInitial_accumulator_valueUndefined: Self = StObject.set(x, "initial_accumulator_value", js.undefined)
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type AdagradSerialization = BaseSerialization[Adagrad, AdagradOptimizerConfig]
  
  trait AdamOptimizerConfig extends StObject {
    
    var beta1: Double
    
    var beta2: Double
    
    var epsilon: js.UndefOr[Double] = js.undefined
    
    var learning_rate: Double
  }
  object AdamOptimizerConfig {
    
    inline def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamOptimizerConfig = {
      val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdamOptimizerConfig]
    }
    
    extension [Self <: AdamOptimizerConfig](x: Self) {
      
      inline def setBeta1(value: Double): Self = StObject.set(x, "beta1", value.asInstanceOf[js.Any])
      
      inline def setBeta2(value: Double): Self = StObject.set(x, "beta2", value.asInstanceOf[js.Any])
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type AdamSerialization = BaseSerialization[Adam, AdamOptimizerConfig]
  
  trait AdamaxOptimizerConfig extends StObject {
    
    var beta1: Double
    
    var beta2: Double
    
    var decay: js.UndefOr[Double] = js.undefined
    
    var epsilon: js.UndefOr[Double] = js.undefined
    
    var learning_rate: Double
  }
  object AdamaxOptimizerConfig {
    
    inline def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamaxOptimizerConfig = {
      val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdamaxOptimizerConfig]
    }
    
    extension [Self <: AdamaxOptimizerConfig](x: Self) {
      
      inline def setBeta1(value: Double): Self = StObject.set(x, "beta1", value.asInstanceOf[js.Any])
      
      inline def setBeta2(value: Double): Self = StObject.set(x, "beta2", value.asInstanceOf[js.Any])
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type AdamaxSerialization = BaseSerialization[Adamax, AdamaxOptimizerConfig]
  
  trait MomentumOptimizerConfig extends StObject {
    
    var learning_rate: Double
    
    var momentum: Double
    
    var use_nesterov: js.UndefOr[Boolean] = js.undefined
  }
  object MomentumOptimizerConfig {
    
    inline def apply(learning_rate: Double, momentum: Double): MomentumOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any])
      __obj.asInstanceOf[MomentumOptimizerConfig]
    }
    
    extension [Self <: MomentumOptimizerConfig](x: Self) {
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
      
      inline def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setUse_nesterov(value: Boolean): Self = StObject.set(x, "use_nesterov", value.asInstanceOf[js.Any])
      
      inline def setUse_nesterovUndefined: Self = StObject.set(x, "use_nesterov", js.undefined)
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
    
    inline def Adadelta: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta = "Adadelta".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta]
    
    inline def Adagrad: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad = "Adagrad".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad]
    
    inline def Adam: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam = "Adam".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam]
    
    inline def Adamax: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax = "Adamax".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax]
    
    inline def Momentum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum = "Momentum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum]
    
    inline def RMSProp: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp = "RMSProp".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp]
    
    inline def SGD: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD = "SGD".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD]
  }
  
  type OptimizerSerialization = AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  
  trait RMSPropOptimizerConfig extends StObject {
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var decay: js.UndefOr[Double] = js.undefined
    
    var epsilon: js.UndefOr[Double] = js.undefined
    
    var learning_rate: Double
    
    var momentum: js.UndefOr[Double] = js.undefined
  }
  object RMSPropOptimizerConfig {
    
    inline def apply(learning_rate: Double): RMSPropOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[RMSPropOptimizerConfig]
    }
    
    extension [Self <: RMSPropOptimizerConfig](x: Self) {
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
      
      inline def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    }
  }
  
  type RMSPropSerialization = BaseSerialization[RMSProp, RMSPropOptimizerConfig]
  
  trait SGDOptimizerConfig extends StObject {
    
    var learning_rate: Double
  }
  object SGDOptimizerConfig {
    
    inline def apply(learning_rate: Double): SGDOptimizerConfig = {
      val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SGDOptimizerConfig]
    }
    
    extension [Self <: SGDOptimizerConfig](x: Self) {
      
      inline def setLearning_rate(value: Double): Self = StObject.set(x, "learning_rate", value.asInstanceOf[js.Any])
    }
  }
  
  type SGDSerialization = BaseSerialization[SGD, SGDOptimizerConfig]
}
