package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsReshapeAttrs
import typings.tensorflowTfjsBackendWasm.anon.DataId
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Reshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reshape(args: AttrsReshapeAttrs): DataId = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[DataId]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Reshape", "reshapeConfig")
  @js.native
  val reshapeConfig: KernelConfig = js.native
}
