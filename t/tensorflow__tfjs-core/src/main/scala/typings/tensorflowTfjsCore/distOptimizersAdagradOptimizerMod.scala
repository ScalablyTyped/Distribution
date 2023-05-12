package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOptimizersOptimizerMod.Optimizer
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersAdagradOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer")
  @js.native
  open class AdagradOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, initialAccumulatorValue: Double) = this()
    
    /* private */ var accumulatedGrads: Any = js.native
    
    /* private */ var initialAccumulatorValue: Any = js.native
    
    /* protected */ var learningRate: Double = js.native
  }
  /* static members */
  object AdagradOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
