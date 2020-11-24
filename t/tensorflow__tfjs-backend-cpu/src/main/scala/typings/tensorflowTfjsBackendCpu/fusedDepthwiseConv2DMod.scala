package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFusedDepthwiseConv2DAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedDepthwiseConv2D", JSImport.Namespace)
@js.native
object fusedDepthwiseConv2DMod extends js.Object {
  
  def fusedDepthwiseConv2D(args: AttrsFusedDepthwiseConv2DAttrs): TensorInfo = js.native
  
  val fusedDepthwiseConv2DConfig: KernelConfig = js.native
}
