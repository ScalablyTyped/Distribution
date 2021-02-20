package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv3DAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv3DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3D", "conv3D")
  @js.native
  def conv3D(args: AttrsConv3DAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3D", "conv3DConfig")
  @js.native
  val conv3DConfig: KernelConfig = js.native
}
