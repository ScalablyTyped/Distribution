package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOptimizersOptimizerMod.Optimizer
import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersRmspropOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer")
  @js.native
  open class RMSPropOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, decay: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double) = this()
    def this(learningRate: Double, decay: Unit, momentum: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Unit, epsilon: Double) = this()
    def this(learningRate: Double, decay: Unit, momentum: Double, epsilon: Double) = this()
    def this(learningRate: Double, decay: Unit, momentum: Unit, epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double, centered: Boolean) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Unit, centered: Boolean) = this()
    def this(learningRate: Double, decay: Double, momentum: Unit, epsilon: Double, centered: Boolean) = this()
    def this(learningRate: Double, decay: Double, momentum: Unit, epsilon: Unit, centered: Boolean) = this()
    def this(learningRate: Double, decay: Unit, momentum: Double, epsilon: Double, centered: Boolean) = this()
    def this(learningRate: Double, decay: Unit, momentum: Double, epsilon: Unit, centered: Boolean) = this()
    def this(learningRate: Double, decay: Unit, momentum: Unit, epsilon: Double, centered: Boolean) = this()
    def this(learningRate: Double, decay: Unit, momentum: Unit, epsilon: Unit, centered: Boolean) = this()
    
    /* private */ var accumulatedMeanGrads: Any = js.native
    
    /* private */ var accumulatedMeanSquares: Any = js.native
    
    /* private */ var accumulatedMoments: Any = js.native
    
    /* private */ var centered: Any = js.native
    
    /* protected */ var decay: Double = js.native
    
    /* protected */ var epsilon: Double = js.native
    
    /* protected */ var learningRate: Double = js.native
    
    /* protected */ var momentum: Double = js.native
  }
  /* static members */
  object RMSPropOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
