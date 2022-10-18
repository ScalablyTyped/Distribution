package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensor3dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor3d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensor3d(values: TensorLike3D): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  inline def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def tensor3d(values: TensorLike3D, shape: Unit, dtype: DataType): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
}
