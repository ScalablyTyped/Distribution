package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomNormal")
@js.native
class RandomNormal protected () extends Initializer {
  def this(args: RandomNormalArgs) = this()
  
  val DEFAULT_MEAN: /* 0 */ Double = js.native
  
  val DEFAULT_STDDEV: /* 0.05 */ Double = js.native
  
  var mean: js.Any = js.native
  
  var seed: js.Any = js.native
  
  var stddev: js.Any = js.native
}
/* static members */
object RandomNormal {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomNormal")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomNormal.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
