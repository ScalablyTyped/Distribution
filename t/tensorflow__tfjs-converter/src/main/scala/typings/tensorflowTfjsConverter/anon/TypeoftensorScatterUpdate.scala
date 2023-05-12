package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftensorScatterUpdate extends StObject {
  
  def apply[R /* <: Rank */](
    tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    updates: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    updates: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    indices: TensorLike,
    updates: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    indices: TensorLike,
    updates: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    tensor: TensorLike,
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    updates: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    tensor: TensorLike,
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    updates: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    tensor: TensorLike,
    indices: TensorLike,
    updates: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](tensor: TensorLike, indices: TensorLike, updates: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
}
