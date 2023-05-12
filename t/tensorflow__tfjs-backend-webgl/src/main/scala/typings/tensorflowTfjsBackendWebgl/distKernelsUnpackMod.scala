package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsUnpackAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsUnpackMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Unpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unpack(args: AttrsUnpackAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Unpack", "unpackConfig")
  @js.native
  val unpackConfig: KernelConfig = js.native
}
