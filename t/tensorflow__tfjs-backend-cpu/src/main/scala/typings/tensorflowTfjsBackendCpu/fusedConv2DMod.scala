package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFusedConv2DAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedConv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fusedConv2D(args: AttrsFusedConv2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fusedConv2D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedConv2D", "fusedConv2DConfig")
  @js.native
  val fusedConv2DConfig: KernelConfig = js.native
}
