package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensor2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensor2d(values: TensorLike2D): Tensor2D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor2D]
  inline def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  inline def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  inline def tensor2d(values: TensorLike2D, shape: Unit, dtype: DataType): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
}
