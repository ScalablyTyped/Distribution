package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform")
@js.native
open class RandomUniform protected () extends Initializer {
  def this(args: RandomUniformArgs) = this()
  
  val DEFAULT_MAXVAL: /* 0.05 */ Double = js.native
  
  val DEFAULT_MINVAL: /* -0.05 */ Double = js.native
  
  /* private */ var maxval: Any = js.native
  
  /* private */ var minval: Any = js.native
  
  /* private */ var seed: Any = js.native
}
/* static members */
object RandomUniform {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
