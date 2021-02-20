package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateWithOffsetMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/rotate_with_offset", "rotateWithOffset")
  @js.native
  val rotateWithOffset: js.Function4[
    /* image */ Tensor4D | TensorLike, 
    /* radians */ Double, 
    /* fillValue */ js.UndefOr[Double | (js.Tuple3[Double, Double, Double])], 
    /* center */ js.UndefOr[Double | (js.Tuple2[Double, Double])], 
    Tensor4D
  ] = js.native
}
