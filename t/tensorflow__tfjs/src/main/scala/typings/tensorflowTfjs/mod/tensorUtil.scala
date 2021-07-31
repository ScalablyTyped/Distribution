package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtil {
  
  @JSImport("@tensorflow/tfjs", "tensor_util")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assertTypesMatch(
    a: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypesMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTensorsInContainer")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]]
  
  @scala.inline
  def isTensorInList(
    tensor: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    tensorList: js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTensorInList")(tensor.asInstanceOf[js.Any], tensorList.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def makeTypesMatch[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTypesMatch")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
}
