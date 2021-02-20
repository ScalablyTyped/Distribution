package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util", "assertTypesMatch")
  @js.native
  def assertTypesMatch(a: Tensor[Rank], b: Tensor[Rank]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util", "getTensorsInContainer")
  @js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util", "isTensorInList")
  @js.native
  def isTensorInList(tensor: Tensor[Rank], tensorList: js.Array[Tensor[Rank]]): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util", "makeTypesMatch")
  @js.native
  def makeTypesMatch[T /* <: Tensor[Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}
