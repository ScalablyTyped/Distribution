package typings.tensorflowTfjsBackendWasm

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsBackendWasm.tfjsBackendWasmMod.BackendWasmModule
import typings.tensorflowTfjsBackendWasm.tfjsBackendWasmThreadedSimdMod.BackendWasmThreadedSimdModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-wasm", "BackendWasm")
  @js.native
  open class BackendWasm protected ()
    extends typings.tensorflowTfjsBackendWasm.baseMod.BackendWasm {
    def this(wasm: BackendWasmModule) = this()
    def this(wasm: BackendWasmThreadedSimdModule) = this()
  }
  
  inline def getThreadsCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getThreadsCount")().asInstanceOf[Double]
  
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
  
  @JSImport("@tensorflow/tfjs-backend-wasm", "version_wasm")
  @js.native
  val versionWasm: /* "3.20.0" */ String = js.native
}
