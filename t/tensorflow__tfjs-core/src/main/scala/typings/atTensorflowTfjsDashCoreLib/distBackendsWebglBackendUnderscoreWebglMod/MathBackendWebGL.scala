package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/backend_webgl", "MathBackendWebGL")
@js.native
class MathBackendWebGL ()
  extends atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend {
  def this(gpgpu: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext) = this()
  var acquireTexture: js.Any = js.native
  var activeTimers: js.Any = js.native
  var argMinMaxReduce: js.Any = js.native
  var argReduce: js.Any = js.native
  var argReducePacked: js.Any = js.native
  var binaryCache: js.Any = js.native
  var canvas: js.Any = js.native
  /**
    * Computes a complex binary operation that can be decomposed into a simple
    * binary operation on both the real and imagary parts.
    */
  var complexSeparableBinaryOp: js.Any = js.native
  var computeBytes: js.Any = js.native
  var convertAndCacheOnCPU: js.Any = js.native
  var cpuBackend: js.Any = js.native
  var dataRefCount: js.Any = js.native
  var decode: js.Any = js.native
  var disposed: js.Any = js.native
  var downloadWaitMs: js.Any = js.native
  var endTimer: js.Any = js.native
  var fftImpl: js.Any = js.native
  var floatPrecisionValue: js.Any = js.native
  var fromPixels2DContext: js.Any = js.native
  var getAndSaveBinary: js.Any = js.native
  var getCPUBackend: js.Any = js.native
  var getQueryTime: js.Any = js.native
  var getValuesFromTexture: js.Any = js.native
  var gpgpu: js.UndefOr[js.Any] = js.native
  var gpgpuCreatedLocally: js.Any = js.native
  var makeComplexComponentTensorHandle: js.Any = js.native
  var makeOutputArray: js.Any = js.native
  var makePackedTensor: js.Any = js.native
  var makeTensorHandle: js.Any = js.native
  var numBytesInGPU: js.Any = js.native
  var numMBBeforeWarning: js.Any = js.native
  var packTensor: js.Any = js.native
  var packedBinaryOp: js.Any = js.native
  var packedReshape: js.Any = js.native
  var pendingDisposal: js.Any = js.native
  var pendingRead: js.Any = js.native
  var programTimersStack: js.Any = js.native
  var reduce: js.Any = js.native
  var releaseGPUData: js.Any = js.native
  var segOpCompute: js.Any = js.native
  var shallowSlice: js.Any = js.native
  var shouldExecuteOnCPU: js.Any = js.native
  var startTimer: js.Any = js.native
  var texData: js.Any = js.native
  var textureManager: js.Any = js.native
  var unpackTensor: js.Any = js.native
  var uploadToGPU: js.Any = js.native
  var uploadWaitMs: js.Any = js.native
  var warnedAboutMemory: js.Any = js.native
  def compileAndRun[K /* <: atTensorflowTfjsDashCoreLib.Anon_DataId */](
    program: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram,
    inputs: js.Array[TensorHandle]
  ): K = js.native
  def compileAndRun[K /* <: atTensorflowTfjsDashCoreLib.Anon_DataId */](
    program: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram,
    inputs: js.Array[TensorHandle],
    output: K
  ): K = js.native
  def compileAndRun[K /* <: atTensorflowTfjsDashCoreLib.Anon_DataId */](
    program: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram,
    inputs: js.Array[TensorHandle],
    output: K,
    customSetup: js.Function2[
      /* gpgpu */ atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext, 
      /* webGLProgram */ stdLib.WebGLProgram, 
      scala.Unit
    ]
  ): K = js.native
  def compileAndRun[K /* <: atTensorflowTfjsDashCoreLib.Anon_DataId */](
    program: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram,
    inputs: js.Array[TensorHandle],
    output: K,
    customSetup: js.Function2[
      /* gpgpu */ atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext, 
      /* webGLProgram */ stdLib.WebGLProgram, 
      scala.Unit
    ],
    preventEagerUnpackingOfOutput: scala.Boolean
  ): K = js.native
  def conv2dByMatMul(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def conv2dWithIm2Row(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    convInfo: atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod.Conv2DInfo
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NCHW(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    blockSize: scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    blockSize: scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def getGPGPUContext(): atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext = js.native
  def getTexture(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): stdLib.WebGLTexture = js.native
  def getTextureManager(): atTensorflowTfjsDashCoreLib.distBackendsWebglTextureUnderscoreManagerMod.TextureManager = js.native
  def reshape[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
}

