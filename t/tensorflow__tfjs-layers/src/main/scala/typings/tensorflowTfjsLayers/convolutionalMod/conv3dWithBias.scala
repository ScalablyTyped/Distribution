package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
@js.native
object conv3dWithBias extends js.Object {
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
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
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
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
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
}

