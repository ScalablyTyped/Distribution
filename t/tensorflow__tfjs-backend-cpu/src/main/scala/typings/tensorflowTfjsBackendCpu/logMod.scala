package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Log", "log")
  @js.native
  val log: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Log", "logConfig")
  @js.native
  val logConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Log", "logImpl")
  @js.native
  val logImpl: SimpleUnaryImpl = js.native
}
