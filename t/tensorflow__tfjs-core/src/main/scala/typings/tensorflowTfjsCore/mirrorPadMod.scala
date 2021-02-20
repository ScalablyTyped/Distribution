package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
}
