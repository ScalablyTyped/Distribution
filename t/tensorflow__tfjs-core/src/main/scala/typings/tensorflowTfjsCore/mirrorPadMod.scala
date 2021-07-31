package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mirrorPad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mirrorPad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[T]
}
