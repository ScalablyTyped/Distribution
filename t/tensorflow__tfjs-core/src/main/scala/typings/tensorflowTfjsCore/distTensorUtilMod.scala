package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertTypesMatch(a: Tensor[Rank], b: Tensor[Rank]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypesMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTensorsInContainer")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tensor[Rank]]]
  
  inline def isTensorInList(tensor: Tensor[Rank], tensorList: js.Array[Tensor[Rank]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTensorInList")(tensor.asInstanceOf[js.Any], tensorList.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeTypesMatch[T /* <: Tensor[Rank] */](a: T, b: T): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTypesMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
}
