package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsBackendInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsArgMinMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ArgMin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMin(args: AttrsBackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ArgMin", "argMinConfig")
  @js.native
  val argMinConfig: KernelConfig = js.native
}
