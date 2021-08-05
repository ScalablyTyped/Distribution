package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor4dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor4d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensor4d(values: TensorLike4D): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
  inline def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def tensor4d(values: TensorLike4D, shape: Unit, dtype: DataType): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}
