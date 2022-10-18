package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsBinaryInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMultiplyMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Multiply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiply(args: InputsBinaryInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Multiply", "multiplyConfig")
  @js.native
  val multiplyConfig: KernelConfig = js.native
}
