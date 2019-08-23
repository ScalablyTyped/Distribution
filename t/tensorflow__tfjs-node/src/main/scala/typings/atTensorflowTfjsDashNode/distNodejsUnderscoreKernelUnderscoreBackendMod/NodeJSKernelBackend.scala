package typings.atTensorflowTfjsDashNode.distNodejsUnderscoreKernelUnderscoreBackendMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.KernelBackend
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv3DInfo
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R0
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R1
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R2
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R5
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.bilinear
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.nearest
import typings.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TFEOpAttr
import typings.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TFJSBinding
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", "NodeJSKernelBackend")
@js.native
class NodeJSKernelBackend protected () extends KernelBackend {
  def this(binding: TFJSBinding, packageName: String) = this()
  var binding: TFJSBinding = js.native
  var createOutputTensor: js.Any = js.native
  var createReductionOpAttrs: js.Any = js.native
  var executeSingleInput: js.Any = js.native
  var getDTypeInteger: js.Any = js.native
  var getInputTensorIds: js.Any = js.native
  var isGPUPackage: Boolean = js.native
  var tensorMap: js.Any = js.native
  var typeAttributeFromTensor: js.Any = js.native
  def add(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def all(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  def any(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  def argMax(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  def argMin(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  def batchMatMul(a: Tensor[R3], b: Tensor[R3], transposeA: Boolean, transposeB: Boolean): Tensor[R3] = js.native
  def conv3d(x: Tensor[R5], filter: Tensor[R5], convInfo: Conv3DInfo): Tensor[R5] = js.native
  def conv3dDerFilter(x: Tensor[R5], dY: Tensor[R5], convInfo: Conv3DInfo): Tensor[R5] = js.native
  def conv3dDerInput(dy: Tensor[R5], filter: Tensor[R5], convInfo: Conv3DInfo): Tensor[R5] = js.native
  def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String): Unit = js.native
  def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String, maxQueue: Double): Unit = js.native
  def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String, maxQueue: Double, flushMillis: Double): Unit = js.native
  def createSummaryFileWriter(
    resourceHandle: Tensor[Rank],
    logdir: String,
    maxQueue: Double,
    flushMillis: Double,
    filenameSuffix: String
  ): Unit = js.native
  @JSName("cropAndResize")
  def cropAndResize_bilinear(
    image: Tensor[R4],
    boxes: Tensor[R2],
    boxIndex: Tensor[R1],
    cropSize: js.Tuple2[Double, Double],
    method: bilinear,
    extrapolationValue: Double
  ): Tensor[R4] = js.native
  @JSName("cropAndResize")
  def cropAndResize_nearest(
    image: Tensor[R4],
    boxes: Tensor[R2],
    boxIndex: Tensor[R1],
    cropSize: js.Tuple2[Double, Double],
    method: nearest,
    extrapolationValue: Double
  ): Tensor[R4] = js.native
  def cumsum(x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): Tensor[Rank] = js.native
  def decodeBmp(contents: Uint8Array, channels: Double): Tensor3D = js.native
  def decodeGif(contents: Uint8Array): Tensor4D = js.native
  def decodeJpeg(
    contents: Uint8Array,
    channels: Double,
    ratio: Double,
    fancyUpscaling: Boolean,
    tryRecoverTruncated: Boolean,
    acceptableFraction: Double,
    dctMethod: String
  ): Tensor3D = js.native
  def decodePng(contents: Uint8Array, channels: Double): Tensor3D = js.native
  def depthToSpace(x: Tensor[R4], blockSize: Double, dataFormat: String): Tensor[R4] = js.native
  def divide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def equal(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  /**
    * Executes a TensorFlow Eager Op that provides multiple output Tensors.
    * @param name The name of the Op to execute.
    * @param opAttrs The list of Op attributes required to execute.
    * @param inputs The list of input Tensors for the Op.
    * @param numOutputs The number of output Tensors for Op execution.
    * @return A resulting Tensor array from Op execution.
    */
  def executeMultipleOutputs(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[Tensor[Rank]], numOutputs: Double): js.Array[Tensor[Rank]] = js.native
  /**
    * Executes a TensorFlow Eager Op that provides one output Tensor.
    * @param name The name of the Op to execute.
    * @param opAttrs The list of Op attributes required to execute.
    * @param inputs The list of input Tensors for the Op.
    * @return A resulting Tensor from Op execution.
    */
  def executeSingleOutput(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
  def fft(x: Tensor[R2]): Tensor[R2] = js.native
  def floorDiv(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def flushSummaryWriter(resourceHandle: Tensor[Rank]): Unit = js.native
  def fusedBatchMatMul(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean): Tensor3D = js.native
  def fusedBatchMatMul(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean, bias: Tensor[Rank]): Tensor3D = js.native
  def fusedBatchMatMul(
    a: Tensor3D,
    b: Tensor3D,
    transposeA: Boolean,
    transposeB: Boolean,
    bias: Tensor[Rank],
    activation: Activation
  ): Tensor3D = js.native
  def fusedBatchMatMul(
    a: Tensor3D,
    b: Tensor3D,
    transposeA: Boolean,
    transposeB: Boolean,
    bias: Tensor[Rank],
    activation: Activation,
    preluActivationWeights: Tensor[Rank]
  ): Tensor3D = js.native
  def fusedConv2d(
    x: Tensor4D,
    filter: Tensor4D,
    convInfo: Conv2DInfo,
    bias: Tensor4D,
    activation: Activation,
    preluActivationWeights: Tensor[Rank]
  ): Tensor4D = js.native
  def gatherND(x: Tensor[Rank], indices: Tensor[Rank]): Tensor[Rank] = js.native
  def greater(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def greaterEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def less(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def lessEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def logicalAnd(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def logicalOr(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def max(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  def maximum(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def min(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  def minimum(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def mod(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def multiply(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = js.native
  def notEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def onesLike[R /* <: Rank */](x: Tensor[R]): Tensor[R] = js.native
  def pow[T /* <: Tensor[Rank] */](a: T, b: Tensor[Rank]): T = js.native
  def prod(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  def realDivide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: Tensor[Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def select(condition: Tensor[Rank], a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def setDataMover(dataMover: DataMover): Unit = js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Tensor[R0]
  ): Tensor[R] = js.native
  def squaredDifference(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def subtract(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def sum(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  def summaryWriter(logdir: String): Tensor1D = js.native
  def topKIndices(x: Tensor[Rank], k: Double): Tensor1D = js.native
  def topKValues[T /* <: Tensor[Rank] */](x: T, k: Double): Tensor1D = js.native
  def topk[T /* <: Tensor[Rank] */](x: T): js.Tuple2[T, T] = js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double): js.Tuple2[T, T] = js.native
  def unstack(x: Tensor[Rank], axis: Double): js.Array[Tensor[Rank]] = js.native
  def where(condition: Tensor[Rank]): Tensor2D = js.native
  def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Double): Unit = js.native
  def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Scalar): Unit = js.native
  def zerosLike[R /* <: Rank */](x: Tensor[R]): Tensor[R] = js.native
}

