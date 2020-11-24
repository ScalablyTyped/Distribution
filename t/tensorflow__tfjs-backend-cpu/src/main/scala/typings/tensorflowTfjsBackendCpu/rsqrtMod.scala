package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Rsqrt", JSImport.Namespace)
@js.native
object rsqrtMod extends js.Object {
  
  val rsqrt: KernelFunc = js.native
  
  val rsqrtConfig: KernelConfig = js.native
  
  val rsqrtImpl: SimpleUnaryImpl = js.native
}
