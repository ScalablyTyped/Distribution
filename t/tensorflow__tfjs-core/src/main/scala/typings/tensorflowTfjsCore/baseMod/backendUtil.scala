package typings.tensorflowTfjsCore.baseMod

import typings.std.Float32Array
import typings.tensorflowTfjsCore.anon.Begin
import typings.tensorflowTfjsCore.anon.Imag
import typings.tensorflowTfjsCore.anon.Real
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import typings.tensorflowTfjsCore.segmentUtilMod.GatherOpShapeInfo
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendUtil {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.ERF_A1")
  @js.native
  val ERF_A1: /* 0.254829592 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.ERF_A2")
  @js.native
  val ERF_A2: /* -0.284496736 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.ERF_A3")
  @js.native
  val ERF_A3: /* 1.421413741 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.ERF_A4")
  @js.native
  val ERF_A4: /* -1.453152027 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.ERF_A5")
  @js.native
  val ERF_A5: /* 1.061405429 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.ERF_P")
  @js.native
  val ERF_P: /* 0.3275911 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.PARALLELIZE_THRESHOLD")
  @js.native
  val PARALLELIZE_THRESHOLD: /* 30 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.SELU_SCALE")
  @js.native
  val SELU_SCALE: /* 1.0507009873554805 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.SELU_SCALEALPHA")
  @js.native
  val SELU_SCALEALPHA: /* 1.7580993408473768 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.applyActivation")
  @js.native
  def applyActivation(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], activation: Activation): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.applyActivation")
  @js.native
  def applyActivation(
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    activation: Activation,
    preluActivationWeights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.assertAndGetBroadcastShape")
  @js.native
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.assertAxesAreInnerMostDims")
  @js.native
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.assertParamsConsistent")
  @js.native
  def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.assignToTypedArray")
  @js.native
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.axesAreInnerMostDims")
  @js.native
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.calculateShapes")
  @js.native
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.castTensor")
  @js.native
  def castTensor[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, dtype: DataType, backend: typings.tensorflowTfjsCore.backendMod.KernelBackend): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.combineLocations")
  @js.native
  def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.complexWithEvenIndex")
  @js.native
  def complexWithEvenIndex(complex: Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.complexWithOddIndex")
  @js.native
  def complexWithOddIndex(complex: Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeConv2DInfo")
  @js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double | ExplicitPadding,
    roundingMode: js.UndefOr[
      typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ],
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeConv3DInfo")
  @js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast],
    roundingMode: js.UndefOr[
      typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ]
  ): Conv3DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeOptimalWindowSize")
  @js.native
  def computeOptimalWindowSize(inSize: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeOutAndReduceShapes")
  @js.native
  def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computeOutShape")
  @js.native
  def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computePool2DInfo")
  @js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: js.UndefOr[
      typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.computePool3DInfo")
  @js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: js.UndefOr[
      typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): Conv3DInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.convertConv2DDataFormat")
  @js.native
  def convertConv2DDataFormat_NCHW(dataFormat: NCHW): channelsLast | channelsFirst = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.convertConv2DDataFormat")
  @js.native
  def convertConv2DDataFormat_NHWC(dataFormat: NHWC): channelsLast | channelsFirst = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.expandShapeToKeepDim")
  @js.native
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.exponent")
  @js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Real = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.exponents")
  @js.native
  def exponents(n: Double, inverse: Boolean): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getAxesPermutation")
  @js.native
  def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getBroadcastDims")
  @js.native
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getComplexWithIndex")
  @js.native
  def getComplexWithIndex(complex: Float32Array, index: Double): Real = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getFusedBiasGradient")
  @js.native
  def getFusedBiasGradient(
    bias: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dyActivation: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getFusedDyActivation")
  @js.native
  def getFusedDyActivation(
    dy: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    y: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    activation: Activation
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getImageCenter")
  @js.native
  def getImageCenter(center: js.Tuple2[Double, Double], imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getImageCenter")
  @js.native
  def getImageCenter(center: Double, imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getInnerMostAxes")
  @js.native
  def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getPermuted")
  @js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getPermuted")
  @js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getReductionAxes")
  @js.native
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getReshaped")
  @js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getReshaped")
  @js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getReshapedPermuted")
  @js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getReshapedPermuted")
  @js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getSliceBeginCoords")
  @js.native
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getSliceSize")
  @js.native
  def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.getUndoAxesPermutation")
  @js.native
  def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.linspaceImpl")
  @js.native
  def linspaceImpl(start: Double, stop: Double, num: Double): Tensor[R1] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.log")
  @js.native
  def log(msg: js.Object*): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.mergeRealAndImagArrays")
  @js.native
  def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareAndValidate")
  @js.native
  def prepareAndValidate(
    tensor: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    numOrSizeSplits: js.Array[Double],
    axis: Double
  ): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.reshapeTensor")
  @js.native
  def reshapeTensor[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    x: T,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  object segmentUtil {
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.segment_util.collectGatherOpShapeInfo")
    @js.native
    def collectGatherOpShapeInfo(
      x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
      indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
      axis: Double
    ): GatherOpShapeInfo = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.segment_util.computeOutShape")
    @js.native
    def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.segment_util.segOpComputeOptimalWindowSize")
    @js.native
    def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.shouldFuse")
  @js.native
  def shouldFuse(gradientDepth: Double, activation: Activation): Boolean = js.native
  
  object sliceUtil {
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.assertParamsValid")
    @js.native
    def assertParamsValid(input: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.computeFlatOffset")
    @js.native
    def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.computeOutShape")
    @js.native
    def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.getNormalizedAxes")
    @js.native
    def getNormalizedAxes(
      inputShape: js.Array[Double],
      ellipsisAxes: js.Array[Double],
      numInterpolatedAxes: Double,
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double
    ): Begin = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.isSliceContinous")
    @js.native
    def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.maskToAxes")
    @js.native
    def maskToAxes(mask: Double): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: Double): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: Double, size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: Double, size: Double): js.Array[js.Array[Double]] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.startForAxis")
    @js.native
    def startForAxis(
      beginMask: Double,
      startIndices: js.Array[Double],
      strides: js.Array[Double],
      inputShape: js.Array[Double],
      axis: Double,
      ellipsisMask: Double
    ): Double = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.startIndicesWithElidedDims")
    @js.native
    def startIndicesWithElidedDims(
      beginMask: Double,
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      originalBegin: js.Array[Double],
      inputShape: js.Array[Double]
    ): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.stopForAxis")
    @js.native
    def stopForAxis(
      endMask: Double,
      stopIndices: js.Array[Double],
      strides: js.Array[Double],
      inputShape: js.Array[Double],
      axis: Double,
      ellipsisMask: Double
    ): Double = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.stopIndicesWithElidedDims")
    @js.native
    def stopIndicesWithElidedDims(
      endMask: Double,
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      originalEnd: js.Array[Double],
      inputShape: js.Array[Double]
    ): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.stridesForAxis")
    @js.native
    def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.slice_util.stridesWithElidedDims")
    @js.native
    def stridesWithElidedDims(
      strides: js.Array[Double],
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      inputShape: js.Array[Double]
    ): js.Array[Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.splitRealAndImagArrays")
  @js.native
  def splitRealAndImagArrays(complex: Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.tupleValuesAreOne")
  @js.native
  def tupleValuesAreOne(param: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.tupleValuesAreOne")
  @js.native
  def tupleValuesAreOne(param: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.upcastType")
  @js.native
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.validateInput")
  @js.native
  def validateInput(
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.validateUpdateShape")
  @js.native
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.warn")
  @js.native
  def warn(msg: js.Object*): Unit = js.native
}
