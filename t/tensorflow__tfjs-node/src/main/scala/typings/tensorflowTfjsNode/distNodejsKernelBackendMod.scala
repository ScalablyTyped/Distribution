package typings.tensorflowTfjsNode

import typings.tensorflowTfjs.mod.KernelBackend
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distModelTypesMod.ModelTensorInfo
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsNode.distTfjsBindingMod.TFEOpAttr
import typings.tensorflowTfjsNode.distTfjsBindingMod.TFJSBinding
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodejsKernelBackendMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", "NodeJSKernelBackend")
  @js.native
  open class NodeJSKernelBackend protected () extends KernelBackend {
    def this(binding: TFJSBinding, packageName: String) = this()
    
    def applyActivation[T /* <: Tensor[Rank] */](input: T, activation: String): T = js.native
    def applyActivation[T /* <: Tensor[Rank] */](input: T, activation: String, preluActivationWeights: Unit, leakyreluAlpha: Double): T = js.native
    def applyActivation[T /* <: Tensor[Rank] */](input: T, activation: String, preluActivationWeights: Tensor[Rank]): T = js.native
    def applyActivation[T /* <: Tensor[Rank] */](input: T, activation: String, preluActivationWeights: Tensor[Rank], leakyreluAlpha: Double): T = js.native
    
    var binding: TFJSBinding = js.native
    
    /**
      * Group data into histogram buckets.
      *
      * @param data A `Tensor` of any shape. Must be castable to `float32`
      * @param bucketCount Optional positive `number`
      * @returns A `Tensor` of shape `[k, 3]` and type `float32`. The `i`th row is
      *   a triple `[leftEdge, rightEdge, count]` for a single bucket. The value of
      *   `k` is either `bucketCount`, `1` or `0`.
      */
    /* private */ var buckets: Any = js.native
    
    /* private */ var createOutputTensor: Any = js.native
    
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
    
    def decodeBmp(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
    
    def decodeGif(contents: js.typedarray.Uint8Array): Tensor4D = js.native
    
    def decodeJpeg(
      contents: js.typedarray.Uint8Array,
      channels: Double,
      ratio: Double,
      fancyUpscaling: Boolean,
      tryRecoverTruncated: Boolean,
      acceptableFraction: Double,
      dctMethod: String
    ): Tensor3D = js.native
    
    def decodePng(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
    
    def deleteSavedModel(id: Double): Unit = js.native
    
    def divNoNan(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    
    def divide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
    
    def encodeJpeg(
      imageData: js.typedarray.Uint8Array,
      imageShape: js.Array[Double],
      format: _empty | grayscale | rgb,
      quality: Double,
      progressive: Boolean,
      optimizeSize: Boolean,
      chromaDownsampling: Boolean,
      densityUnit: in | cm,
      xDensity: Double,
      yDensity: Double,
      xmpMetadata: String
    ): Tensor[Rank] = js.native
    
    def encodePng(imageData: js.typedarray.Uint8Array, imageShape: js.Array[Double], compression: Double): Tensor[Rank] = js.native
    
    def executeEncodeImageOp(
      name: String,
      opAttrs: js.Array[TFEOpAttr],
      imageData: js.typedarray.Uint8Array,
      imageShape: js.Array[Double]
    ): Tensor[Rank] = js.native
    
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
    
    def getDTypeInteger(dtype: DataType): Double = js.native
    
    /* private */ var getInputTensorIds: Any = js.native
    
    /* private */ var getMappedInputTensorIds: Any = js.native
    
    def getNumOfSavedModels(): Double = js.native
    
    def int[T /* <: Tensor[Rank] */](x: T): T = js.native
    
    var isGPUPackage: Boolean = js.native
    
    var isUsingGpuDevice: Boolean = js.native
    
    def loadSavedModelMetaGraph(path: String, tags: String): Double = js.native
    
    def runSavedModel(
      id: Double,
      inputs: js.Array[Tensor[Rank]],
      inputTensorInfos: js.Array[ModelTensorInfo],
      outputOpNames: js.Array[String]
    ): js.Array[Tensor[Rank]] = js.native
    
    def summaryWriter(logdir: String): Tensor1D = js.native
    
    /* private */ var tensorMap: Any = js.native
    
    def topKIndices(x: Tensor[Rank], k: Double): Tensor1D = js.native
    
    def topKValues[T /* <: Tensor[Rank] */](x: T, k: Double): Tensor1D = js.native
    
    /* private */ var typeAttributeFromTensor: Any = js.native
    
    def where(condition: Tensor[Rank]): Tensor2D = js.native
    
    def writeHistogramSummary(resourceHandle: Tensor[Rank], step: Double, name: String, data: Tensor[Rank]): Unit = js.native
    def writeHistogramSummary(resourceHandle: Tensor[Rank], step: Double, name: String, data: Tensor[Rank], bucketCount: Double): Unit = js.native
    def writeHistogramSummary(
      resourceHandle: Tensor[Rank],
      step: Double,
      name: String,
      data: Tensor[Rank],
      bucketCount: Double,
      description: String
    ): Unit = js.native
    def writeHistogramSummary(
      resourceHandle: Tensor[Rank],
      step: Double,
      name: String,
      data: Tensor[Rank],
      bucketCount: Unit,
      description: String
    ): Unit = js.native
    
    def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Double): Unit = js.native
    def writeScalarSummary(resourceHandle: Tensor[Rank], step: Double, name: String, value: Scalar): Unit = js.native
  }
  
  inline def createOpAttr(attrName: String, tensorsOrDtype: js.Array[Tensor[Rank]], value: ScalarLike): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  inline def createOpAttr(attrName: String, tensorsOrDtype: Tensor[Rank], value: ScalarLike): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  inline def createOpAttr(attrName: String, tensorsOrDtype: DataType, value: ScalarLike): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  
  inline def createTensorsTypeOpAttr(attrName: String, tensorsOrDtype: js.Array[Tensor[Rank]]): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsTypeOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  inline def createTensorsTypeOpAttr(attrName: String, tensorsOrDtype: Tensor[Rank]): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsTypeOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  inline def createTensorsTypeOpAttr(attrName: String, tensorsOrDtype: DataType): TFEOpAttr = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsTypeOpAttr")(attrName.asInstanceOf[js.Any], tensorsOrDtype.asInstanceOf[js.Any])).asInstanceOf[TFEOpAttr]
  
  inline def ensureTensorflowBackend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureTensorflowBackend")().asInstanceOf[Unit]
  
  inline def getTFDType(dataType: DataType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTFDType")(dataType.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nodeBackend(): NodeJSKernelBackend = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeBackend")().asInstanceOf[NodeJSKernelBackend]
}
