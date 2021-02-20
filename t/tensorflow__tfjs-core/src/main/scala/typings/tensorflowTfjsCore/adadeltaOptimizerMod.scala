package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.optimizerMod.Optimizer
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adadeltaOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer")
  @js.native
  class AdadeltaOptimizer protected () extends Optimizer {
    def this(learningRate: Double, rho: Double) = this()
    def this(learningRate: Double, rho: Double, epsilon: Double) = this()
    
    var accumulatedGrads: js.Any = js.native
    
    var accumulatedUpdates: js.Any = js.native
    
    var epsilon: Double = js.native
    
    var learningRate: Double = js.native
    
    var rho: Double = js.native
  }
  /* static members */
  object AdadeltaOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
