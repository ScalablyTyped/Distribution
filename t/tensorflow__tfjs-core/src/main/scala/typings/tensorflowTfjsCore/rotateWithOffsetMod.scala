package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/image/rotate_with_offset", JSImport.Namespace)
@js.native
object rotateWithOffsetMod extends js.Object {
  
  val rotateWithOffset: js.Function4[
    /* image */ Tensor4D | TensorLike, 
    /* radians */ Double, 
    /* fillValue */ js.UndefOr[Double | (js.Tuple3[Double, Double, Double])], 
    /* center */ js.UndefOr[Double | (js.Tuple2[Double, Double])], 
    Tensor4D
  ] = js.native
}
