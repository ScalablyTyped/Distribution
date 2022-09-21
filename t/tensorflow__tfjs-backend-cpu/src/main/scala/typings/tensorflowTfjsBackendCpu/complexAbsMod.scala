package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Backend
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexAbsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ComplexAbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def complexAbs(args: Backend): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("complexAbs")(args.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ComplexAbs", "complexAbsConfig")
  @js.native
  val complexAbsConfig: KernelConfig = js.native
}
