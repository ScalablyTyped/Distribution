package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D")
@js.native
class Conv2D protected () extends Conv {
  def this(args: ConvLayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D")
@js.native
object Conv2D extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /* protected */ def verifyArgs(args: ConvLayerArgs): Unit = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
@js.native
object conv2d extends js.Object {
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
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
}

