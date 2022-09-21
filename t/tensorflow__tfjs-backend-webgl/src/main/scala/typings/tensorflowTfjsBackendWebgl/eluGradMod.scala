package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsPickNamedTensorInfoMapydy
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eluGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/EluGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eluGrad(args: InputsPickNamedTensorInfoMapydy): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("eluGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/EluGrad", "eluGradConfig")
  @js.native
  val eluGradConfig: KernelConfig = js.native
}
