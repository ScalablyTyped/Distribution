package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "RepeatVector")
@js.native
class RepeatVector protected () extends Layer {
  def this(args: RepeatVectorLayerArgs) = this()
  val n: Double = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "RepeatVector")
@js.native
object RepeatVector extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

