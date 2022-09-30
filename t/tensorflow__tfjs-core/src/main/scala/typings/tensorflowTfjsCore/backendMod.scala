package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.anon.Unreliable
import typings.tensorflowTfjsCore.distTensorMod.Backend
import typings.tensorflowTfjsCore.distTensorMod.DataId
import typings.tensorflowTfjsCore.distTensorMod.DataToGPUOptions
import typings.tensorflowTfjsCore.distTensorMod.GPUData
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorflowTfjsCoreInts.`16`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreInts.`32`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/backend", "DataStorage")
  @js.native
  open class DataStorage[T] protected () extends StObject {
    def this(backend: KernelBackend, dataMover: DataMover) = this()
    
    /* private */ var backend: Any = js.native
    
    /* private */ var data: Any = js.native
    
    /* private */ var dataIdsCount: Any = js.native
    
    /* private */ var dataMover: Any = js.native
    
    def delete(dataId: DataId): Boolean = js.native
    
    def get(dataId: DataId): T = js.native
    
    def has(dataId: DataId): Boolean = js.native
    
    def numDataIds(): Double = js.native
    
    def set(dataId: DataId, value: T): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/backend", "EPSILON_FLOAT16")
  @js.native
  val EPSILON_FLOAT16: /* 0.0001 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/backend", "EPSILON_FLOAT32")
  @js.native
  val EPSILON_FLOAT32: /* 1e-7 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/backend", "KernelBackend")
  @js.native
  open class KernelBackend ()
    extends StObject
       with TensorStorage
       with Backend
       with BackendTimer {
    
    def dispose(): Unit = js.native
    
    /** Returns the smallest representable number.  */
    def epsilon(): Double = js.native
    
    /** Returns the highest precision for floats in bits (e.g. 16 or 32) */
    def floatPrecision(): `16` | `32` = js.native
    
    def incRef(dataId: DataId): Unit = js.native
    
    def readToGPU(dataId: js.Object): GPUData = js.native
    def readToGPU(dataId: js.Object, options: DataToGPUOptions): GPUData = js.native
    
    /* CompleteClass */
    override def time(f: js.Function0[Unit]): js.Promise[BackendTimingInfo] = js.native
    
    /* CompleteClass */
    override def timerAvailable(): Boolean = js.native
  }
  
  trait BackendTimer extends StObject {
    
    def time(f: js.Function0[Unit]): js.Promise[BackendTimingInfo]
    
    def timerAvailable(): Boolean
  }
  object BackendTimer {
    
    inline def apply(time: js.Function0[Unit] => js.Promise[BackendTimingInfo], timerAvailable: () => Boolean): BackendTimer = {
      val __obj = js.Dynamic.literal(time = js.Any.fromFunction1(time), timerAvailable = js.Any.fromFunction0(timerAvailable))
      __obj.asInstanceOf[BackendTimer]
    }
    
    extension [Self <: BackendTimer](x: Self) {
      
      inline def setTime(value: js.Function0[Unit] => js.Promise[BackendTimingInfo]): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
      
      inline def setTimerAvailable(value: () => Boolean): Self = StObject.set(x, "timerAvailable", js.Any.fromFunction0(value))
    }
  }
  
  trait BackendTimingInfo extends StObject {
    
    var getExtraProfileInfo: js.UndefOr[js.Function0[String]] = js.undefined
    
    var kernelMs: Double | Error
  }
  object BackendTimingInfo {
    
    inline def apply(kernelMs: Double | Error): BackendTimingInfo = {
      val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendTimingInfo]
    }
    
    extension [Self <: BackendTimingInfo](x: Self) {
      
      inline def setGetExtraProfileInfo(value: () => String): Self = StObject.set(x, "getExtraProfileInfo", js.Any.fromFunction0(value))
      
      inline def setGetExtraProfileInfoUndefined: Self = StObject.set(x, "getExtraProfileInfo", js.undefined)
      
      inline def setKernelMs(value: Double | Error): Self = StObject.set(x, "kernelMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataMover extends StObject {
    
    /**
      * To be called by backends whenever they see a dataId that they don't own.
      * Upon calling this method, the mover will fetch the tensor from another
      * backend and register it with the current active backend.
      */
    def moveData(backend: KernelBackend, dataId: DataId): Unit
  }
  object DataMover {
    
    inline def apply(moveData: (KernelBackend, DataId) => Unit): DataMover = {
      val __obj = js.Dynamic.literal(moveData = js.Any.fromFunction2(moveData))
      __obj.asInstanceOf[DataMover]
    }
    
    extension [Self <: DataMover](x: Self) {
      
      inline def setMoveData(value: (KernelBackend, DataId) => Unit): Self = StObject.set(x, "moveData", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TensorStorage extends StObject {
    
    def disposeData(dataId: DataId): Boolean = js.native
    def disposeData(dataId: DataId, force: Boolean): Boolean = js.native
    
    def memory(): Unreliable = js.native
    
    def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType, refCount: Double): Unit = js.native
    
    /** Returns number of data ids currently in the storage. */
    def numDataIds(): Double = js.native
    
    def read(dataId: DataId): js.Promise[BackendValues] = js.native
    
    def readSync(dataId: DataId): BackendValues = js.native
    
    def refCount(dataId: DataId): Double = js.native
    
    def write(values: BackendValues, shape: js.Array[Double], dtype: DataType): DataId = js.native
  }
}
