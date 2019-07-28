package typings.atTensorflowTfjsDashLayers.distLayersNoiseMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
class AlphaDropout protected () extends Layer {
  def this(args: AlphaDropoutArgs) = this()
  val noiseShape: Shape = js.native
  val rate: Double = js.native
  def _getNoiseShape(inputs: js.Array[Tensor[Rank]]): js.Array[Double] = js.native
  def _getNoiseShape(inputs: Tensor[Rank]): js.Array[Double] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
object AlphaDropout extends js.Object {
  var className: String = js.native
}

