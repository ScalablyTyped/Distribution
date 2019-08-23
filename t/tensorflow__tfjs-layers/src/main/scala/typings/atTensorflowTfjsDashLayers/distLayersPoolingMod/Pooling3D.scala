package typings.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling3D")
@js.native
abstract class Pooling3D protected () extends Layer {
  def this(args: Pooling3DLayerArgs) = this()
  val dataFormat: DataFormat = js.native
  val padding: PaddingMode = js.native
  val poolSize: js.Tuple3[Double, Double, Double] = js.native
  val strides: js.Tuple3[Double, Double, Double] = js.native
  /* protected */ def poolingFunction(
    inputs: Tensor[Rank],
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
}

