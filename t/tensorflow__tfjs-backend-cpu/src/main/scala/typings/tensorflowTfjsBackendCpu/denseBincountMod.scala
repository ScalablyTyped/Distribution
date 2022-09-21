package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsDenseBincountAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object denseBincountMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DenseBincount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def denseBincount(args: AttrsDenseBincountAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("denseBincount")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DenseBincount", "denseBincountConfig")
  @js.native
  val denseBincountConfig: KernelConfig = js.native
}
