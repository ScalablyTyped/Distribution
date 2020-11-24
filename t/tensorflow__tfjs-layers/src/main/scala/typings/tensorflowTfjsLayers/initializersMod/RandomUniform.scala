package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform")
@js.native
class RandomUniform protected () extends Initializer {
  def this(args: RandomUniformArgs) = this()
  
  val DEFAULT_MAXVAL: /* 0.05 */ Double = js.native
  
  val DEFAULT_MINVAL: /* -0.05 */ Double = js.native
  
  var maxval: js.Any = js.native
  
  var minval: js.Any = js.native
  
  var seed: js.Any = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform")
@js.native
object RandomUniform extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
