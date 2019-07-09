package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
@js.native
class UpSampling2D protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: UpSampling2DLayerArgs) = this()
  val DEFAULT_SIZE: js.Array[scala.Double] = js.native
  val dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = js.native
  val size: js.Array[scala.Double] = js.native
  def computeOutputShape(inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
@js.native
object UpSampling2D extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

