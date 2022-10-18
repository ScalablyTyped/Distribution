package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.WebGLData
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.numeric
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string_or_numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorUtilEnvMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToTensor[T /* <: Tensor[Rank] */](x: T | TensorLike, argName: String, functionName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToTensor")(x.asInstanceOf[js.Any], argName.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def convertToTensor[T /* <: Tensor[Rank] */](
    x: T | TensorLike,
    argName: String,
    functionName: String,
    parseAsDtype: numeric | string_or_numeric
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToTensor")(x.asInstanceOf[js.Any], argName.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], parseAsDtype.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def convertToTensor[T /* <: Tensor[Rank] */](x: T | TensorLike, argName: String, functionName: String, parseAsDtype: DataType): T = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToTensor")(x.asInstanceOf[js.Any], argName.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], parseAsDtype.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def convertToTensorArray[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToTensorArray")(arg.asInstanceOf[js.Any], argName.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToTensorArray[T /* <: Tensor[Rank] */](
    arg: js.Array[T | TensorLike],
    argName: String,
    functionName: String,
    parseAsDtype: numeric | string_or_numeric
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToTensorArray")(arg.asInstanceOf[js.Any], argName.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], parseAsDtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToTensorArray[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String, parseAsDtype: DataType): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToTensorArray")(arg.asInstanceOf[js.Any], argName.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], parseAsDtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def inferShape(`val`: TensorLike): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferShape")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def inferShape(`val`: TensorLike, dtype: DataType): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferShape")(`val`.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def inferShape(`val`: WebGLData): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferShape")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def inferShape(`val`: WebGLData, dtype: DataType): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferShape")(`val`.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
