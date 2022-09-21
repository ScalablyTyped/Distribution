package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsStridedSliceAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stridedSliceMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StridedSlice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stridedSlice(args: AttrsStridedSliceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("stridedSlice")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StridedSlice", "stridedSliceConfig")
  @js.native
  val stridedSliceConfig: KernelConfig = js.native
}
