package typings.tensorflowTfjsBackendCpu.backendCpuMod

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.NCHW
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.NHWC
import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.mod.DataStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/backend_cpu", "MathBackendCPU")
@js.native
class MathBackendCPU () extends KernelBackend {
  
  var blockSize: Double = js.native
  
  var broadcastedBinaryOp: js.Any = js.native
  
  var bufferSync: js.Any = js.native
  
  def cropAndResize(
    images: Tensor4D,
    boxes: Tensor2D,
    boxIndex: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: String,
    extrapolationValue: Double
  ): Tensor[R4] = js.native
  
  var data: DataStorage[TensorData[DataType]] = js.native
  
  /** Decrease refCount of a `TensorData`. */
  def decRef(dataId: DataId): Unit = js.native
  
  @JSName("depthToSpace")
  def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  
  def disposeData(dataId: DataId): Unit = js.native
  
  def disposeIntermediateTensorInfo(tensorInfo: TensorInfo): Unit = js.native
  
  var firstUse: js.Any = js.native
  
  /** Increase refCount of a `TensorData`. */
  def incRef(dataId: DataId): Unit = js.native
  
  def makeOutput[T /* <: Tensor[Rank] */](values: BackendValues, shape: js.Array[Double], dtype: DataType): T = js.native
  
  /**
    * Create a data bucket in cpu backend.
    * @param shape Shape of the `TensorInfo`.
    * @param dtype DType of the `TensorInfo`.
    * @param values The value of the `TensorInfo` stored as a flattened array.
    */
  def makeTensorInfo(shape: js.Array[Double], dtype: DataType): TensorInfo = js.native
  def makeTensorInfo(shape: js.Array[Double], dtype: DataType, values: js.Array[String]): TensorInfo = js.native
  def makeTensorInfo(shape: js.Array[Double], dtype: DataType, values: BackendValues): TensorInfo = js.native
  
  var maxPool3dPositions: js.Any = js.native
  
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit = js.native
  
  var pool3d: js.Any = js.native
  
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  
  def readSync(dataId: DataId): BackendValues = js.native
  
  var scatter: js.Any = js.native
}
