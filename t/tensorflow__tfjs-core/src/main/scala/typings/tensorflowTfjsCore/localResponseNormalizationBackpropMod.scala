package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/local_response_normalization_backprop", JSImport.Namespace)
@js.native
object localResponseNormalizationBackpropMod extends js.Object {
  @js.native
  object localResponseNormalizationBackprop extends js.Object {
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: js.UndefOr[scala.Nothing],
      bias: js.UndefOr[scala.Nothing],
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: js.UndefOr[scala.Nothing],
      bias: js.UndefOr[scala.Nothing],
      alpha: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: js.UndefOr[scala.Nothing],
      bias: js.UndefOr[scala.Nothing],
      alpha: Double,
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: js.UndefOr[scala.Nothing], bias: Double): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: js.UndefOr[scala.Nothing],
      bias: Double,
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: js.UndefOr[scala.Nothing],
      bias: Double,
      alpha: Double,
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: Double): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: Double,
      bias: js.UndefOr[scala.Nothing],
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: Double,
      bias: js.UndefOr[scala.Nothing],
      alpha: Double,
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: Double, bias: Double): T = js.native
    def apply[T /* <: Tensor4D */](
      x: T,
      y: T,
      dy: T,
      depthRadius: Double,
      bias: Double,
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: Double, bias: Double, alpha: Double): T = js.native
    def apply[T /* <: Tensor4D */](x: T, y: T, dy: T, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
  }
  
}

