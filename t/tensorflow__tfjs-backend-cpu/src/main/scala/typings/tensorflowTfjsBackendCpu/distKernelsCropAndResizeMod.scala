package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsCropAndResizeAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCropAndResizeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/CropAndResize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cropAndResize(args: AttrsCropAndResizeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/CropAndResize", "cropAndResizeConfig")
  @js.native
  val cropAndResizeConfig: KernelConfig = js.native
}
