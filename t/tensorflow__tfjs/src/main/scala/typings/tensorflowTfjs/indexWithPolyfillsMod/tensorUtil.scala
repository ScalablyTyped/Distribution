package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtil {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "tensor_util.assertTypesMatch")
  @js.native
  def assertTypesMatch(
    a: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "tensor_util.getTensorsInContainer")
  @js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "tensor_util.isTensorInList")
  @js.native
  def isTensorInList(
    tensor: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    tensorList: js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  ): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "tensor_util.makeTypesMatch")
  @js.native
  def makeTypesMatch[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}
