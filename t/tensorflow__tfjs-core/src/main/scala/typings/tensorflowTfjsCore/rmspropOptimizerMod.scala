package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.optimizerMod.Optimizer
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rmspropOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer")
  @js.native
  class RMSPropOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, decay: Double) = this()
    def this(learningRate: Double, decay: js.UndefOr[scala.Nothing], momentum: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: js.UndefOr[scala.Nothing],
      epsilon: Double
    ) = this()
    def this(learningRate: Double, decay: js.UndefOr[scala.Nothing], momentum: Double, epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: js.UndefOr[scala.Nothing], epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: js.UndefOr[scala.Nothing],
      epsilon: Double,
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: Double,
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: js.UndefOr[scala.Nothing],
      momentum: Double,
      epsilon: Double,
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: Double,
      momentum: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: Double,
      momentum: js.UndefOr[scala.Nothing],
      epsilon: Double,
      centered: Boolean
    ) = this()
    def this(
      learningRate: Double,
      decay: Double,
      momentum: Double,
      epsilon: js.UndefOr[scala.Nothing],
      centered: Boolean
    ) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double, centered: Boolean) = this()
    
    var accumulatedMeanGrads: js.Any = js.native
    
    var accumulatedMeanSquares: js.Any = js.native
    
    var accumulatedMoments: js.Any = js.native
    
    var centered: js.Any = js.native
    
    var decay: Double = js.native
    
    var epsilon: Double = js.native
    
    var learningRate: Double = js.native
    
    var momentum: Double = js.native
  }
  /* static members */
  object RMSPropOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
}
