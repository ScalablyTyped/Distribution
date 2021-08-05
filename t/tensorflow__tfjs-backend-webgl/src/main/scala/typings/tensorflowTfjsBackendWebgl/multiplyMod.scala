package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsBinaryInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiplyMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Multiply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiply(args: InputsBinaryInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Multiply", "multiplyConfig")
  @js.native
  val multiplyConfig: KernelConfig = js.native
}
