package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_backprop", JSImport.Namespace)
@js.native
object maxPoolBackpropMod extends js.Object {
  
  val maxPoolBackprop: js.Function7[
    /* dy */ Tensor4D | TensorLike, 
    /* input */ Tensor4D | TensorLike, 
    /* output */ Tensor4D | TensorLike, 
    /* filterSize */ (js.Tuple2[Double, Double]) | Double, 
    /* strides */ (js.Tuple2[Double, Double]) | Double, 
    /* pad */ valid_ | same_ | Double, 
    /* dimRoundingMode */ js.UndefOr[floor | round | ceil], 
    Tensor4D
  ] = js.native
}
