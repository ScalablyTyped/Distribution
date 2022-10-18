package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.Serializable
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "MomentumOptimizer")
@js.native
open class MomentumOptimizer protected ()
  extends typings.tensorflowTfjsCore.distBaseMod.MomentumOptimizer {
  def this(learningRate: Double, momentum: Double) = this()
  def this(learningRate: Double, momentum: Double, useNesterov: Boolean) = this()
}
/* static members */
object MomentumOptimizer {
  
  @JSImport("@tensorflow/tfjs-core", "MomentumOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-core", "MomentumOptimizer.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
