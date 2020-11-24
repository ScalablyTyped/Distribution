package typings.tensorflowTfjsCore.distTensorMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringTensor[R /* <: Rank */] extends Tensor[R] {
  
  @JSName("dtype")
  var dtype_StringTensor: string = js.native
}
