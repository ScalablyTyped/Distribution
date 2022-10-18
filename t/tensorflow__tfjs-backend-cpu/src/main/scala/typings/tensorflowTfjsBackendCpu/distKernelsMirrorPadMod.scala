package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMirrorPadAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mirrorPad(args: AttrsMirrorPadAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", "mirrorPadConfig")
  @js.native
  val mirrorPadConfig: KernelConfig = js.native
}
