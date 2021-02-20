package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Attrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgPoolMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPool", "avgPool")
  @js.native
  def avgPool(args: Attrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPool", "avgPoolConfig")
  @js.native
  val avgPoolConfig: KernelConfig = js.native
}
