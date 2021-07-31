package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMaxPoolAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def maxPool(args: AttrsMaxPoolAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPool", "maxPoolConfig")
  @js.native
  val maxPoolConfig: KernelConfig = js.native
}
