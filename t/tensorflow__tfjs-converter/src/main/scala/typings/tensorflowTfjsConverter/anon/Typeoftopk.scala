package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftopk extends StObject {
  
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike): Indices[T] = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, k: Double): Indices[T] = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, k: Unit, sorted: Boolean): Indices[T] = js.native
}
