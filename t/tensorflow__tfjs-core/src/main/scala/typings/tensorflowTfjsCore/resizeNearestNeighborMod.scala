package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeNearestNeighborMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/resize_nearest_neighbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](images: T | TensorLike, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](images: T | TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](
    images: T | TensorLike,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](
    images: T | TensorLike,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T]
}
