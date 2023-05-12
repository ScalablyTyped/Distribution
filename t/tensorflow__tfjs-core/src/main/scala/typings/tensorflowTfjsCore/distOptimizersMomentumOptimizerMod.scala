package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOptimizersSgdOptimizerMod.SGDOptimizer
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersMomentumOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer")
  @js.native
  open class MomentumOptimizer protected () extends SGDOptimizer {
    def this(learningRate: Double, momentum: Double) = this()
    def this(learningRate: Double, momentum: Double, useNesterov: Boolean) = this()
    
    /* private */ var accumulations: Any = js.native
    
    /* private */ var m: Any = js.native
    
    /* private */ var momentum: Any = js.native
    
    /**
      * Sets the momentum of the optimizer.
      *
      * @param momentum
      */
    def setMomentum(momentum: Double): Unit = js.native
    
    /* private */ var useNesterov: Any = js.native
  }
  /* static members */
  object MomentumOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
