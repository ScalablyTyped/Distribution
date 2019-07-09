package typings
package atTensorflowTfjsDashLayersLib.distLayersPoolingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling2D")
@js.native
abstract class Pooling2D protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: Pooling2DLayerArgs) = this()
  val dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = js.native
  val padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = js.native
  val poolSize: js.Tuple2[scala.Double, scala.Double] = js.native
  val strides: js.Tuple2[scala.Double, scala.Double] = js.native
  /* protected */ def poolingFunction(
    inputs: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
}

