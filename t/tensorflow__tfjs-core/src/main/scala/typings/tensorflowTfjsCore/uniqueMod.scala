package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Values
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: T): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: T, axis: Double): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: TensorLike): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): Values[T] = js.native
}
