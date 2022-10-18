package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Inputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAddNMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AddN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addN(args: Inputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("addN")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AddN", "addNConfig")
  @js.native
  val addNConfig: KernelConfig = js.native
}
