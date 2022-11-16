package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import typings.std.WeakMap
import typings.std.WebGLTexture
import typings.tensorflowTfjsBackendWebgl.distGpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUBinary
import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureData
import typings.tensorflowTfjsBackendWebgl.distTextureManagerMod.TextureManager
import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.distEngineMod.MemoryInfo
import typings.tensorflowTfjsCore.distEngineMod.TimingInfo
import typings.tensorflowTfjsCore.distKernelRegistryMod.DataId
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.mod.DataStorage
import typings.tensorflowTfjsCore.mod.KernelBackend
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendWebglMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "EPSILON_FLOAT16")
  @js.native
  val EPSILON_FLOAT16: /* 0.0001 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "EPSILON_FLOAT32")
  @js.native
  val EPSILON_FLOAT32: /* 1e-7 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "MathBackendWebGL")
  @js.native
  open class MathBackendWebGL () extends KernelBackend {
    def this(gpuResource: HTMLCanvasElement) = this()
    def this(gpuResource: OffscreenCanvas) = this()
    def this(gpuResource: GPGPUContext) = this()
    
    def abs[T /* <: Tensor[Rank] */](x: T): T = js.native
    
    /* private */ var acquireTexture: Any = js.native
    
    /* private */ var activeTimers: Any = js.native
    
    /* private */ var binaryCache: Any = js.native
    
    def bufferSync[R /* <: Rank */, D /* <: DataType */](t: TensorInfo): TensorBuffer[R, D] = js.native
    
    /* private */ var canvas: Any = js.native
    
    def checkCompileCompletion(): Unit = js.native
    
    def checkCompileCompletionAsync(): js.Promise[js.Array[Boolean]] = js.native
    
    /* private */ var checkCompletionAsync_ : Any = js.native
    
    /* private */ var checkCompletion_ : Any = js.native
    
    /* private */ var checkNumericalProblems: Any = js.native
    
    def compileAndRun(program: GPGPUProgram, inputs: js.Array[TensorInfo]): TensorInfo = js.native
    def compileAndRun(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: Unit,
      customUniformValues: js.Array[js.Array[Double]]
    ): TensorInfo = js.native
    def compileAndRun(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: Unit,
      customUniformValues: js.Array[js.Array[Double]],
      preventEagerUnpackingOfOutput: Boolean
    ): TensorInfo = js.native
    def compileAndRun(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: Unit,
      customUniformValues: Unit,
      preventEagerUnpackingOfOutput: Boolean
    ): TensorInfo = js.native
    def compileAndRun(program: GPGPUProgram, inputs: js.Array[TensorInfo], outputDtype: DataType): TensorInfo = js.native
    def compileAndRun(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: js.Array[js.Array[Double]]
    ): TensorInfo = js.native
    def compileAndRun(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: js.Array[js.Array[Double]],
      preventEagerUnpackingOfOutput: Boolean
    ): TensorInfo = js.native
    def compileAndRun(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: Unit,
      preventEagerUnpackingOfOutput: Boolean
    ): TensorInfo = js.native
    
    /* private */ var computeBytes: Any = js.native
    
    /* private */ var convertAndCacheOnCPU: Any = js.native
    
    var dataRefCount: WeakMap[js.Object, Double] = js.native
    
    /** Decrease refCount of a `TextureData`. */
    def decRef(dataId: DataId): Unit = js.native
    
    /* private */ var decode: Any = js.native
    
    def disposeIntermediateTensorInfo(tensorInfo: TensorInfo): Unit = js.native
    
    /* private */ var disposed: Any = js.native
    
    /* private */ var downloadWaitMs: Any = js.native
    
    /* private */ var endTimer: Any = js.native
    
    /* private */ var floatPrecisionValue: Any = js.native
    
    /* private */ var getAndSaveBinary: Any = js.native
    
    /**
      * Returns internal information for the specific data bucket. Used in unit
      * tests.
      */
    def getDataInfo(dataId: DataId): TextureData = js.native
    
    def getGPGPUContext(): GPGPUContext = js.native
    
    /* private */ var getQueryTime: Any = js.native
    
    def getTexture(dataId: DataId): WebGLTexture = js.native
    
    def getTextureManager(): TextureManager = js.native
    
    def getUniformLocations(): Unit = js.native
    
    /* private */ var getValuesFromTexture: Any = js.native
    
    var gpgpu: GPGPUContext = js.native
    
    /* private */ var gpgpuCreatedLocally: Any = js.native
    
    /* private */ var lastGlFlushTime: Any = js.native
    
    /* private */ var makeOutput: Any = js.native
    
    def makeTensorInfo(shape: js.Array[Double], dtype: DataType): TensorInfo = js.native
    def makeTensorInfo(shape: js.Array[Double], dtype: DataType, values: js.Array[String]): TensorInfo = js.native
    def makeTensorInfo(shape: js.Array[Double], dtype: DataType, values: BackendValues): TensorInfo = js.native
    
    /* private */ var nextDataId: Any = js.native
    
    /* private */ var numBytesInGPU: Any = js.native
    
    /* private */ var numMBBeforeWarning: Any = js.native
    
    def packTensor(input: TensorInfo): TensorInfo = js.native
    
    /* private */ var packedReshape: Any = js.native
    
    /* private */ var packedUnaryOp: Any = js.native
    
    /* private */ var pendingDeletes: Any = js.native
    
    /* private */ var pendingDisposal: Any = js.native
    
    /* private */ var pendingRead: Any = js.native
    
    /* private */ var programTimersStack: Any = js.native
    
    /* private */ var releaseGPUData: Any = js.native
    
    def runWebGLProgram(program: GPGPUProgram, inputs: js.Array[TensorInfo], outputDtype: DataType): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: js.Array[js.Array[Double]]
    ): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: js.Array[js.Array[Double]],
      preventEagerUnpackingOfOutput: Boolean
    ): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: js.Array[js.Array[Double]],
      preventEagerUnpackingOfOutput: Boolean,
      customTexShape: js.Tuple2[Double, Double]
    ): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: js.Array[js.Array[Double]],
      preventEagerUnpackingOfOutput: Unit,
      customTexShape: js.Tuple2[Double, Double]
    ): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: Unit,
      preventEagerUnpackingOfOutput: Boolean
    ): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: Unit,
      preventEagerUnpackingOfOutput: Boolean,
      customTexShape: js.Tuple2[Double, Double]
    ): TensorInfo = js.native
    def runWebGLProgram(
      program: GPGPUProgram,
      inputs: js.Array[TensorInfo],
      outputDtype: DataType,
      customUniformValues: Unit,
      preventEagerUnpackingOfOutput: Unit,
      customTexShape: js.Tuple2[Double, Double]
    ): TensorInfo = js.native
    
    def shouldExecuteOnCPU(inputs: js.Array[TensorInfo]): Boolean = js.native
    def shouldExecuteOnCPU(inputs: js.Array[TensorInfo], sizeThreshold: Double): Boolean = js.native
    
    /* private */ var startTimer: Any = js.native
    
    var texData: DataStorage[TextureData] = js.native
    
    /* private */ var textureManager: Any = js.native
    
    def unpackTensor(input: TensorInfo): TensorInfo = js.native
    
    def uploadToGPU(dataId: DataId): Unit = js.native
    
    /* private */ var uploadWaitMs: Any = js.native
    
    /* private */ var warnedAboutMemory: Any = js.native
    
    def where(condition: Tensor[Rank]): Tensor2D = js.native
    
    def writeTexture(
      texture: WebGLTexture,
      shape: js.Array[Double],
      dtype: DataType,
      texHeight: Double,
      texWidth: Double,
      channels: String
    ): DataId = js.native
  }
  /* static members */
  object MathBackendWebGL {
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "MathBackendWebGL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "MathBackendWebGL.nextDataId")
    @js.native
    def nextDataId: Any = js.native
    inline def nextDataId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextDataId")(x.asInstanceOf[js.Any])
  }
  
  inline def getBinaryCache(webGLVersion: Double): StringDictionary[GPGPUBinary] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinaryCache")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[GPGPUBinary]]
  
  trait CPUTimerQuery extends StObject {
    
    var endMs: js.UndefOr[Double] = js.undefined
    
    var startMs: Double
  }
  object CPUTimerQuery {
    
    inline def apply(startMs: Double): CPUTimerQuery = {
      val __obj = js.Dynamic.literal(startMs = startMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPUTimerQuery]
    }
    
    extension [Self <: CPUTimerQuery](x: Self) {
      
      inline def setEndMs(value: Double): Self = StObject.set(x, "endMs", value.asInstanceOf[js.Any])
      
      inline def setEndMsUndefined: Self = StObject.set(x, "endMs", js.undefined)
      
      inline def setStartMs(value: Double): Self = StObject.set(x, "startMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait KernelInfo extends StObject {
    
    var name: String
    
    var query: js.Promise[Double]
  }
  object KernelInfo {
    
    inline def apply(name: String, query: js.Promise[Double]): KernelInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelInfo]
    }
    
    extension [Self <: KernelInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Promise[Double]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type TimerNode = RecursiveArray[KernelInfo] | KernelInfo
  
  trait WebGLMemoryInfo
    extends StObject
       with MemoryInfo {
    
    var numBytesInGPU: Double
    
    var numBytesInGPUAllocated: Double
    
    var numBytesInGPUFree: Double
    
    @JSName("unreliable")
    var unreliable_WebGLMemoryInfo: Boolean
  }
  object WebGLMemoryInfo {
    
    inline def apply(
      numBytes: Double,
      numBytesInGPU: Double,
      numBytesInGPUAllocated: Double,
      numBytesInGPUFree: Double,
      numDataBuffers: Double,
      numTensors: Double,
      reasons: js.Array[String],
      unreliable: Boolean
    ): WebGLMemoryInfo = {
      val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numBytesInGPU = numBytesInGPU.asInstanceOf[js.Any], numBytesInGPUAllocated = numBytesInGPUAllocated.asInstanceOf[js.Any], numBytesInGPUFree = numBytesInGPUFree.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLMemoryInfo]
    }
    
    extension [Self <: WebGLMemoryInfo](x: Self) {
      
      inline def setNumBytesInGPU(value: Double): Self = StObject.set(x, "numBytesInGPU", value.asInstanceOf[js.Any])
      
      inline def setNumBytesInGPUAllocated(value: Double): Self = StObject.set(x, "numBytesInGPUAllocated", value.asInstanceOf[js.Any])
      
      inline def setNumBytesInGPUFree(value: Double): Self = StObject.set(x, "numBytesInGPUFree", value.asInstanceOf[js.Any])
      
      inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGLTimingInfo
    extends StObject
       with TimingInfo {
    
    var downloadWaitMs: Double
    
    var uploadWaitMs: Double
  }
  object WebGLTimingInfo {
    
    inline def apply(downloadWaitMs: Double, kernelMs: Double | Error, uploadWaitMs: Double, wallMs: Double): WebGLTimingInfo = {
      val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs.asInstanceOf[js.Any], kernelMs = kernelMs.asInstanceOf[js.Any], uploadWaitMs = uploadWaitMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLTimingInfo]
    }
    
    extension [Self <: WebGLTimingInfo](x: Self) {
      
      inline def setDownloadWaitMs(value: Double): Self = StObject.set(x, "downloadWaitMs", value.asInstanceOf[js.Any])
      
      inline def setUploadWaitMs(value: Double): Self = StObject.set(x, "uploadWaitMs", value.asInstanceOf[js.Any])
    }
  }
}
