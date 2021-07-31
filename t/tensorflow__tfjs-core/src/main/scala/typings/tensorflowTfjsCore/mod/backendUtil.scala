package typings.tensorflowTfjsCore.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendUtil {
  
  @JSImport("@tensorflow/tfjs-core", "backend_util")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.ERF_A1")
  @js.native
  val ERF_A1: /* 0.254829592 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.ERF_A2")
  @js.native
  val ERF_A2: /* -0.284496736 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.ERF_A3")
  @js.native
  val ERF_A3: /* 1.421413741 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.ERF_A4")
  @js.native
  val ERF_A4: /* -1.453152027 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.ERF_A5")
  @js.native
  val ERF_A5: /* 1.061405429 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.ERF_P")
  @js.native
  val ERF_P: /* 0.3275911 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.PARALLELIZE_THRESHOLD")
  @js.native
  val PARALLELIZE_THRESHOLD: /* 30 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.SELU_SCALE")
  @js.native
  val SELU_SCALE: /* 1.0507009873554805 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core", "backend_util.SELU_SCALEALPHA")
  @js.native
  val SELU_SCALEALPHA: /* 1.7580993408473768 */ Double = js.native
  
  @scala.inline
  def applyActivation(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], activation: Activation): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  @scala.inline
  def applyActivation(
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    activation: Activation,
    preluActivationWeights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAndGetBroadcastShape")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAxesAreInnerMostDims")(msg.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParamsConsistent")(shapes.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignToTypedArray")(data.asInstanceOf[js.Any], real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("axesAreInnerMostDims")(axes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateShapes")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[ScatterShapeInfo]
  
  @scala.inline
  def castTensor[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, dtype: DataType, backend: typings.tensorflowTfjsCore.backendMod.KernelBackend): T = (^.asInstanceOf[js.Dynamic].applyDynamic("castTensor")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLocations")(outputLoc.asInstanceOf[js.Any], reduceLoc.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def complexWithEvenIndex(complex: Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("complexWithEvenIndex")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  @scala.inline
  def complexWithOddIndex(complex: Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("complexWithOddIndex")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  @scala.inline
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
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeConv2DInfo")(inShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any], depthwise.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  @scala.inline
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
  ): Conv3DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeConv3DInfo")(inShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], depthwise.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any])).asInstanceOf[Conv3DInfo]
  
  @scala.inline
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultPad")(inputShape.asInstanceOf[js.Any], fieldSize.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid_,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid_,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  @scala.inline
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  @scala.inline
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDilation2DInfo")(inputShape.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  @scala.inline
  def computeOptimalWindowSize(inSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeOptimalWindowSize")(inSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutAndReduceShapes")(aShape.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], js.Array[Double]]]
  
  @scala.inline
  def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutShape")(shapes.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
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
  ): Conv2DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computePool2DInfo")(inShape.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Conv2DInfo]
  
  @scala.inline
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
  ): Conv3DInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computePool3DInfo")(inShape.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], roundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Conv3DInfo]
  
  @scala.inline
  def convertConv2DDataFormat_NCHW(dataFormat: NCHW): channelsLast | channelsFirst = ^.asInstanceOf[js.Dynamic].applyDynamic("convertConv2DDataFormat")(dataFormat.asInstanceOf[js.Any]).asInstanceOf[channelsLast | channelsFirst]
  
  @scala.inline
  def convertConv2DDataFormat_NHWC(dataFormat: NHWC): channelsLast | channelsFirst = ^.asInstanceOf[js.Dynamic].applyDynamic("convertConv2DDataFormat")(dataFormat.asInstanceOf[js.Any]).asInstanceOf[channelsLast | channelsFirst]
  
  @scala.inline
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherStridesOrDilationsAreOne")(strides.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandShapeToKeepDim")(shape.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def exponent(k: Double, n: Double, inverse: Boolean): Real = (^.asInstanceOf[js.Dynamic].applyDynamic("exponent")(k.asInstanceOf[js.Any], n.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Real]
  
  @scala.inline
  def exponents(n: Double, inverse: Boolean): Imag = (^.asInstanceOf[js.Dynamic].applyDynamic("exponents")(n.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Imag]
  
  @scala.inline
  def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxesPermutation")(axes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
  
  @scala.inline
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBroadcastDims")(inShape.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getComplexWithIndex(complex: Float32Array, index: Double): Real = (^.asInstanceOf[js.Dynamic].applyDynamic("getComplexWithIndex")(complex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Real]
  
  @scala.inline
  def getFusedBiasGradient(
    bias: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dyActivation: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFusedBiasGradient")(bias.asInstanceOf[js.Any], dyActivation.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def getFusedDyActivation(
    dy: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    y: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    activation: Activation
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFusedDyActivation")(dy.asInstanceOf[js.Any], y.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def getImageCenter(center: js.Tuple2[Double, Double], imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageCenter")(center.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getImageCenter(center: Double, imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageCenter")(center.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerMostAxes")(numAxes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getPermuted(reshapedRank: Double, blockShapeRank: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermuted")(reshapedRank.asInstanceOf[js.Any], blockShapeRank.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermuted")(reshapedRank.asInstanceOf[js.Any], blockShapeRank.asInstanceOf[js.Any], batchToSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReductionAxes")(inShape.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshaped")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshaped")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any], batchToSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshapedPermuted")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshapedPermuted")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any], batchToSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSliceBeginCoords")(crops.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSliceSize")(uncroppedShape.asInstanceOf[js.Any], crops.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUndoAxesPermutation")(axes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def linspaceImpl(start: Double, stop: Double, num: Double): Tensor[R1] = (^.asInstanceOf[js.Dynamic].applyDynamic("linspaceImpl")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Tensor[R1]]
  
  @scala.inline
  def log(msg: js.Object*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRealAndImagArrays")(real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def prepareAndValidate(
    tensor: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareAndValidate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]]]
  
  @scala.inline
  def prepareSplitSize(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    numOrSizeSplits: js.Array[Double],
    axis: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double, axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def reshapeTensor[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    x: T,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshapeTensor")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  object segmentUtil {
    
    @JSImport("@tensorflow/tfjs-core", "backend_util.segment_util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def collectGatherOpShapeInfo(
      x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
      indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
      axis: Double
    ): GatherOpShapeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("collectGatherOpShapeInfo")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[GatherOpShapeInfo]
    
    @scala.inline
    def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutShape")(aShape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @scala.inline
    def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("segOpComputeOptimalWindowSize")(inSize.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @scala.inline
  def shouldFuse(gradientDepth: Double, activation: Activation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldFuse")(gradientDepth.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object sliceUtil {
    
    @JSImport("@tensorflow/tfjs-core", "backend_util.slice_util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def assertParamsValid(input: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParamsValid")(input.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFlatOffset")(begin.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutShape")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @scala.inline
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
    ): Begin = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedAxes")(inputShape.asInstanceOf[js.Any], ellipsisAxes.asInstanceOf[js.Any], numInterpolatedAxes.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], beginMask.asInstanceOf[js.Any], endMask.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Begin]
    
    @scala.inline
    def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSliceContinous")(shape.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def maskToAxes(mask: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("maskToAxes")(mask.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    @scala.inline
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    @scala.inline
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    @scala.inline
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    @scala.inline
    def parseSliceParams(x: TensorInfo, begin: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    @scala.inline
    def parseSliceParams(x: TensorInfo, begin: Double, size: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    @scala.inline
    def parseSliceParams(x: TensorInfo, begin: Double, size: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    @scala.inline
    def startForAxis(
      beginMask: Double,
      startIndices: js.Array[Double],
      strides: js.Array[Double],
      inputShape: js.Array[Double],
      axis: Double,
      ellipsisMask: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startForAxis")(beginMask.asInstanceOf[js.Any], startIndices.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def startIndicesWithElidedDims(
      beginMask: Double,
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      originalBegin: js.Array[Double],
      inputShape: js.Array[Double]
    ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("startIndicesWithElidedDims")(beginMask.asInstanceOf[js.Any], ellipsisInsertionIndex.asInstanceOf[js.Any], numElidedAxes.asInstanceOf[js.Any], originalBegin.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @scala.inline
    def stopForAxis(
      endMask: Double,
      stopIndices: js.Array[Double],
      strides: js.Array[Double],
      inputShape: js.Array[Double],
      axis: Double,
      ellipsisMask: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stopForAxis")(endMask.asInstanceOf[js.Any], stopIndices.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def stopIndicesWithElidedDims(
      endMask: Double,
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      originalEnd: js.Array[Double],
      inputShape: js.Array[Double]
    ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stopIndicesWithElidedDims")(endMask.asInstanceOf[js.Any], ellipsisInsertionIndex.asInstanceOf[js.Any], numElidedAxes.asInstanceOf[js.Any], originalEnd.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @scala.inline
    def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stridesForAxis")(strides.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def stridesWithElidedDims(
      strides: js.Array[Double],
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      inputShape: js.Array[Double]
    ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stridesWithElidedDims")(strides.asInstanceOf[js.Any], ellipsisInsertionIndex.asInstanceOf[js.Any], numElidedAxes.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @scala.inline
  def splitRealAndImagArrays(complex: Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("splitRealAndImagArrays")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  @scala.inline
  def tupleValuesAreOne(param: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleValuesAreOne")(param.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def tupleValuesAreOne(param: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleValuesAreOne")(param.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def upcastType(typeA: DataType, typeB: DataType): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("upcastType")(typeA.asInstanceOf[js.Any], typeB.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  @scala.inline
  def validateInput(
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUpdateShape")(shape.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warn(msg: js.Object*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
