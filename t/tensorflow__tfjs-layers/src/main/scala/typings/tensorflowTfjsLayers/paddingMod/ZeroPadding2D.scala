package typings.tensorflowTfjsLayers.paddingMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
@js.native
class ZeroPadding2D () extends Layer {
  def this(args: ZeroPadding2DLayerArgs) = this()
  
  val dataFormat: DataFormat = js.native
  
  val padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
@js.native
object ZeroPadding2D extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
