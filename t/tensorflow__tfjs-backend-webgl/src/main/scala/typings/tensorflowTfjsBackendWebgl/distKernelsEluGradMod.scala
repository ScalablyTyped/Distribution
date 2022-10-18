package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsEluGradInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsEluGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/EluGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eluGrad(args: InputsEluGradInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("eluGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/EluGrad", "eluGradConfig")
  @js.native
  val eluGradConfig: KernelConfig = js.native
}
