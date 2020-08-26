package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Max_impl", JSImport.Namespace)
@js.native
object maxImplMod extends js.Object {
  def maxImpl(
    x: TensorInfo,
    reduceShape: js.Array[Double],
    outShape: js.Array[Double],
    backend: MathBackendWebGL
  ): TensorInfo = js.native
}

