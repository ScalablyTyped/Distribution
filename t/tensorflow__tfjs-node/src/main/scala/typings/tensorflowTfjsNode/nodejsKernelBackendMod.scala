package typings.tensorflowTfjsNode

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R0
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.bilinear
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.nearest
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import typings.tensorflowTfjsNode.tfjsBindingMod.TFEOpAttr
import typings.tensorflowTfjsNode.tfjsBindingMod.TFJSBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", JSImport.Namespace)
@js.native
object nodejsKernelBackendMod extends js.Object {
  @js.native
  class NodeJSKernelBackend protected () extends KernelBackend {
    def this(binding: TFJSBinding, packageName: String) = this()
    var applyActivation: js.Any = js.native
    var binding: TFJSBinding = js.native
    var createOutputTensor: js.Any = js.native
    var createReductionOpAttrs: js.Any = js.native
    var executeSingleInput: js.Any = js.native
    var getDTypeInteger: js.Any = js.native
    var getInputTensorIds: js.Any = js.native
    var isGPUPackage: Boolean = js.native
    var isUsingGpuDevice: Boolean = js.native
    var tensorMap: js.Any = js.native
    var typeAttributeFromTensor: js.Any = js.native
    def add(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def all(x: Tensor_[Rank], axes: js.Array[Double]): Tensor_[Rank] = js.native
    def any(x: Tensor_[Rank], axes: js.Array[Double]): Tensor_[Rank] = js.native
    def argMax(x: Tensor_[Rank], axis: Double): Tensor_[Rank] = js.native
    def argMin(x: Tensor_[Rank], axis: Double): Tensor_[Rank] = js.native
    def batchMatMul(a: Tensor_[R3], b: Tensor_[R3], transposeA: Boolean, transposeB: Boolean): Tensor_[R3] = js.native
    def conv3d(x: Tensor_[R5], filter: Tensor_[R5], convInfo: Conv3DInfo): Tensor_[R5] = js.native
    def conv3dDerFilter(x: Tensor_[R5], dY: Tensor_[R5], convInfo: Conv3DInfo): Tensor_[R5] = js.native
    def conv3dDerInput(dy: Tensor_[R5], filter: Tensor_[R5], convInfo: Conv3DInfo): Tensor_[R5] = js.native
    def createSummaryFileWriter(resourceHandle: Tensor_[Rank], logdir: String): Unit = js.native
    def createSummaryFileWriter(resourceHandle: Tensor_[Rank], logdir: String, maxQueue: Double): Unit = js.native
    def createSummaryFileWriter(resourceHandle: Tensor_[Rank], logdir: String, maxQueue: Double, flushMillis: Double): Unit = js.native
    def createSummaryFileWriter(
      resourceHandle: Tensor_[Rank],
      logdir: String,
      maxQueue: Double,
      flushMillis: Double,
      filenameSuffix: String
    ): Unit = js.native
    @JSName("cropAndResize")
    def cropAndResize_bilinear(
      image: Tensor_[R4],
      boxes: Tensor_[R2],
      boxIndex: Tensor_[R1],
      cropSize: js.Tuple2[Double, Double],
      method: bilinear,
      extrapolationValue: Double
    ): Tensor_[R4] = js.native
    @JSName("cropAndResize")
    def cropAndResize_nearest(
      image: Tensor_[R4],
      boxes: Tensor_[R2],
      boxIndex: Tensor_[R1],
      cropSize: js.Tuple2[Double, Double],
      method: nearest,
      extrapolationValue: Double
    ): Tensor_[R4] = js.native
    def cumsum(x: Tensor_[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): Tensor_[Rank] = js.native
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
    def deleteSavedModel(id: Double): Unit = js.native
    def depthToSpace(x: Tensor_[R4], blockSize: Double, dataFormat: String): Tensor_[R4] = js.native
    def diag(x: Tensor_[Rank]): Tensor_[Rank] = js.native
    def divNoNan(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def divide(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def encodeJpeg(
      imageData: Uint8Array,
      imageShape: js.Array[Double],
      format: grayscale,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor_[Rank] = js.native
    def encodeJpeg(
      imageData: Uint8Array,
      imageShape: js.Array[Double],
      format: grayscale,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor_[Rank] = js.native
    def encodeJpeg(
      imageData: Uint8Array,
      imageShape: js.Array[Double],
      format: rgb,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor_[Rank] = js.native
    def encodeJpeg(
      imageData: Uint8Array,
      imageShape: js.Array[Double],
      format: rgb,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor_[Rank] = js.native
    @JSName("encodeJpeg")
    def encodeJpeg_cm(
      imageData: Uint8Array,
      imageShape: js.Array[Double],
      format: _empty,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor_[Rank] = js.native
    @JSName("encodeJpeg")
    def encodeJpeg_in(
      imageData: Uint8Array,
      imageShape: js.Array[Double],
      format: _empty,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor_[Rank] = js.native
    def encodePng(imageData: Uint8Array, imageShape: js.Array[Double], compression: Double): Tensor_[Rank] = js.native
    def equal(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def executeEncodeImageOp(name: String, opAttrs: js.Array[TFEOpAttr], imageData: Uint8Array, imageShape: js.Array[Double]): Tensor_[Rank] = js.native
    /**
      * Executes a TensorFlow Eager Op that provides multiple output Tensors.
      * @param name The name of the Op to execute.
      * @param opAttrs The list of Op attributes required to execute.
      * @param inputs The list of input Tensors for the Op.
      * @param numOutputs The number of output Tensors for Op execution.
      * @return A resulting Tensor array from Op execution.
      */
    def executeMultipleOutputs(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[Tensor_[Rank]], numOutputs: Double): js.Array[Tensor_[Rank]] = js.native
    /**
      * Executes a TensorFlow Eager Op that provides one output Tensor.
      * @param name The name of the Op to execute.
      * @param opAttrs The list of Op attributes required to execute.
      * @param inputs The list of input Tensors for the Op.
      * @return A resulting Tensor from Op execution.
      */
    def executeSingleOutput(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[TensorInfo]): Tensor_[Rank] = js.native
    def fft(x: Tensor_[R2]): Tensor_[R2] = js.native
    def floorDiv(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def flushSummaryWriter(resourceHandle: Tensor_[Rank]): Unit = js.native
    def gatherND(x: Tensor_[Rank], indices: Tensor_[Rank]): Tensor_[Rank] = js.native
    def getNumOfSavedModels(): Double = js.native
    def greater(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def greaterEqual(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def less(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def lessEqual(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def loadSavedModelMetaGraph(path: String, tags: String): Double = js.native
    def logicalAnd(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def logicalOr(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def max(x: Tensor_[Rank], axes: js.Array[Double]): Tensor_[Rank] = js.native
    def maximum(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def min(x: Tensor_[Rank], axes: js.Array[Double]): Tensor_[Rank] = js.native
    def minimum(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def mod(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def multiply(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = js.native
    def notEqual(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def onesLike[R /* <: Rank */](x: Tensor_[R]): Tensor_[R] = js.native
    def pow[T /* <: Tensor_[Rank] */](a: T, b: Tensor_[Rank]): T = js.native
    def prod(x: Tensor_[Rank], axes: js.Array[Double]): Tensor_[Rank] = js.native
    def realDivide(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def runSavedModel(
      id: Double,
      inputs: js.Array[Tensor_[Rank]],
      inputOpNames: js.Array[String],
      outputOpNames: js.Array[String]
    ): js.Array[Tensor_[Rank]] = js.native
    def scatterND[R /* <: Rank */](
      indices: Tensor_[Rank],
      updates: Tensor_[Rank],
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor_[R] = js.native
    def select(condition: Tensor_[Rank], a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def sparseToDense[R /* <: Rank */](
      sparseIndices: Tensor_[Rank],
      sparseValues: Tensor_[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Tensor_[R0]
    ): Tensor_[R] = js.native
    def squaredDifference(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def subtract(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
    def sum(x: Tensor_[Rank], axes: js.Array[Double]): Tensor_[Rank] = js.native
    def summaryWriter(logdir: String): Tensor1D = js.native
    def topKIndices(x: Tensor_[Rank], k: Double): Tensor1D = js.native
    def topKValues[T /* <: Tensor_[Rank] */](x: T, k: Double): Tensor1D = js.native
    def topk[T /* <: Tensor_[Rank] */](x: T): js.Tuple2[T, T] = js.native
    def topk[T /* <: Tensor_[Rank] */](x: T, k: Double): js.Tuple2[T, T] = js.native
    def unstack(x: Tensor_[Rank], axis: Double): js.Array[Tensor_[Rank]] = js.native
    def where(condition: Tensor_[Rank]): Tensor2D = js.native
    def writeScalarSummary(resourceHandle: Tensor_[Rank], step: Double, name: String, value: Double): Unit = js.native
    def writeScalarSummary(resourceHandle: Tensor_[Rank], step: Double, name: String, value: Scalar): Unit = js.native
    def zerosLike[R /* <: Rank */](x: Tensor_[R]): Tensor_[R] = js.native
  }
  
  def createTensorsTypeOpAttr(attrName: String, tensors: js.Array[Tensor_[Rank]]): AnonName = js.native
  def createTensorsTypeOpAttr(attrName: String, tensors: Tensor_[Rank]): AnonName = js.native
  def createTypeOpAttr(attrName: String, dtype: DataType): TFEOpAttr = js.native
  def ensureTensorflowBackend(): Unit = js.native
  def getTFDType(dataType: DataType): Double = js.native
  def nodeBackend(): NodeJSKernelBackend = js.native
}

