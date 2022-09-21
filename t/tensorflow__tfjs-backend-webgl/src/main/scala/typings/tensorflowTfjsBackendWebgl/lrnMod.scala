package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsLRNAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lrnMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LRN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LRN", "LRNConfig")
  @js.native
  val LRNConfig: KernelConfig = js.native
  
  inline def lrn(args: AttrsLRNAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("lrn")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
