package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
@js.native
open class SGDOptimizer protected ()
  extends typings.tensorflowTfjsCore.distBaseMod.SGDOptimizer {
  def this(learningRate: Double) = this()
}
/* static members */
object SGDOptimizer {
  
  @JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-core", "SGDOptimizer.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
