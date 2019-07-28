package typings.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling1D")
@js.native
abstract class Pooling1D protected () extends Layer {
  /**
    *
    * @param args Parameters for the Pooling layer.
    *
    * config.poolSize defaults to 2.
    */
  def this(args: Pooling1DLayerArgs) = this()
  val padding: PaddingMode = js.native
  val poolSize: js.Array[Double] = js.native
  val strides: js.Array[Double] = js.native
  /* protected */ def poolingFunction(
    inputs: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
}

