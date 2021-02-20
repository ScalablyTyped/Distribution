package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preluMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/prelu", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/prelu", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/prelu", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: TensorLike, alpha: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/prelu", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
}
