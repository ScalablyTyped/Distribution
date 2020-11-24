package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMirrorPadAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", JSImport.Namespace)
@js.native
object mirrorPadMod extends js.Object {
  
  def mirrorPad(args: AttrsMirrorPadAttrs): TensorInfo = js.native
  
  val mirrorPadConfig: KernelConfig = js.native
}
