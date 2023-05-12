package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsRangeAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRangeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(args: AttrsRangeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Range", "rangeConfig")
  @js.native
  val rangeConfig: KernelConfig = js.native
}
