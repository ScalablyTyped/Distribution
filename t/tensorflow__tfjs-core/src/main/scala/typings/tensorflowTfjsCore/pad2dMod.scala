package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/pad2d", JSImport.Namespace)
@js.native
object pad2dMod extends js.Object {
  
  val pad2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
}
