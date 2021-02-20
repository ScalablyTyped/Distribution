package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeBilinearMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/resize_bilinear", "resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/resize_bilinear", "resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/resize_bilinear", "resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/resize_bilinear", "resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
}
