package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsTopKAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTopKMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/TopK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topK(args: AttrsTopKAttrs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("topK")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/TopK", "topKConfig")
  @js.native
  val topKConfig: KernelConfig = js.native
}
