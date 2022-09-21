package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Activation")
@js.native
open class Activation protected () extends Layer {
  def this(args: ActivationLayerArgs) = this()
  
  var activation: typings.tensorflowTfjsLayers.activationsMod.Activation = js.native
}
/* static members */
object Activation {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Activation")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Activation.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
