package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalUnderscoreDepthwiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
@js.native
class DepthwiseConv2D protected ()
  extends atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.BaseConv {
  def this(args: DepthwiseConv2DLayerArgs) = this()
  val depthMultiplier: js.Any = js.native
  val depthwiseConstraint: js.Any = js.native
  val depthwiseInitializer: js.Any = js.native
  var depthwiseKernel: js.Any = js.native
  val depthwiseRegularizer: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
@js.native
object DepthwiseConv2D extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

