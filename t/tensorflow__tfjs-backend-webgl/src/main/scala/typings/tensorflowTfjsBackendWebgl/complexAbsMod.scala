package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsComplexAbsInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexAbsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ComplexAbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def complexAbs(args: InputsComplexAbsInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("complexAbs")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ComplexAbs", "complexAbsConfig")
  @js.native
  val complexAbsConfig: KernelConfig = js.native
}
