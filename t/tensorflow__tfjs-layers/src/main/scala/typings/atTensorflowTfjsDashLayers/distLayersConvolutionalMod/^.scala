package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double): Tensor[Rank] = js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String, dataFormat: DataFormat): Tensor[Rank] = js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double): Tensor[Rank] = js.native
  def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: Activation
  ): Tensor[Rank] = js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def preprocessConv2DInput(x: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = js.native
  def preprocessConv3DInput(x: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = js.native
}

