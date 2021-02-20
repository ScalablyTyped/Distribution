package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reverse2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reverse_2d", "reverse2d")
  @js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
}
