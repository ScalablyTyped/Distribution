package typings
package atTensorflowTfjsDashLayersLib.distLayersNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
class AlphaDropout protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: AlphaDropoutArgs) = this()
  val noiseShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = js.native
  val rate: scala.Double = js.native
  def _getNoiseShape(
    inputs: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Array[scala.Double] = js.native
  def _getNoiseShape(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Array[scala.Double] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
@js.native
object AlphaDropout extends js.Object {
  var className: java.lang.String = js.native
}

