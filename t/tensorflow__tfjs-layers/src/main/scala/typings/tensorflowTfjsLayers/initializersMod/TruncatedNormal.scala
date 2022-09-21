package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal")
@js.native
open class TruncatedNormal protected () extends Initializer {
  def this(args: TruncatedNormalArgs) = this()
  
  val DEFAULT_MEAN: /* 0 */ Double = js.native
  
  val DEFAULT_STDDEV: /* 0.05 */ Double = js.native
  
  /* private */ var mean: Any = js.native
  
  /* private */ var seed: Any = js.native
  
  /* private */ var stddev: Any = js.native
}
/* static members */
object TruncatedNormal {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
