package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFloorMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Floor", "floor")
  @js.native
  val floor: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Floor", "floorConfig")
  @js.native
  val floorConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Floor", "floorImpl")
  @js.native
  val floorImpl: SimpleUnaryImpl = js.native
}
