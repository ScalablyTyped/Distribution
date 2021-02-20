package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsTransposeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transposeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Transpose", "transpose")
  @js.native
  def transpose(args: AttrsTransposeAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Transpose", "transposeConfig")
  @js.native
  val transposeConfig: KernelConfig = js.native
}
