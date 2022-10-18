package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsTopKAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTopKMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/TopK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topK(args: AttrsTopKAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("topK")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/TopK", "topKConfig")
  @js.native
  val topKConfig: KernelConfig = js.native
}
