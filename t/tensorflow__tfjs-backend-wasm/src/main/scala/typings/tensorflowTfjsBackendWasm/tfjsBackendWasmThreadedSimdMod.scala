package typings.tensorflowTfjsBackendWasm

import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.WebAssemblyExports
import typings.emscripten.Emscripten.WebAssemblyImports
import typings.emscripten.WebAssembly.Module
import typings.std.Blob
import typings.std.MessageEvent
import typings.std.WebGLRenderingContext
import typings.tensorflowTfjsBackendWasm.anon.Dispose
import typings.tensorflowTfjsBackendWasm.anon.TerminateAllThreads
import typings.tensorflowTfjsBackendWasm.tfjsBackendWasmMod.BackendWasmModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfjsBackendWasmThreadedSimdMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/wasm-out/tfjs-backend-wasm-threaded-simd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-wasm/wasm-out/tfjs-backend-wasm-threaded-simd", JSImport.Default)
  @js.native
  def default: js.Function1[/* settings */ WasmFactoryConfig, js.Promise[BackendWasmModule]] = js.native
  inline def default_=(x: js.Function1[/* settings */ WasmFactoryConfig, js.Promise[BackendWasmModule]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait BackendWasmThreadedSimdModule
    extends StObject
       with BackendWasmModule {
    
    var PThread: TerminateAllThreads
  }
  object BackendWasmThreadedSimdModule {
    
    inline def apply(
      FAST_MEMORY: Double,
      FHEAP: js.typedarray.Float64Array,
      HEAP: js.typedarray.Int32Array,
      HEAP16: js.typedarray.Int16Array,
      HEAP32: js.typedarray.Int32Array,
      HEAP8: js.typedarray.Int8Array,
      HEAPF32: js.typedarray.Float32Array,
      HEAPF64: js.typedarray.Float64Array,
      HEAPU16: js.typedarray.Uint16Array,
      HEAPU32: js.typedarray.Uint32Array,
      HEAPU8: js.typedarray.Uint8Array,
      IHEAP: js.typedarray.Int32Array,
      PThread: TerminateAllThreads,
      TOTAL_MEMORY: Double,
      TOTAL_STACK: Double,
      _free: Double => Unit,
      _malloc: Double => Double,
      addOnExit: js.Function0[Any] => Unit,
      addOnInit: js.Function0[Any] => Unit,
      addOnPostRun: js.Function0[Any] => Unit,
      addOnPreMain: js.Function0[Any] => Unit,
      addOnPreRun: js.Function0[Any] => Unit,
      arguments: js.Array[String],
      destroy: js.Object => Unit,
      environment: EnvironmentType,
      filePackagePrefixURL: String,
      getPreloadedPackage: (String, Double) => js.typedarray.ArrayBuffer,
      instantiateWasm: (WebAssemblyImports, js.Function1[/* module */ Module, Unit]) => WebAssemblyExports,
      locateFile: (String, String) => String,
      logReadFiles: Boolean,
      noExitRuntime: Boolean,
      noInitialRun: Boolean,
      onAbort: Any => Unit,
      onCustomMessage: MessageEvent[Any] => Unit,
      onRuntimeInitialized: () => Unit,
      postRun: js.Array[js.Function0[Unit]],
      preInit: js.Array[js.Function0[Unit]],
      preRun: js.Array[js.Function0[Unit]],
      preinitializedWebGLContext: WebGLRenderingContext,
      preloadedAudios: Any,
      preloadedImages: Any,
      print: String => Unit,
      printErr: String => Unit,
      tfjs: Dispose,
      wasmBinary: js.typedarray.ArrayBuffer
    ): BackendWasmThreadedSimdModule = {
      val __obj = js.Dynamic.literal(FAST_MEMORY = FAST_MEMORY.asInstanceOf[js.Any], FHEAP = FHEAP.asInstanceOf[js.Any], HEAP = HEAP.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPF64 = HEAPF64.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], IHEAP = IHEAP.asInstanceOf[js.Any], PThread = PThread.asInstanceOf[js.Any], TOTAL_MEMORY = TOTAL_MEMORY.asInstanceOf[js.Any], TOTAL_STACK = TOTAL_STACK.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), addOnExit = js.Any.fromFunction1(addOnExit), addOnInit = js.Any.fromFunction1(addOnInit), addOnPostRun = js.Any.fromFunction1(addOnPostRun), addOnPreMain = js.Any.fromFunction1(addOnPreMain), addOnPreRun = js.Any.fromFunction1(addOnPreRun), arguments = arguments.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), environment = environment.asInstanceOf[js.Any], filePackagePrefixURL = filePackagePrefixURL.asInstanceOf[js.Any], getPreloadedPackage = js.Any.fromFunction2(getPreloadedPackage), instantiateWasm = js.Any.fromFunction2(instantiateWasm), locateFile = js.Any.fromFunction2(locateFile), logReadFiles = logReadFiles.asInstanceOf[js.Any], noExitRuntime = noExitRuntime.asInstanceOf[js.Any], noInitialRun = noInitialRun.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onCustomMessage = js.Any.fromFunction1(onCustomMessage), onRuntimeInitialized = js.Any.fromFunction0(onRuntimeInitialized), postRun = postRun.asInstanceOf[js.Any], preInit = preInit.asInstanceOf[js.Any], preRun = preRun.asInstanceOf[js.Any], preinitializedWebGLContext = preinitializedWebGLContext.asInstanceOf[js.Any], preloadedAudios = preloadedAudios.asInstanceOf[js.Any], preloadedImages = preloadedImages.asInstanceOf[js.Any], print = js.Any.fromFunction1(print), printErr = js.Any.fromFunction1(printErr), tfjs = tfjs.asInstanceOf[js.Any], wasmBinary = wasmBinary.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendWasmThreadedSimdModule]
    }
    
    extension [Self <: BackendWasmThreadedSimdModule](x: Self) {
      
      inline def setPThread(value: TerminateAllThreads): Self = StObject.set(x, "PThread", value.asInstanceOf[js.Any])
    }
  }
  
  trait WasmFactoryConfig extends StObject {
    
    var instantiateWasm: js.UndefOr[js.Function] = js.undefined
    
    var locateFile: js.UndefOr[js.Function2[/* path */ String, /* prefix */ String, String]] = js.undefined
    
    var mainScriptUrlOrBlob: js.UndefOr[String | Blob] = js.undefined
    
    var onAbort: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object WasmFactoryConfig {
    
    inline def apply(): WasmFactoryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WasmFactoryConfig]
    }
    
    extension [Self <: WasmFactoryConfig](x: Self) {
      
      inline def setInstantiateWasm(value: js.Function): Self = StObject.set(x, "instantiateWasm", value.asInstanceOf[js.Any])
      
      inline def setInstantiateWasmUndefined: Self = StObject.set(x, "instantiateWasm", js.undefined)
      
      inline def setLocateFile(value: (/* path */ String, /* prefix */ String) => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction2(value))
      
      inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
      
      inline def setMainScriptUrlOrBlob(value: String | Blob): Self = StObject.set(x, "mainScriptUrlOrBlob", value.asInstanceOf[js.Any])
      
      inline def setMainScriptUrlOrBlobUndefined: Self = StObject.set(x, "mainScriptUrlOrBlob", js.undefined)
      
      inline def setOnAbort(value: /* msg */ String => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnRuntimeInitialized(value: () => Unit): Self = StObject.set(x, "onRuntimeInitialized", js.Any.fromFunction0(value))
      
      inline def setOnRuntimeInitializedUndefined: Self = StObject.set(x, "onRuntimeInitialized", js.undefined)
    }
  }
}
