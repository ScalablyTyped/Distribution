package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofinTopKAsync extends StObject {
  
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, U /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U): js.Promise[U] = js.native
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, U /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U, k: Double): js.Promise[U] = js.native
}
