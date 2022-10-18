package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsModMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mod", "mod")
  @js.native
  val mod: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mod", "modConfig")
  @js.native
  val modConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mod", "modImpl")
  @js.native
  val modImpl: SimpleBinaryKernelImpl = js.native
}
