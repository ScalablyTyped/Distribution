package typings.tensorflowTfjsLayers.convolutionalDepthwiseMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
@js.native
object depthwiseConv2d extends js.Object {
  def apply(x: Tensor_[Rank], depthwiseKernel: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], depthwiseKernel: Tensor_[Rank], strides: js.Tuple2[Double, Double]): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    depthwiseKernel: Tensor_[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    depthwiseKernel: Tensor_[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    depthwiseKernel: Tensor_[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor_[Rank] = js.native
}

