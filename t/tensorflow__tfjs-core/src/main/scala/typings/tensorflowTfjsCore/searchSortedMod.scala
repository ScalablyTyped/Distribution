package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.left
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSortedMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/search_sorted", "searchSorted")
  @js.native
  val searchSorted: js.Function3[
    /* sortedSequence */ Tensor[Rank] | TensorLike, 
    /* values */ Tensor[Rank] | TensorLike, 
    /* side */ js.UndefOr[left | right], 
    Tensor[Rank]
  ] = js.native
}
