package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
@js.native
object conv1dWithBias extends js.Object {
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
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
    dilationRate: Double
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
    dilationRate: Double
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
    dilationRate: Double
  ): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
}

