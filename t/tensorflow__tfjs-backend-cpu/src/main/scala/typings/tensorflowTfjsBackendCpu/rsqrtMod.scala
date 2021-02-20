package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsqrtMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Rsqrt", "rsqrt")
  @js.native
  val rsqrt: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Rsqrt", "rsqrtConfig")
  @js.native
  val rsqrtConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Rsqrt", "rsqrtImpl")
  @js.native
  val rsqrtImpl: SimpleUnaryImpl = js.native
}
