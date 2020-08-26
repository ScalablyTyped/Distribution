package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reshape", JSImport.Namespace)
@js.native
object reshapeMod extends js.Object {
  def reshape(x: TensorInfo, afterShape: js.Array[Double], backend: MathBackendWebGL): TensorInfo = js.native
}

