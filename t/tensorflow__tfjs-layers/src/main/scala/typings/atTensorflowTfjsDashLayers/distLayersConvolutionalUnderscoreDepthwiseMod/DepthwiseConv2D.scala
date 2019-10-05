package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalUnderscoreDepthwiseMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.BaseConv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
@js.native
class DepthwiseConv2D protected () extends BaseConv {
  def this(args: DepthwiseConv2DLayerArgs) = this()
  val depthMultiplier: js.Any = js.native
  val depthwiseConstraint: js.Any = js.native
  val depthwiseInitializer: js.Any = js.native
  var depthwiseKernel: js.Any = js.native
  val depthwiseRegularizer: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
@js.native
object DepthwiseConv2D extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
@js.native
object depthwiseConv2d extends js.Object {
  def apply(x: Tensor[Rank], depthwiseKernel: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], depthwiseKernel: Tensor[Rank], strides: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
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

