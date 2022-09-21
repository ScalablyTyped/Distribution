package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsExpandDimsAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandDimsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ExpandDims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandDims(args: AttrsExpandDimsAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ExpandDims", "expandDimsConfig")
  @js.native
  val expandDimsConfig: KernelConfig = js.native
}
