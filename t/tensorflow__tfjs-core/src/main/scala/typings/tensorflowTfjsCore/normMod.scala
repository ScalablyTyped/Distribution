package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/norm", "norm")
  @js.native
  val norm: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
}
