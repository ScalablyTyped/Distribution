package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsComplexAbsInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsComplexAbsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ComplexAbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def complexAbs(args: InputsComplexAbsInputs): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("complexAbs")(args.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ComplexAbs", "complexAbsConfig")
  @js.native
  val complexAbsConfig: KernelConfig = js.native
}
