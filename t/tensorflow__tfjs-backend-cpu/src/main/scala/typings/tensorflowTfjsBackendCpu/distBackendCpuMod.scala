package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Imag
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.DataStorage
import typings.tensorflowTfjsCore.mod.KernelBackend
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendCpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/backend_cpu", "MathBackendCPU")
  @js.native
  open class MathBackendCPU () extends KernelBackend {
    
    var blockSize: Double = js.native
    
    def bufferSync[R /* <: Rank */, D /* <: DataType */](t: TensorInfo): TensorBuffer[R, D] = js.native
    
    var data: DataStorage[TensorData[DataType]] = js.native
    
    /** Decrease refCount of a `TensorData`. */
    def decRef(dataId: DataId): Unit = js.native
    
    /**
      * Dispose the memory if the dataId has 0 refCount. Return true if the memory
      * is released or memory is not managed in this backend, false if memory is
      * not cleared.
      * @param dataId
      * @oaram force Optional, remove the data regardless of refCount
      */
    def disposeData(dataId: DataId): Boolean = js.native
    def disposeData(dataId: DataId, force: Boolean): Boolean = js.native
    
    def disposeIntermediateTensorInfo(tensorInfo: TensorInfo): Unit = js.native
    
    /* private */ var firstUse: Any = js.native
    
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
    
    def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType, refCount: Double): Unit = js.native
    
    /* private */ var nextDataId: Any = js.native
    
    def read(dataId: DataId): js.Promise[BackendValues] = js.native
    
    def readSync(dataId: DataId): BackendValues = js.native
    
    /** Return refCount of a `TensorData`. */
    def refCount(dataId: DataId): Double = js.native
    
    def where(condition: Tensor[Rank]): Tensor2D = js.native
  }
  /* static members */
  object MathBackendCPU {
    
    @JSImport("@tensorflow/tfjs-backend-cpu/dist/backend_cpu", "MathBackendCPU")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu/dist/backend_cpu", "MathBackendCPU.nextDataId")
    @js.native
    def nextDataId: Any = js.native
    inline def nextDataId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextDataId")(x.asInstanceOf[js.Any])
  }
  
  trait DataId extends StObject
  
  trait TensorData[D /* <: DataType */] extends StObject {
    
    var complexTensorInfos: js.UndefOr[Imag] = js.undefined
    
    var dtype: D
    
    var refCount: Double
    
    var values: js.UndefOr[BackendValues] = js.undefined
  }
  object TensorData {
    
    inline def apply[D /* <: DataType */](dtype: D, refCount: Double): TensorData[D] = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorData[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TensorData[?], D /* <: DataType */] (val x: Self & TensorData[D]) extends AnyVal {
      
      inline def setComplexTensorInfos(value: Imag): Self = StObject.set(x, "complexTensorInfos", value.asInstanceOf[js.Any])
      
      inline def setComplexTensorInfosUndefined: Self = StObject.set(x, "complexTensorInfos", js.undefined)
      
      inline def setDtype(value: D): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      inline def setValues(value: BackendValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
