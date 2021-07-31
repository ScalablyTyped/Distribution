package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setdiff1dAsyncMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/setdiff1d_async", "setdiff1dAsync")
  @js.native
  val setdiff1dAsync: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* y */ Tensor[Rank] | TensorLike, 
    js.Promise[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  ] = js.native
}
