package typings.tensorflowTfjsBackendWasm

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsBackendWasm.anon.Wasm
import typings.tensorflowTfjsBackendWasm.tfjsBackendWasmMod.BackendWasmModule
import typings.tensorflowTfjsBackendWasm.tfjsBackendWasmThreadedSimdMod.BackendWasmThreadedSimdModule
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.mod.DataStorage
import typings.tensorflowTfjsCore.mod.KernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendWasmMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/backend_wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/backend_wasm", "BackendWasm")
  @js.native
  open class BackendWasm protected () extends KernelBackend {
    def this(wasm: BackendWasmModule) = this()
    def this(wasm: BackendWasmThreadedSimdModule) = this()
    
    var dataIdMap: DataStorage[TensorData] = js.native
    
    /* private */ var dataIdNextNumber: Any = js.native
    
    def getMemoryOffset(dataId: DataId): Double = js.native
    
    /**
      * Make a tensor info for the output of an op. If `memoryOffset` is not
      * present, this method allocates memory on the WASM heap. If `memoryOffset`
      * is present, the memory was allocated elsewhere (in c++) and we just record
      * the pointer where that memory lives.
      */
    def makeOutput(shape: js.Array[Double], dtype: DataType): TensorInfo = js.native
    def makeOutput(shape: js.Array[Double], dtype: DataType, memoryOffset: Double): TensorInfo = js.native
    
    def readSync(dataId: DataId, start: Double): BackendValues = js.native
    def readSync(dataId: DataId, start: Double, end: Double): BackendValues = js.native
    def readSync(dataId: DataId, start: Unit, end: Double): BackendValues = js.native
    
    def typedArrayFromHeap(hasShapeDtypeDataId: TensorInfo): TypedArray = js.native
    
    var wasm: BackendWasmModule | BackendWasmThreadedSimdModule = js.native
  }
  
  inline def getThreadsCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getThreadsCount")().asInstanceOf[Double]
  
  inline def init(): js.Promise[Wasm] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Wasm]]
  
  inline def resetWasmPath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWasmPath")().asInstanceOf[Unit]
  
  inline def setThreadsCount(numThreads: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setThreadsCount")(numThreads.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setWasmPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setWasmPath(path: String, usePlatformFetch: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPath")(path.asInstanceOf[js.Any], usePlatformFetch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setWasmPaths(
    prefixOrFileMap: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in @tensorflow/tfjs-backend-wasm.@tensorflow/tfjs-backend-wasm/dist/backend_wasm.WasmBinaryName ]:? string}
    */ typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.setWasmPaths & TopLevel[Any]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setWasmPaths(
    prefixOrFileMap: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in @tensorflow/tfjs-backend-wasm.@tensorflow/tfjs-backend-wasm/dist/backend_wasm.WasmBinaryName ]:? string}
    */ typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.setWasmPaths & TopLevel[Any],
    usePlatformFetch: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any], usePlatformFetch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setWasmPaths(prefixOrFileMap: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setWasmPaths(prefixOrFileMap: String, usePlatformFetch: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any], usePlatformFetch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DataId = js.Object
  
  trait TensorData extends StObject {
    
    var dtype: DataType
    
    var id: Double
    
    var memoryOffset: Double
    
    var refCount: Double
    
    var shape: js.Array[Double]
    
    /** Only used for string tensors, storing encoded bytes. */
    var stringBytes: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  }
  object TensorData {
    
    inline def apply(dtype: DataType, id: Double, memoryOffset: Double, refCount: Double, shape: js.Array[Double]): TensorData = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryOffset = memoryOffset.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorData]
    }
    
    extension [Self <: TensorData](x: Self) {
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMemoryOffset(value: Double): Self = StObject.set(x, "memoryOffset", value.asInstanceOf[js.Any])
      
      inline def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setStringBytes(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "stringBytes", value.asInstanceOf[js.Any])
      
      inline def setStringBytesUndefined: Self = StObject.set(x, "stringBytes", js.undefined)
      
      inline def setStringBytesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "stringBytes", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.`tfjs-backend-wasmDotwasm`
    - typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.`tfjs-backend-wasm-simdDotwasm`
    - typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.`tfjs-backend-wasm-threaded-simdDotwasm`
  */
  trait WasmBinaryName extends StObject
}
