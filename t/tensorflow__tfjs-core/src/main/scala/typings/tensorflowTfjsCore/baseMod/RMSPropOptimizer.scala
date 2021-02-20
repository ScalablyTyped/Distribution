package typings.tensorflowTfjsCore.baseMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "RMSPropOptimizer")
@js.native
class RMSPropOptimizer protected ()
  extends typings.tensorflowTfjsCore.rmspropOptimizerMod.RMSPropOptimizer {
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
}
/* static members */
object RMSPropOptimizer {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "RMSPropOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-core/dist/base", "RMSPropOptimizer.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-core/dist/base", "RMSPropOptimizer.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
