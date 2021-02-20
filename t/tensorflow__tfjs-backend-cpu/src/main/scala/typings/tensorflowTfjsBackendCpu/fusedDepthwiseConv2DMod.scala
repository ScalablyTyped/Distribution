package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFusedDepthwiseConv2DAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedDepthwiseConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedDepthwiseConv2D", "fusedDepthwiseConv2D")
  @js.native
  def fusedDepthwiseConv2D(args: AttrsFusedDepthwiseConv2DAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedDepthwiseConv2D", "fusedDepthwiseConv2DConfig")
  @js.native
  val fusedDepthwiseConv2DConfig: KernelConfig = js.native
}
