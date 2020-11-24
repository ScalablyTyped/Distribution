package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsMirrorPadAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MirrorPad", JSImport.Namespace)
@js.native
object mirrorPadMod extends js.Object {
  
  val mirrorPadConfig: KernelConfig = js.native
  
  def mirrorPadKernelFunc(params: AttrsMirrorPadAttrs): TensorInfo = js.native
}
