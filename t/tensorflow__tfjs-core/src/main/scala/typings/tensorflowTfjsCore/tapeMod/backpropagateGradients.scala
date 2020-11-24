package typings.tensorflowTfjsCore.tapeMod

import org.scalablytyped.runtime.NumberDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/tape", "backpropagateGradients")
@js.native
object backpropagateGradients extends js.Object {
  
  def apply(
    tensorAccumulatedGradientMap: NumberDictionary[Tensor[Rank]],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[/* f */ js.Function, Tensor[Rank]],
    add: js.Function2[/* a */ Tensor[Rank], /* b */ Tensor[Rank], Tensor[Rank]]
  ): Unit = js.native
}
