package typings
package atTensorflowTfjsDashCoreLib.distBackendsBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend", "KernelBackend")
@js.native
class KernelBackend ()
  extends TensorStorage
     with atTensorflowTfjsDashCoreLib.distTensorMod.Backend
     with BackendTimer {
  def LRNGrad(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    inputImage: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    outputImage: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    radius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def abs[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def acos[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def acosh[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def add(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def addN[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T]): T = js.native
  def all(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axes: js.Array[scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def any(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axes: js.Array[scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def argMax(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def argMin(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def asin[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def asinh[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def atan[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def atan2[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def atanh[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def avgPool(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def avgPoolBackprop(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def batchMatMul(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    transposeA: scala.Boolean,
    transposeB: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def batchNormalization(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    varianceEpsilon: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def batchNormalization(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    varianceEpsilon: scala.Double,
    scale: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def batchNormalization(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    varianceEpsilon: scala.Double,
    scale: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    offset: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def batchToSpaceND[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], crops: js.Array[js.Array[scala.Double]]): T = js.native
  def cast[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): T = js.native
  def ceil[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def clip[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, min: scala.Double, max: scala.Double): T = js.native
  def complex[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](real: T, imag: T): T = js.native
  def complexAbs[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def concat(
    tensors: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    axis: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def conv2d(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def conv2dDerFilter(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    dY: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def conv2dDerInput(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def conv3d(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def conv3dDerFilter(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    dY: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def conv3dDerInput(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv3DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def cos[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def cosh[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  @JSName("cropAndResize")
  def cropAndResize_bilinear(
    image: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    boxes: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    boxIndex: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    cropSize: js.Tuple2[scala.Double, scala.Double],
    method: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bilinear,
    extrapolationValue: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  @JSName("cropAndResize")
  def cropAndResize_nearest(
    image: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    boxes: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    boxIndex: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    cropSize: js.Tuple2[scala.Double, scala.Double],
    method: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.nearest,
    extrapolationValue: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def cumsum(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double,
    exclusive: scala.Boolean,
    reverse: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def depthToSpace(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    blockSize: scala.Double,
    dataFormat: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def depthwiseConv2D(
    input: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def depthwiseConv2DDerFilter(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    dY: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def depthwiseConv2DDerInput(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def dispose(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def disposeData(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): scala.Unit = js.native
  def elu[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def eluDer[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](dy: T, y: T): T = js.native
  /** Returns the smallest representable number.  */
  def epsilon(): scala.Double = js.native
  def equal(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def erf[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def exp[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def expm1[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def fft(x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: java.lang.String,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  /** Returns the highest precision for floats in bits (e.g. 16 or 32) */
  def floatPrecision(): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibNumbers.`16` | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibNumbers.`32` = js.native
  def floor[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def floorDiv(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def fusedBatchMatMul(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    transposeA: scala.Boolean,
    transposeB: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fusedBatchMatMul(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    transposeA: scala.Boolean,
    transposeB: scala.Boolean,
    bias: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fusedBatchMatMul(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    transposeA: scala.Boolean,
    transposeB: scala.Boolean,
    bias: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    activation: atTensorflowTfjsDashCoreLib.distOpsFusedUnderscoreUtilMod.Activation
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def gather[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D, axis: scala.Double): T = js.native
  def gatherND(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def greater(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def greaterEqual(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def ifft(x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def imag[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](input: T): T = js.native
  def int[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def isFinite[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def isInf[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def isNaN[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def less(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def lessEqual(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def linspace(start: scala.Double, stop: scala.Double, num: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def localResponseNormalization4D(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    radius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def log[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def log1p[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def logicalAnd(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def logicalNot[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T): T = js.native
  def logicalOr(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def max(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axes: js.Array[scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def maxPool(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def maxPoolBackprop(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    y: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def maximum(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def min(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axes: js.Array[scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def minimum(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def mod(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def multinomial(
    logits: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    normalized: scala.Boolean,
    numSamples: scala.Double,
    seed: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def multiply(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def neg[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T): T = js.native
  def nonMaxSuppression(
    boxes: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    scores: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    maxOutputSize: scala.Double,
    iouThreshold: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def nonMaxSuppression(
    boxes: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    scores: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    maxOutputSize: scala.Double,
    iouThreshold: scala.Double,
    scoreThreshold: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def notEqual(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def oneHot(
    indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    depth: scala.Double,
    onValue: scala.Double,
    offValue: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def onesLike[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R]): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def pad[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]], constantValue: scala.Double): T = js.native
  def pow[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    a: T,
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): T = js.native
  def prelu[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, a: T): T = js.native
  def prod(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axes: js.Array[scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /* InferMemberOverrides */
  override def read(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): js.Promise[atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues] = js.native
  /* InferMemberOverrides */
  override def readSync(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues = js.native
  def real[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](input: T): T = js.native
  def realDivide(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def reciprocal[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def relu[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def reshape[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: T,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def resizeBilinear(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    newHeight: scala.Double,
    newWidth: scala.Double,
    alignCorners: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def resizeBilinearBackprop(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    alignCorners: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def resizeNearestNeighbor(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    newHEight: scala.Double,
    newWidth: scala.Double,
    alignCorners: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def resizeNearestNeighborBackprop(
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    alignCorners: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def reverse[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, axis: js.Array[scala.Double]): T = js.native
  def round[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def rsqrt[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def scatterND[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    updates: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def select(
    condition: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def selu[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sigmoid[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sign[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sin[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def sinh[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def slice[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, begin: js.Array[scala.Double], size: js.Array[scala.Double]): T = js.native
  def softplus[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def spaceToBatchND[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], paddings: js.Array[js.Array[scala.Double]]): T = js.native
  def sparseToDense[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    sparseIndices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    sparseValues: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: atTensorflowTfjsDashCoreLib.distTensorMod.Scalar
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def split[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](value: T, sizeSplits: js.Array[scala.Double], axis: scala.Double): js.Array[T] = js.native
  def sqrt[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def square[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def squaredDifference(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def step[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, alpha: scala.Double): T = js.native
  def stridedSlice[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: T,
    begin: js.Array[scala.Double],
    end: js.Array[scala.Double],
    strides: js.Array[scala.Double],
    beginMask: scala.Double,
    endMask: scala.Double,
    ellipsisMask: scala.Double,
    newAxisMask: scala.Double,
    shrinkAxisMask: scala.Double
  ): T = js.native
  def subtract(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def sum(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axes: js.Array[scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def tan[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def tanh[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def tile[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, reps: js.Array[scala.Double]): T = js.native
  /* CompleteClass */
  override def time(f: js.Function0[scala.Unit]): js.Promise[BackendTimingInfo] = js.native
  def topk[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, k: scala.Double, sorted: scala.Boolean): js.Tuple2[T, T] = js.native
  def transpose[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, perm: js.Array[scala.Double]): T = js.native
  def unsortedSegmentSum[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, segmentIds: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D, numSegments: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def unstack(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    axis: scala.Double
  ): js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def where(
    condition: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  /* InferMemberOverrides */
  override def write(
    dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId,
    values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues
  ): scala.Unit = js.native
  def zerosLike[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R]): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
}

