package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsRaggedGatherAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedGatherMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedGather", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedGather(args: AttrsRaggedGatherAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("raggedGather")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedGather", "raggedGatherConfig")
  @js.native
  val raggedGatherConfig: KernelConfig = js.native
}
