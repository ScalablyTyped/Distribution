package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
@js.native
open class RMSPropOptimizer protected ()
  extends typings.tensorflowTfjsCore.distBaseMod.RMSPropOptimizer {
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
  
  @JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
