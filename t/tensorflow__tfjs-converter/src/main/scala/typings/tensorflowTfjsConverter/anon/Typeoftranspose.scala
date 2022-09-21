package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftranspose extends StObject {
  
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike): T = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double]): T = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double], conjugate: Boolean): T = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, perm: Unit, conjugate: Boolean): T = js.native
}
