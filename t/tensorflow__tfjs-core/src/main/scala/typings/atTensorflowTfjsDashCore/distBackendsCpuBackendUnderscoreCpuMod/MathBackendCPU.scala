package typings.atTensorflowTfjsDashCore.distBackendsCpuBackendUnderscoreCpuMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataStorage
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/backend_cpu", "MathBackendCPU")
@js.native
class MathBackendCPU () extends KernelBackend {
  var blockSize: Double = js.native
  var broadcastedBinaryComplexOp: js.Any = js.native
  var broadcastedBinaryOp: js.Any = js.native
  var bufferSync: js.Any = js.native
  var data: DataStorage[TensorData[DataType]] = js.native
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
  var makeOutput: js.Any = js.native
  var maxPool3dPositions: js.Any = js.native
  var maxPoolPositions: js.Any = js.native
  var pool: js.Any = js.native
  var pool3d: js.Any = js.native
  var scatter: js.Any = js.native
  def cropAndResize(
    images: Tensor4D,
    boxes: Tensor2D,
    boxIndex: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: String,
    extrapolationValue: Double
  ): Tensor[R4] = js.native
  @JSName("depthToSpace")
  def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  def linear[T /* <: Tensor[Rank] */](x: T): T = js.native
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def step[T /* <: Tensor[Rank] */](x: T): T = js.native
}

