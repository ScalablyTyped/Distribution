package typings
package atTensorflowTfjsDashLayersLib.distLayersCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "RepeatVector")
@js.native
class RepeatVector protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: RepeatVectorLayerArgs) = this()
  val n: scala.Double = js.native
  def computeOutputShape(inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "RepeatVector")
@js.native
object RepeatVector extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

