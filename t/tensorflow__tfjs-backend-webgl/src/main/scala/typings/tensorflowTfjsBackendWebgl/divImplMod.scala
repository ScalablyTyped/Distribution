package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Div_impl", JSImport.Namespace)
@js.native
object divImplMod extends js.Object {
  def divImpl(a: TensorInfo, b: TensorInfo, backend: MathBackendWebGL): TensorInfo = js.native
}

