package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsRaggedGatherAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedGatherMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/RaggedGather", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedGather(args: AttrsRaggedGatherAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("raggedGather")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/RaggedGather", "raggedGatherConfig")
  @js.native
  val raggedGatherConfig: KernelConfig = js.native
}
