package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsBatchToSpaceNDAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchToSpaceNDMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchToSpaceND", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchToSpaceND(args: AttrsBatchToSpaceNDAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchToSpaceND")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchToSpaceND", "batchToSpaceNDConfig")
  @js.native
  val batchToSpaceNDConfig: KernelConfig = js.native
}
