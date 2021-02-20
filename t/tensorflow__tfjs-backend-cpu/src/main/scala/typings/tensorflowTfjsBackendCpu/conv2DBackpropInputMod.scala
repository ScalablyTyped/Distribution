package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv2DBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv2DBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2DBackpropInput", "conv2DBackpropInput")
  @js.native
  def conv2DBackpropInput(args: AttrsConv2DBackpropInputAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2DBackpropInput", "conv2DBackpropInputConfig")
  @js.native
  val conv2DBackpropInputConfig: KernelConfig = js.native
}
