package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.sgdOptimizerMod.SGDOptimizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", JSImport.Namespace)
@js.native
object momentumOptimizerMod extends js.Object {
  
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
  @js.native
  object MomentumOptimizer extends js.Object {
    
    /** @nocollapse */
    var className: String = js.native
    
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
