package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D")
@js.native
class Conv3D protected () extends Conv {
  def this(args: ConvLayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D")
@js.native
object Conv3D extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /* protected */ def verifyArgs(args: ConvLayerArgs): Unit = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
}

