package typings
package atTensorflowTfjsDashCoreLib.distBackendsCpuBackendUnderscoreCpuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/backend_cpu", "MathBackendCPU")
@js.native
class MathBackendCPU ()
  extends atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend {
  var assertNotComplex: js.Any = js.native
  var blockSize: scala.Double = js.native
  var broadcastedBinaryComplexOp: js.Any = js.native
  var broadcastedBinaryOp: js.Any = js.native
  var bufferSync: js.Any = js.native
  var data: js.Any = js.native
  /**
    * Calculate FFT of inner most elements of batch tensor.
    */
  var fftBatch: js.Any = js.native
  var fftImpl: js.Any = js.native
  var fftRadix2: js.Any = js.native
  var firstUse: js.Any = js.native
  var fourierTransformByMatmul: js.Any = js.native
  var fromPixels2DContext: js.Any = js.native
  var isExponentOf2: js.Any = js.native
  var maxPoolPositions: js.Any = js.native
  var pool: js.Any = js.native
  var scatter: js.Any = js.native
  def cropAndResize(
    images: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D,
    boxes: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    boxIndex: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    cropSize: js.Tuple2[scala.Double, scala.Double],
    method: java.lang.String,
    extrapolationValue: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
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
  def linear[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
  def reshape[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def step[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
}

