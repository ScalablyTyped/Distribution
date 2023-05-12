package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsTensorScatterUpdateAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTensorScatterUpdateMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/TensorScatterUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensorScatterUpdate(args: AttrsTensorScatterUpdateAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/TensorScatterUpdate", "tensorScatterUpdateConfig")
  @js.native
  val tensorScatterUpdateConfig: KernelConfig = js.native
}
