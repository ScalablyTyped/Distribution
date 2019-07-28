package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalUnderscoreDepthwiseMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank]): Tensor[Rank] = js.native
  def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank], strides: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String
  ): Tensor[Rank] = js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
}

