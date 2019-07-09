package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util")
@js.native
object backendUnderscoreUtilNs extends js.Object {
  def assertAndGetBroadcastShape(shapeA: js.Array[scala.Double], shapeB: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def assertAxesAreInnerMostDims(msg: java.lang.String, axes: js.Array[scala.Double], rank: scala.Double): scala.Unit = js.native
  def assertParamsConsistent(shapes: js.Array[js.Array[scala.Double]], axis: scala.Double): scala.Unit = js.native
  def axesAreInnerMostDims(axes: js.Array[scala.Double], rank: scala.Double): scala.Boolean = js.native
  def castTensor[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: T,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend
  ): T = js.native
  def combineLocations(outputLoc: js.Array[scala.Double], reduceLoc: js.Array[scala.Double], axes: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    dilations: js.Tuple2[scala.Double, scala.Double],
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    dilations: scala.Double,
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple2[scala.Double, scala.Double],
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    dilations: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    dilations: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_same(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  @JSName("computeConv3DInfo")
  def computeConv3DInfo_valid(
    inShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    filterShape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    dilations: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    depthwise: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo = js.native
  def computeDefaultPad(
    inputShape: js.Tuple3[scala.Double, scala.Double, scala.Double],
    fieldSize: scala.Double,
    stride: scala.Double
  ): scala.Double = js.native
  def computeDefaultPad(
    inputShape: js.Tuple3[scala.Double, scala.Double, scala.Double],
    fieldSize: scala.Double,
    stride: scala.Double,
    dilation: scala.Double
  ): scala.Double = js.native
  def computeOutAndReduceShapes(aShape: js.Array[scala.Double], axes: js.Array[scala.Double]): js.Tuple2[js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def computeOutShape(shapes: js.Array[js.Array[scala.Double]], axis: scala.Double): js.Array[scala.Double] = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | scala.Double
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def computePool2DInfo(
    inShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    dilations: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | scala.Double,
    roundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsFirst | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.channelsLast
  ): atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Tuple2[scala.Double, scala.Double], dilations: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Tuple2[scala.Double, scala.Double], dilations: scala.Double): scala.Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: scala.Double, dilations: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: scala.Double, dilations: scala.Double): scala.Boolean = js.native
  def expandShapeToKeepDim(shape: js.Array[scala.Double], axes: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getAxesPermutation(axes: js.Array[scala.Double], rank: scala.Double): js.Array[scala.Double] | scala.Null = js.native
  def getBroadcastDims(inShape: js.Array[scala.Double], outShape: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getInnerMostAxes(numAxes: scala.Double, rank: scala.Double): js.Array[scala.Double] = js.native
  def getReductionAxes(inShape: js.Array[scala.Double], outShape: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getUndoAxesPermutation(axes: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def linspaceImpl(start: scala.Double, stop: scala.Double, num: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R1] = js.native
  def reshapeTensor[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: T,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def tupleValuesAreOne(param: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def tupleValuesAreOne(param: scala.Double): scala.Boolean = js.native
  def upcastType(
    typeA: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    typeB: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTypesMod.DataType = js.native
}

