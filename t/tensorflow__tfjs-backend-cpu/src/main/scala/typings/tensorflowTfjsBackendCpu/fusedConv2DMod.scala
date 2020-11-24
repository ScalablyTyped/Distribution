package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFusedConv2DAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedConv2D", JSImport.Namespace)
@js.native
object fusedConv2DMod extends js.Object {
  
  def fusedConv2D(args: AttrsFusedConv2DAttrs): TensorInfo = js.native
  
  val fusedConv2DConfig: KernelConfig = js.native
}
