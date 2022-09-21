package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMeanAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meanMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mean(args: AttrsMeanAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mean", "meanConfig")
  @js.native
  val meanConfig: KernelConfig = js.native
}
