package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsMirrorPadAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MirrorPad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MirrorPad", "mirrorPadConfig")
  @js.native
  val mirrorPadConfig: KernelConfig = js.native
  
  inline def mirrorPadKernelFunc(params: AttrsMirrorPadAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPadKernelFunc")(params.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
