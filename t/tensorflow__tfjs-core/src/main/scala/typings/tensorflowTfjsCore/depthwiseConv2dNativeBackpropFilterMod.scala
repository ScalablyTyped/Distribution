package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/depthwise_conv2d_native_backprop_filter", JSImport.Namespace)
@js.native
object depthwiseConv2dNativeBackpropFilterMod extends js.Object {
  @js.native
  object depthwiseConv2dNativeBackpropFilter extends js.Object {
    def apply(
      x: Tensor[R3 | R4],
      dy: Tensor[R3 | R4],
      filterShape: js.Tuple4[Double, Double, Double, Double],
      convInfo: Conv2DInfo
    ): Tensor4D = js.native
  }
  
}

