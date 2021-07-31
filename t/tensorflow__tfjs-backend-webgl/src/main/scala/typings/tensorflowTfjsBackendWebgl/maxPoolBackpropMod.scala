package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsMaxPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolBackpropMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolBackprop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def maxPoolBackprop(args: AttrsMaxPoolBackpropAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolBackprop")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolBackprop", "maxPoolBackpropConfig")
  @js.native
  val maxPoolBackpropConfig: KernelConfig = js.native
}
