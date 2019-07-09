package typings
package atTensorflowTfjsDashLayersLib.distLayersPaddingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
@js.native
class ZeroPadding2D ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: ZeroPadding2DLayerArgs) = this()
  val dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = js.native
  val padding: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
@js.native
object ZeroPadding2D extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

