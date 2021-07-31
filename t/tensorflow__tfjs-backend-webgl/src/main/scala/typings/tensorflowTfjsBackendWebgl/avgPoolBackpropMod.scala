package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Backend
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgPoolBackpropMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPoolBackprop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def avgPoolBackprop(args: Backend): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPoolBackprop", "avgPoolBackpropConfig")
  @js.native
  val avgPoolBackpropConfig: KernelConfig = js.native
}
