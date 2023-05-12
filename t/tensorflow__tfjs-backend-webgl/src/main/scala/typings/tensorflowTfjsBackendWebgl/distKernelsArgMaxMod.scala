package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.BackendInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsArgMaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ArgMax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMax(args: BackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ArgMax", "argMaxConfig")
  @js.native
  val argMaxConfig: KernelConfig = js.native
}
