package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Attrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgPoolMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPool(args: Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPool", "avgPoolConfig")
  @js.native
  val avgPoolConfig: KernelConfig = js.native
}
