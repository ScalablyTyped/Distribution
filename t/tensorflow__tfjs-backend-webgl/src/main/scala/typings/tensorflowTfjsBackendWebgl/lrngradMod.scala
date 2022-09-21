package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsLRNGradAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lrngradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LRNGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LRNGrad", "LRNGradConfig")
  @js.native
  val LRNGradConfig: KernelConfig = js.native
  
  inline def lrnGrad(args: AttrsLRNGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("lrnGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
