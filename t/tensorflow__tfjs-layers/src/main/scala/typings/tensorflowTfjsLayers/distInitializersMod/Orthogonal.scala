package typings.tensorflowTfjsLayers.distInitializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal")
@js.native
open class Orthogonal () extends Initializer {
  def this(args: OrthogonalArgs) = this()
  
  val DEFAULT_GAIN: /* 1 */ Double = js.native
  
  /* protected */ val gain: Double = js.native
  
  /* protected */ val seed: Double = js.native
}
/* static members */
object Orthogonal {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
