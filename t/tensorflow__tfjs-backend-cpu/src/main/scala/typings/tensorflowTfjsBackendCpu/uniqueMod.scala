package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsUniqueAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Unique", JSImport.Namespace)
@js.native
object uniqueMod extends js.Object {
  
  def unique(args: AttrsUniqueAttrs): js.Array[TensorInfo] = js.native
  
  val uniqueConfig: KernelConfig = js.native
}
