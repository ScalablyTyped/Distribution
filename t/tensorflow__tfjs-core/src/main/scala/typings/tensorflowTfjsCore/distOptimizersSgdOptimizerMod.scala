package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOptimizersOptimizerMod.Optimizer
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersSgdOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
  @js.native
  open class SGDOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    
    /* protected */ var c: Scalar = js.native
    
    /* protected */ var learningRate: Double = js.native
    
    /**
      * Sets the learning rate of the optimizer.
      */
    def setLearningRate(learningRate: Double): Unit = js.native
  }
  /* static members */
  object SGDOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
