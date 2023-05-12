package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsClipByValueAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsClipByValueMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ClipByValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipByValue(args: AttrsClipByValueAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("clipByValue")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ClipByValue", "clipByValueConfig")
  @js.native
  val clipByValueConfig: KernelConfig = js.native
}
