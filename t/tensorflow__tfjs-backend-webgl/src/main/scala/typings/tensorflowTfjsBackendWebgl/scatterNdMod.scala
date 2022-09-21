package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsScatterNdAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterNdMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ScatterNd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scatterNd(args: AttrsScatterNdAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("scatterNd")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ScatterNd", "scatterNdConfig")
  @js.native
  val scatterNdConfig: KernelConfig = js.native
}
