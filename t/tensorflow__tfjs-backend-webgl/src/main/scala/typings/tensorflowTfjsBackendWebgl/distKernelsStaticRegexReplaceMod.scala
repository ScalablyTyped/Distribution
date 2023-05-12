package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsStaticRegexReplaceAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStaticRegexReplaceMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StaticRegexReplace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def staticRegexReplace(args: AttrsStaticRegexReplaceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("staticRegexReplace")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StaticRegexReplace", "staticRegexReplaceConfig")
  @js.native
  val staticRegexReplaceConfig: KernelConfig = js.native
}
