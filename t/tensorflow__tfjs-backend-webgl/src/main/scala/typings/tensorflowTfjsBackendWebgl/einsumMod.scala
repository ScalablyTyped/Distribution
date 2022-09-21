package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsEinsumAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object einsumMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Einsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def einsum(args: AttrsEinsumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("einsum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Einsum", "einsumConfig")
  @js.native
  val einsumConfig: KernelConfig = js.native
}
