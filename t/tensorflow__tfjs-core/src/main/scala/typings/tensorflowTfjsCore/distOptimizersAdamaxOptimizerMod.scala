package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOptimizersOptimizerMod.Optimizer
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersAdamaxOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer")
  @js.native
  open class AdamaxOptimizer protected () extends Optimizer {
    def this(learningRate: Double, beta1: Double, beta2: Double) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double, decay: Double) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Unit, decay: Double) = this()
    
    /* private */ var accBeta1: Any = js.native
    
    /* private */ var accumulatedFirstMoment: Any = js.native
    
    /* private */ var accumulatedWeightedInfNorm: Any = js.native
    
    /* protected */ var beta1: Double = js.native
    
    /* protected */ var beta2: Double = js.native
    
    /* protected */ var decay: Double = js.native
    
    /* protected */ var epsilon: Double = js.native
    
    /* private */ var iteration: Any = js.native
    
    /* protected */ var learningRate: Double = js.native
  }
  /* static members */
  object AdamaxOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
