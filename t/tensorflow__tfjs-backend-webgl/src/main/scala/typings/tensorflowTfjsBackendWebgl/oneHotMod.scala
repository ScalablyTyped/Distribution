package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsOneHotAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneHotMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/OneHot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oneHot(args: AttrsOneHotAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("oneHot")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/OneHot", "oneHotConfig")
  @js.native
  val oneHotConfig: KernelConfig = js.native
}
