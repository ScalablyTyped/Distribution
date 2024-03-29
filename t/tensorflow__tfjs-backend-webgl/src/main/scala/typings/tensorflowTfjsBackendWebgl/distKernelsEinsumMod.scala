package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsEinsumAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsEinsumMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Einsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def einsum(args: AttrsEinsumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("einsum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Einsum", "einsumConfig")
  @js.native
  val einsumConfig: KernelConfig = js.native
}
