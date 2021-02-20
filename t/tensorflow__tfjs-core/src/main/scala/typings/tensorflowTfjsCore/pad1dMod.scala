package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pad1dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/pad1d", "pad1d")
  @js.native
  val pad1d: js.Function3[
    /* x */ Tensor1D | TensorLike, 
    /* paddings */ js.Tuple2[Double, Double], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
}
