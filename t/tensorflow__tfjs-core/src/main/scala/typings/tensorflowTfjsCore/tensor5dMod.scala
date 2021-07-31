package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike5D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor5dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor5d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tensor5d(values: TensorLike5D): Tensor5D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor5D]
  @scala.inline
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  @scala.inline
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  @scala.inline
  def tensor5d(values: TensorLike5D, shape: Unit, dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
}
