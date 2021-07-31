package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsIdentityInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def identity(args: InputsIdentityInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Identity", "identityConfig")
  @js.native
  val identityConfig: KernelConfig = js.native
}
