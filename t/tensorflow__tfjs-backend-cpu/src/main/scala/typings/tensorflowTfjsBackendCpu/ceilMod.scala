package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", JSImport.Namespace)
@js.native
object ceilMod extends js.Object {
  
  val ceil: KernelFunc = js.native
  
  val ceilConfig: KernelConfig = js.native
  
  val ceilImpl: SimpleUnaryImpl = js.native
}
