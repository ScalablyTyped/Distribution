package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtilEnvMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensor")
  @js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: T, argName: String, functionName: String): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensor")
  @js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: T, argName: String, functionName: String, parseAsDtype: DataType): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensor")
  @js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: TensorLike, argName: String, functionName: String): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensor")
  @js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: TensorLike, argName: String, functionName: String, parseAsDtype: DataType): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensorArray")
  @js.native
  def convertToTensorArray[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensorArray")
  @js.native
  def convertToTensorArray[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String, parseAsDtype: DataType): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensorArray")
  @js.native
  def convertToTensorArray_numeric[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String, parseAsDtype: numeric): js.Array[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensor")
  @js.native
  def convertToTensor_numeric[T /* <: Tensor[Rank] */](x: T, argName: String, functionName: String, parseAsDtype: numeric): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "convertToTensor")
  @js.native
  def convertToTensor_numeric[T /* <: Tensor[Rank] */](x: TensorLike, argName: String, functionName: String, parseAsDtype: numeric): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "inferShape")
  @js.native
  def inferShape(`val`: TensorLike): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", "inferShape")
  @js.native
  def inferShape(`val`: TensorLike, dtype: DataType): js.Array[Double] = js.native
}
