package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "RMSPropOptimizer")
@js.native
class RMSPropOptimizer protected ()
  extends typings.tensorflowTfjsCore.mod.RMSPropOptimizer {
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
}
/* static members */
object RMSPropOptimizer {
  
  @JSImport("@tensorflow/tfjs", "RMSPropOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs", "RMSPropOptimizer.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @scala.inline
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
