package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsCumprodAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cumprodMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Cumprod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cumprod(args: AttrsCumprodAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Cumprod", "cumprodConfig")
  @js.native
  val cumprodConfig: KernelConfig = js.native
}
