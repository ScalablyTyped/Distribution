package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Permute")
@js.native
open class Permute protected () extends Layer {
  def this(args: PermuteLayerArgs) = this()
  
  val dims: js.Array[Double] = js.native
  
  /* private */ val dimsIncludingBatch: Any = js.native
}
/* static members */
object Permute {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Permute")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Permute.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
