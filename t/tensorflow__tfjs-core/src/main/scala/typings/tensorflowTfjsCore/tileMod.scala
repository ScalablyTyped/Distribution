package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tile", "tile")
  @js.native
  def tile[T /* <: Tensor[Rank] */](x: T, reps: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tile", "tile")
  @js.native
  def tile[T /* <: Tensor[Rank] */](x: TensorLike, reps: js.Array[Double]): T = js.native
}
