package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMaxPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolBackpropMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolBackprop", "maxPoolBackprop")
  @js.native
  def maxPoolBackprop(args: AttrsMaxPoolBackpropAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolBackprop", "maxPoolBackpropConfig")
  @js.native
  val maxPoolBackpropConfig: KernelConfig = js.native
}
