package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsStepAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def step(hasInputsAttrsBackend: AttrsStepAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(hasInputsAttrsBackend.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Step", "stepConfig")
  @js.native
  val stepConfig: KernelConfig = js.native
}
