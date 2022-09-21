package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsCropAndResizeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropAndResizeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/CropAndResize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cropAndResize(args: AttrsCropAndResizeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/CropAndResize", "cropAndResizeConfig")
  @js.native
  val cropAndResizeConfig: KernelConfig = js.native
}
