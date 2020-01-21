package typings.tensorflowTfjsLayers.noiseMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
class AlphaDropout protected () extends Layer {
  def this(args: AlphaDropoutArgs) = this()
  val noiseShape: Shape = js.native
  val rate: Double = js.native
  def _getNoiseShape(inputs: js.Array[Tensor_[Rank]]): js.Array[Double] = js.native
  def _getNoiseShape(inputs: Tensor_[Rank]): js.Array[Double] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
object AlphaDropout extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

