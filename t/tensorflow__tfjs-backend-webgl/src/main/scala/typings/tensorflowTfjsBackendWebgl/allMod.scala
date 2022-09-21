package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Attrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/All", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(args: Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/All", "allConfig")
  @js.native
  val allConfig: KernelConfig = js.native
}
