package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsGreaterEqualMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/GreaterEqual", "greaterEqual")
  @js.native
  val greaterEqual: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/GreaterEqual", "greaterEqualConfig")
  @js.native
  val greaterEqualConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/GreaterEqual", "greaterEqualImpl")
  @js.native
  val greaterEqualImpl: SimpleBinaryKernelImpl = js.native
}
