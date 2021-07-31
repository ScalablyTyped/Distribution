package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.optimizerMod.Optimizer
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sgdOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
  @js.native
  class SGDOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    
    var c: Scalar = js.native
    
    var learningRate: Double = js.native
    
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @scala.inline
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
