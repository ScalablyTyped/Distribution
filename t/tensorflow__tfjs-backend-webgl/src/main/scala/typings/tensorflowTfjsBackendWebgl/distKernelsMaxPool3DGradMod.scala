package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsMaxPool3DGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPool3DGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPool3DGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPool3DGrad(args: AttrsMaxPool3DGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3DGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPool3DGrad", "maxPool3DGradConfig")
  @js.native
  val maxPool3DGradConfig: KernelConfig = js.native
}
