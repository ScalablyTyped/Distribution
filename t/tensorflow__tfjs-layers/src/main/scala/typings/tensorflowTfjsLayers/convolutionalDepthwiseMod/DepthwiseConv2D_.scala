package typings.tensorflowTfjsLayers.convolutionalDepthwiseMod

import typings.tensorflowTfjsLayers.convolutionalMod.BaseConv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
@js.native
class DepthwiseConv2D_ protected () extends BaseConv {
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
object DepthwiseConv2D_ extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
