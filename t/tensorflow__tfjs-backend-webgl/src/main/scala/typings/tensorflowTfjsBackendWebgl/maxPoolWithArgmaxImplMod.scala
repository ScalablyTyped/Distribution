package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolWithArgmax_impl", JSImport.Namespace)
@js.native
object maxPoolWithArgmaxImplMod extends js.Object {
  def maxPoolWithArgmaxImpl(x: TensorInfo, includeBatchInIndex: Boolean, convInfo: Conv2DInfo, backend: MathBackendWebGL): js.Array[TensorInfo] = js.native
}

