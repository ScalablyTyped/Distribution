package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
@js.native
class Cropping2D protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: Cropping2DLayerArgs) = this()
  val cropping: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  val dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = js.native
  def computeOutputShape(inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
@js.native
object Cropping2D extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

