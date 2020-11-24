package typings.tensorflowTfjsLayers.convolutionalDepthwiseMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
@js.native
object depthwiseConv2d extends js.Object {
  
  def apply(x: Tensor[Rank], depthwiseKernel: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], depthwiseKernel: Tensor[Rank], strides: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
}
