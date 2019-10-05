package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
@js.native
object conv2dWithBiasActivation extends js.Object {
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: Activation
  ): Tensor[Rank] = js.native
}

