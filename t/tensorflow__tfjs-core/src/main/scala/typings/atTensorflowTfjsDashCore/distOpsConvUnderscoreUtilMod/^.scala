package typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsFirst
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsLast
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil,
    depthwise: Boolean
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast
  ): Conv2DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: same,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: valid,
    depthwise: Boolean,
    dataFormat: channelsLast
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: same,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: same,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: same,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: same,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: valid,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: valid,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: valid,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double
  ): Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil
  ): Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil,
    dataFormat: channelsFirst | channelsLast
  ): Conv2DInfo = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Tuple2[Double, Double], dilations: js.Tuple2[Double, Double]): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Tuple2[Double, Double], dilations: Double): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Tuple2[Double, Double]): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = js.native
  def tupleValuesAreOne(param: js.Tuple2[Double, Double]): Boolean = js.native
  def tupleValuesAreOne(param: Double): Boolean = js.native
}

