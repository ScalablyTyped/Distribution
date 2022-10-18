package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Indexing
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsMeshgridMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/meshgrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def meshgrid[T /* <: Tensor[Rank] */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")().asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike, y: T | TensorLike): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike, y: T | TensorLike, hasIndexing: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], hasIndexing.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike, y: Unit, hasIndexing: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], hasIndexing.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: Unit, y: T | TensorLike): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: Unit, y: T | TensorLike, hasIndexing: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], hasIndexing.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: Unit, y: Unit, hasIndexing: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], hasIndexing.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
