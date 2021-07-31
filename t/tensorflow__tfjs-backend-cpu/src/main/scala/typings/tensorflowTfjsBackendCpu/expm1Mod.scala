package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expm1Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Expm1", "expm1")
  @js.native
  val expm1: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Expm1", "expm1Config")
  @js.native
  val expm1Config: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Expm1", "expm1Impl")
  @js.native
  val expm1Impl: SimpleUnaryImpl = js.native
}
