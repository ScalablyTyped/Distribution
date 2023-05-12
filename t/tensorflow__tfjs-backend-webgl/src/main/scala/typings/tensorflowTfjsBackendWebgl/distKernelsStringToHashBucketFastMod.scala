package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsStringToHashBucketFastAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStringToHashBucketFastMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StringToHashBucketFast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringToHashBucketFast(args: AttrsStringToHashBucketFastAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StringToHashBucketFast", "stringToHashBucketFastConfig")
  @js.native
  val stringToHashBucketFastConfig: KernelConfig = js.native
}
