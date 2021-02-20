package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.sgdOptimizerMod.SGDOptimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentumOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer")
  @js.native
  class MomentumOptimizer protected () extends SGDOptimizer {
    def this(learningRate: Double, momentum: Double) = this()
    def this(learningRate: Double, momentum: Double, useNesterov: Boolean) = this()
    
    var accumulations: js.Any = js.native
    
    var m: js.Any = js.native
    
    var momentum: js.Any = js.native
    
    /**
      * Sets the momentum of the optimizer.
      *
      * @param momentum
      */
    def setMomentum(momentum: Double): Unit = js.native
    
    var useNesterov: js.Any = js.native
  }
  /* static members */
  object MomentumOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
