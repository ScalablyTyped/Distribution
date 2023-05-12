package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsMaxAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def max(args: AttrsMaxAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Max", "maxConfig")
  @js.native
  val maxConfig: KernelConfig = js.native
}
