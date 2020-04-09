package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/kernels/Div_impl", JSImport.Namespace)
@js.native
object kernelsDivImplMod extends js.Object {
  def divImpl(a: TensorInfo, b: TensorInfo, backend: MathBackendWebGL): TensorInfo = js.native
}

