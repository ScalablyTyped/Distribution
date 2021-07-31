package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Mean
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/moments", "moments")
  @js.native
  val moments: js.Function3[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Mean
  ] = js.native
}
