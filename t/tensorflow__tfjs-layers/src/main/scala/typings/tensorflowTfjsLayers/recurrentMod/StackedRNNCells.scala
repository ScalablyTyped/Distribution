package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
@js.native
class StackedRNNCells protected () extends RNNCell {
  def this(args: StackedRNNCellsArgs) = this()
  
  var cells: js.Array[RNNCell] = js.native
  
  @JSName("stateSize")
  val stateSize_StackedRNNCells: js.Array[Double] = js.native
}
/* static members */
object StackedRNNCells {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @scala.inline
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
}
