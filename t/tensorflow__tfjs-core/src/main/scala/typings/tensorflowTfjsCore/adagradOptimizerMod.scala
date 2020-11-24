package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.optimizerMod.Optimizer
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", JSImport.Namespace)
@js.native
object adagradOptimizerMod extends js.Object {
  
  @js.native
  class AdagradOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, initialAccumulatorValue: Double) = this()
    
    var accumulatedGrads: js.Any = js.native
    
    var initialAccumulatorValue: js.Any = js.native
    
    var learningRate: Double = js.native
  }
  /* static members */
  @js.native
  object AdagradOptimizer extends js.Object {
    
    /** @nocollapse */
    var className: String = js.native
    
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
