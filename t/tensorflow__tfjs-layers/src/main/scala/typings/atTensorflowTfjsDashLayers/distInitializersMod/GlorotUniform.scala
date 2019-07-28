package typings.atTensorflowTfjsDashLayers.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotUniform")
@js.native
/**
  * Constructor of GlorotUniform
  * @param scale
  * @param mode
  * @param distribution
  * @param seed
  */
class GlorotUniform () extends VarianceScaling {
  def this(args: SeedOnlyInitializerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotUniform")
@js.native
object GlorotUniform extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

