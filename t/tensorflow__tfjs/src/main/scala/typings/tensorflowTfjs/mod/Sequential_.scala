package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distModelsMod.SequentialArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "Sequential")
@js.native
open class Sequential_ ()
  extends typings.tensorflowTfjsLayers.mod.Sequential_ {
  def this(args: SequentialArgs) = this()
}
/* static members */
object Sequential_ {
  
  @JSImport("@tensorflow/tfjs", "Sequential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs", "Sequential.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: Unit, fastWeightInit: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
}
