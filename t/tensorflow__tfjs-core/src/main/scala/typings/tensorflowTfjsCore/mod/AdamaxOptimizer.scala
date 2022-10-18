package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "AdamaxOptimizer")
@js.native
open class AdamaxOptimizer protected ()
  extends typings.tensorflowTfjsCore.distBaseMod.AdamaxOptimizer {
  def this(learningRate: Double, beta1: Double, beta2: Double) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double, decay: Double) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Unit, decay: Double) = this()
}
/* static members */
object AdamaxOptimizer {
  
  @JSImport("@tensorflow/tfjs-core", "AdamaxOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-core", "AdamaxOptimizer.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
