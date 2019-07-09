package typings
package atTensorflowTfjsDashLayersLib.distLayersPoolingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling1D")
@js.native
abstract class Pooling1D protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  /**
    *
    * @param args Parameters for the Pooling layer.
    *
    * config.poolSize defaults to 2.
    */
  def this(args: Pooling1DLayerArgs) = this()
  val padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = js.native
  val poolSize: js.Array[scala.Double] = js.native
  val strides: js.Array[scala.Double] = js.native
  /* protected */ def poolingFunction(
    inputs: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
}

