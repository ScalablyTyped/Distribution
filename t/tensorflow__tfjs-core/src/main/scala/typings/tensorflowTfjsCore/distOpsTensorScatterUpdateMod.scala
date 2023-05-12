package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensorScatterUpdateMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor_scatter_update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: Tensor[Rank], updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: Tensor[Rank], updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: TensorLike, updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: TensorLike, updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: Tensor[Rank], updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: Tensor[Rank], updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: TensorLike, updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: TensorLike, updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
