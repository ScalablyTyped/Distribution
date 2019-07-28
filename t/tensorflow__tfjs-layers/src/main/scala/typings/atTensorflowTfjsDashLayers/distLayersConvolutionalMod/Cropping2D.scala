package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
@js.native
class Cropping2D protected () extends Layer {
  def this(args: Cropping2DLayerArgs) = this()
  val cropping: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  val dataFormat: DataFormat = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
@js.native
object Cropping2D extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

