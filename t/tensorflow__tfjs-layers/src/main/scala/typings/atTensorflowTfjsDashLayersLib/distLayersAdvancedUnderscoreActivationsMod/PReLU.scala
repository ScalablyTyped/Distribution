package typings
package atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "PReLU")
@js.native
class PReLU ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: PReLULayerArgs) = this()
  val DEFAULT_ALPHA_INITIALIZER: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = js.native
  var alpha: js.Any = js.native
  val alphaConstraint: js.Any = js.native
  val alphaInitializer: js.Any = js.native
  val alphaRegularizer: js.Any = js.native
  val sharedAxes: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "PReLU")
@js.native
object PReLU extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

