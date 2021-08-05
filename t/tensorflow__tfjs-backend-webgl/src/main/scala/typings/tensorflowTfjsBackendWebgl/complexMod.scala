package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.BackendInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Complex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def complex(args: BackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("complex")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Complex", "complexConfig")
  @js.native
  val complexConfig: KernelConfig = js.native
}
