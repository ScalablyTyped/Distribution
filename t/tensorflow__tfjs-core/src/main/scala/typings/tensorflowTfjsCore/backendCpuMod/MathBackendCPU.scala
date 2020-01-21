package typings.tensorflowTfjsCore.backendCpuMod

import typings.tensorflowTfjsCore.backendMod.DataStorage
import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
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

