package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.optimizerMod.Optimizer
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adam_optimizer", JSImport.Namespace)
@js.native
object adamOptimizerMod extends js.Object {
  
  @js.native
  class AdamOptimizer protected () extends Optimizer {
    def this(learningRate: Double, beta1: Double, beta2: Double) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
    
    var accBeta1: js.Any = js.native
    
    var accBeta2: js.Any = js.native
    
    var accumulatedFirstMoment: js.Any = js.native
    
    var accumulatedSecondMoment: js.Any = js.native
    
    var beta1: Double = js.native
    
    var beta2: Double = js.native
    
    var epsilon: Double = js.native
    
    var learningRate: Double = js.native
  }
  /* static members */
  @js.native
  object AdamOptimizer extends js.Object {
    
    /** @nocollapse */
    var className: String = js.native
    
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
