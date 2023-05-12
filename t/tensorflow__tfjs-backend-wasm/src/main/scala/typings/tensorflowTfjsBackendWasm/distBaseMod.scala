package typings.tensorflowTfjsBackendWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/base", "BackendWasm")
  @js.native
  open class BackendWasm protected ()
    extends typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm {
    def this(wasm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BackendWasmModule */ Any) = this()
  }
  
  inline def getThreadsCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getThreadsCount")().asInstanceOf[Double]
  
  inline def setThreadsCount(numThreads: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setThreadsCount")(numThreads.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setWasmPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setWasmPath(path: String, usePlatformFetch: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPath")(path.asInstanceOf[js.Any], usePlatformFetch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setWasmPaths(prefixOrFileMap: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setWasmPaths(prefixOrFileMap: String, usePlatformFetch: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any], usePlatformFetch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setWasmPaths(
    prefixOrFileMap: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @tensorflow/tfjs-backend-wasm.@tensorflow/tfjs-backend-wasm/dist/backend_wasm.WasmBinaryName ]:? string} */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setWasmPaths(
    prefixOrFileMap: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @tensorflow/tfjs-backend-wasm.@tensorflow/tfjs-backend-wasm/dist/backend_wasm.WasmBinaryName ]:? string} */ js.Any,
    usePlatformFetch: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWasmPaths")(prefixOrFileMap.asInstanceOf[js.Any], usePlatformFetch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/base", "version_wasm")
  @js.native
  val versionWasm: /* "4.5.0" */ String = js.native
}
