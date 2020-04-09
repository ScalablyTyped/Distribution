package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/kernels/Transpose_impl", JSImport.Namespace)
@js.native
object kernelsTransposeImplMod extends js.Object {
  def transposeImpl(x: TensorInfo, perm: js.Array[Double], backend: MathBackendWebGL): TensorInfo = js.native
}

