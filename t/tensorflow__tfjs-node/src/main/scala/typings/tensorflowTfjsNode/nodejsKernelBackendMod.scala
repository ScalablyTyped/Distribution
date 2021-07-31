package typings.tensorflowTfjsNode

import typings.std.Uint8Array
import typings.tensorflowTfjs.mod.KernelBackend
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.modelTypesMod.ModelTensorInfo
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.bilinear
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.nearest
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import typings.tensorflowTfjsNode.tfjsBindingMod.TFEOpAttr
import typings.tensorflowTfjsNode.tfjsBindingMod.TFJSBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodejsKernelBackendMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", "NodeJSKernelBackend")
  @js.native
  class NodeJSKernelBackend protected () extends KernelBackend {
    def this(binding: TFJSBinding, packageName: String) = this()
    
    var applyActivation: js.Any = js.native
    
    var binding: TFJSBinding = js.native
    
    var createOutputTensor: js.Any = js.native
    
    def createReductionOpAttrs(tensor: TensorInfo): js.Array[TFEOpAttr] = js.native
    def createReductionOpAttrs(tensor: TensorInfo, keepDims: Boolean): js.Array[TFEOpAttr] = js.native
    
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
    def createSummaryFileWriter(
      resourceHandle: Tensor[Rank],
      logdir: String,
      maxQueue: Double,
      flushMillis: Unit,
      filenameSuffix: String
    ): Unit = js.native
    def createSummaryFileWriter(resourceHandle: Tensor[Rank], logdir: String, maxQueue: Unit, flushMillis: Double): Unit = js.native
    def createSummaryFileWriter(
      resourceHandle: Tensor[Rank],
      logdir: String,
      maxQueue: Unit,
      flushMillis: Double,
      filenameSuffix: String
    ): Unit = js.native
    def createSummaryFileWriter(
      resourceHandle: Tensor[Rank],
      logdir: String,
      maxQueue: Unit,
      flushMillis: Unit,
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
    
    def divNoNan(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    
    def divide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    
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
    ): Tensor[Rank] = js.native
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
    ): Tensor[Rank] = js.native
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
    ): Tensor[Rank] = js.native
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
    ): Tensor[Rank] = js.native
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
    ): Tensor[Rank] = js.native
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
    ): Tensor[Rank] = js.native
    
    def encodePng(imageData: Uint8Array, imageShape: js.Array[Double], compression: Double): Tensor[Rank] = js.native
    
    def executeEncodeImageOp(name: String, opAttrs: js.Array[TFEOpAttr], imageData: Uint8Array, imageShape: js.Array[Double]): Tensor[Rank] = js.native
    
    /**
      * Executes a TensorFlow Eager Op that provides multiple output Tensors.
      * @param name The name of the Op to execute.
      * @param opAttrs The list of Op attributes required to execute.
      * @param inputs The list of input Tensors for the Op.
      * @param numOutputs The number of output Tensors for Op execution.
      * @return A resulting Tensor array from Op execution.
      */
    def executeMultipleOutputs(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[TensorInfo], numOutputs: Double): js.Array[Tensor[Rank]] = js.native
    
    /**
      * Executes an op that has a single input and output.
      *
      * Helper function to wrap executeSingleOutput in a particular case.
      * @param name The name of the Op to execute.
      * @param input The input Tensor for the Op.
      */
    def executeSingleInput(name: String, input: TensorInfo): Tensor[Rank] = js.native
    
    /**
      * Executes a TensorFlow Eager Op that provides one output Tensor.
      * @param name The name of the Op to execute.
      * @param opAttrs The list of Op attributes required to execute.
      * @param inputs The list of input Tensors for the Op.
      * @return A resulting Tensor from Op execution.
      */
    def executeSingleOutput(name: String, opAttrs: js.Array[TFEOpAttr], inputs: js.Array[TensorInfo]): Tensor[Rank] = js.native
    
    def flushSummaryWriter(resourceHandle: Tensor[Rank]): Unit = js.native
    
    var getDTypeInteger: js.Any = js.native
    
    var getInputTensorIds: js.Any = js.native
    
    var getMappedInputTensorIds: js.Any = js.native
    
    def getNumOfSavedModels(): Double = js.native
    
    var isGPUPackage: Boolean = js.native
    
    var isUsingGpuDevice: Boolean = js.native
    
    def loadSavedModelMetaGraph(path: String, tags: String): Double = js.native
    
    def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = js.native
    def nonMaxSuppression(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): Tensor1D = js.native
    
    def runSavedModel(
      id: Double,
      inputs: js.Array[Tensor[Rank]],
      inputTensorInfos: js.Array[ModelTensorInfo],
      outputOpNames: js.Array[String]
    ): js.Array[Tensor[Rank]] = js.native
    
    def summaryWriter(logdir: String): Tensor1D = js.native
    
    var tensorMap: js.Any = js.native
    
    def topKIndices(x: Tensor[Rank], k: Double): Tensor1D = js.native
    
    def topKValues[T /* <: Tensor[Rank] */](x: T, k: Double): Tensor1D = js.native
    
    def topk[T /* <: Tensor[Rank] */](x: T): js.Tuple2[T, T] = js.native
    def topk[T /* <: Tensor[Rank] */](x: T, k: Double): js.Tuple2[T, T] = js.native
    def topk[T /* <: Tensor[Rank] */](x: T, k: Unit, sorted: Boolean): js.Tuple2[T, T] = js.native
    
    var typeAttributeFromTensor: js.Any = js.native
    
    def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Double): Unit = js.native
    def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Scalar): Unit = js.native
  }
  
  @scala.inline
  def createOpAttr(attrName: String, tensorsOrDtype: js.Array[Tensor[Rank]], value: ScalarLike): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  @scala.inline
  def createOpAttr(attrName: String, tensorsOrDtype: Tensor[Rank], value: ScalarLike): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  @scala.inline
  def createOpAttr(attrName: String, tensorsOrDtype: DataType, value: ScalarLike): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  
  @scala.inline
  def createTensorsTypeOpAttr(attrName: String, tensorsOrDtype: js.Array[Tensor[Rank]]): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsTypeOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  @scala.inline
  def createTensorsTypeOpAttr(attrName: String, tensorsOrDtype: Tensor[Rank]): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsTypeOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  @scala.inline
  def createTensorsTypeOpAttr(attrName: String, tensorsOrDtype: DataType): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsTypeOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  
  @scala.inline
  def ensureTensorflowBackend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureTensorflowBackend")().asInstanceOf[Unit]
  
  @scala.inline
  def getTFDType(dataType: DataType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTFDType")(dataType.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def nodeBackend(): NodeJSKernelBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeBackend")().asInstanceOf[NodeJSKernelBackend]
}
