package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.BackendMathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastArgsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BroadcastArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastArgs(args: BackendMathBackendWebGL): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BroadcastArgs", "broadcastArgsConfig")
  @js.native
  val broadcastArgsConfig: KernelConfig = js.native
}
