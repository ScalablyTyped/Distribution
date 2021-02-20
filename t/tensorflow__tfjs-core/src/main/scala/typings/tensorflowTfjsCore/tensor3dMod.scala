package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor3dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor3d", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor3d", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor3d", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor3d", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
}
