package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.WebGLData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensorOpsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor_ops_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeTensor(values: TensorLike, shape: js.Array[Double], inferredShape: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], inferredShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def makeTensor(values: TensorLike, shape: js.Array[Double], inferredShape: js.Array[Double], dtype: DataType): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], inferredShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def makeTensor(values: WebGLData, shape: js.Array[Double], inferredShape: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], inferredShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def makeTensor(values: WebGLData, shape: js.Array[Double], inferredShape: js.Array[Double], dtype: DataType): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], inferredShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}
