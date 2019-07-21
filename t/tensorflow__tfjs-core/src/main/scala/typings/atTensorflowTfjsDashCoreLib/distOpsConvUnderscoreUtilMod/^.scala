package typings
package atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil,
    depthwise: scala.Boolean
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv2DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
  ): Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    depthwise: scala.Boolean
  ): Conv3DInfo = js.native
  def computeDefaultPad(inputShape: js.Tuple2[scala.Double, scala.Double], fieldSize: scala.Double, stride: scala.Double): scala.Double = js.native
  def computeDefaultPad(
    inputShape: js.Tuple2[scala.Double, scala.Double],
    fieldSize: scala.Double,
    stride: scala.Double,
    dilation: scala.Double
  ): scala.Double = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double
  ): Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
  ): Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsFirst | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.channelsLast
  ): Conv2DInfo = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Tuple2[scala.Double, scala.Double], dilations: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Tuple2[scala.Double, scala.Double], dilations: scala.Double): scala.Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: scala.Double, dilations: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: scala.Double, dilations: scala.Double): scala.Boolean = js.native
  def tupleValuesAreOne(param: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def tupleValuesAreOne(param: scala.Double): scala.Boolean = js.native
}

