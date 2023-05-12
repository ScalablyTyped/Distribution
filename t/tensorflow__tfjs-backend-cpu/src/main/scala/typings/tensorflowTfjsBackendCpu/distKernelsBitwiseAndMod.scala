package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsBitwiseAndMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BitwiseAnd", "bitwiseAnd")
  @js.native
  val bitwiseAnd: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BitwiseAnd", "bitwiseAndConfig")
  @js.native
  val bitwiseAndConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BitwiseAnd", "bitwiseAndImpl")
  @js.native
  val bitwiseAndImpl: SimpleBinaryKernelImpl = js.native
}
