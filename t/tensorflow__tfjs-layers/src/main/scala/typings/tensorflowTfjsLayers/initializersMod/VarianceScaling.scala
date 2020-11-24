package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "VarianceScaling")
@js.native
class VarianceScaling protected () extends Initializer {
  /**
    * Constructor of VarianceScaling.
    * @throws ValueError for invalid value in scale.
    */
  def this(args: VarianceScalingArgs) = this()
  
  var distribution: js.Any = js.native
  
  var mode: js.Any = js.native
  
  var scale: js.Any = js.native
  
  var seed: js.Any = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "VarianceScaling")
@js.native
object VarianceScaling extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
