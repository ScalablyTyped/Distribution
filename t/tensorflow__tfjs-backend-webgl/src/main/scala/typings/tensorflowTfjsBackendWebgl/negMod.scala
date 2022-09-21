package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsNegInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object negMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Neg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def neg(args: InputsNegInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Neg", "negConfig")
  @js.native
  val negConfig: KernelConfig = js.native
}
