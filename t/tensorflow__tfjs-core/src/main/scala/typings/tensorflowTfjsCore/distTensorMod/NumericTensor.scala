package typings.tensorflowTfjsCore.distTensorMod

import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericTensor[R /* <: Rank */] extends Tensor[R] {
  
  @JSName("dtype")
  var dtype_NumericTensor: NumericDataType = js.native
}
