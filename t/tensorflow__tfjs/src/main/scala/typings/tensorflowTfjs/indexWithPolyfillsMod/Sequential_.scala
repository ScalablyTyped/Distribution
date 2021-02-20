package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsLayers.modelsMod.SequentialArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential")
@js.native
class Sequential_ ()
  extends typings.tensorflowTfjs.mod.Sequential_ {
  def this(args: SequentialArgs) = this()
}
/* static members */
object Sequential_ {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Sequential.fromConfig")
  @js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}
