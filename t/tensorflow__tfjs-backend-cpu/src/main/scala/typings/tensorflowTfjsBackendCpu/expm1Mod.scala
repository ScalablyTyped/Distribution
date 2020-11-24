package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Expm1", JSImport.Namespace)
@js.native
object expm1Mod extends js.Object {
  
  val expm1: KernelFunc = js.native
  
  val expm1Config: KernelConfig = js.native
  
  val expm1Impl: SimpleUnaryImpl = js.native
}
