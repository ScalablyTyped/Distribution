package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbroadcastArgs extends StObject {
  
  def apply[R /* <: Rank */](
    s0: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    s1: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](s0: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], s1: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](s0: TensorLike, s1: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](s0: TensorLike, s1: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
}
