package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsProdAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsProdMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Prod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prod(args: AttrsProdAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Prod", "prodConfig")
  @js.native
  val prodConfig: KernelConfig = js.native
}
