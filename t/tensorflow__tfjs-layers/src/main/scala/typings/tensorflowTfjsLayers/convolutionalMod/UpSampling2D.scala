package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
@js.native
class UpSampling2D protected () extends Layer {
  def this(args: UpSampling2DLayerArgs) = this()
  val DEFAULT_SIZE: js.Array[Double] = js.native
  val dataFormat: DataFormat = js.native
  val size: js.Array[Double] = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
@js.native
object UpSampling2D extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

