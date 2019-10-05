package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCDHW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCHW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NDHWC
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NHWC
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.channelsFirst
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.channelsLast
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.round
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv3DInfo
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util")
@js.native
object backend_util extends js.Object {
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = js.native
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = js.native
  def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = js.native
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = js.native
  def castTensor[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
    x: T,
    dtype: DataType,
    backend: typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
  ): T = js.native
  def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
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
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    dilations: js.Tuple2[Double, Double],
    pad: Double
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    dilations: Double,
    pad: Double
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple2[Double, Double],
    pad: Double
  ): Conv2DInfo = js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: Double
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    dilations: js.Tuple2[Double, Double],
    pad: same
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    dilations: Double,
    pad: same
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple2[Double, Double],
    pad: same
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_same(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: same
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    dilations: js.Tuple2[Double, Double],
    pad: valid
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    dilations: Double,
    pad: valid
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple2[Double, Double],
    pad: valid
  ): Conv2DInfo = js.native
  @JSName("computeConv2DInfo")
  def computeConv2DInfo_valid(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: valid
  ): Conv2DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast,
    roundingMode: floor | round | ceil
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: Double
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: js.Tuple3[Double, Double, Double],
    pad: Double,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: Double
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    dilations: Double,
    pad: Double,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: Double
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: js.Tuple3[Double, Double, Double],
    pad: Double,
    depthwise: Boolean
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: Double
  ): Conv3DInfo = js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    dilations: Double,
    pad: Double,
    depthwise: Boolean
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
  def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = js.native
  def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = js.native
  def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = js.native
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
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double
  ): Conv3DInfo = js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil
  ): Conv3DInfo = js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil,
    dataFormat: NDHWC | NCDHW
  ): Conv3DInfo = js.native
  @JSName("convertConv2DDataFormat")
  def convertConv2DDataFormat_NCHW(dataFormat: NCHW): channelsLast | channelsFirst = js.native
  @JSName("convertConv2DDataFormat")
  def convertConv2DDataFormat_NHWC(dataFormat: NHWC): channelsLast | channelsFirst = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = js.native
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = js.native
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = js.native
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = js.native
  def linspaceImpl(start: Double, stop: Double, num: Double): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R1] = js.native
  def reshapeTensor[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, R /* <: Rank */](
    x: T,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def tupleValuesAreOne(param: js.Array[Double]): Boolean = js.native
  def tupleValuesAreOne(param: Double): Boolean = js.native
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
}

