package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Transpose_impl", JSImport.Namespace)
@js.native
object transposeImplMod extends js.Object {
  def transposeImpl(x: TensorInfo, perm: js.Array[Double], backend: MathBackendWebGL): TensorInfo = js.native
}

