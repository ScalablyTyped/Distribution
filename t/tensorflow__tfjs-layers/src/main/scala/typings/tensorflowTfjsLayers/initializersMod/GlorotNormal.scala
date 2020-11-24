package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotNormal")
@js.native
/**
  * Constructor of GlorotNormal.
  * @param scale
  * @param mode
  * @param distribution
  * @param seed
  */
class GlorotNormal () extends VarianceScaling {
  def this(args: SeedOnlyInitializerArgs) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotNormal")
@js.native
object GlorotNormal extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
