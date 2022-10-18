package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsImageNonMaxSuppressionPaddedAsyncMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/non_max_suppression_padded_async", "nonMaxSuppressionPaddedAsync")
  @js.native
  val nonMaxSuppressionPaddedAsync: js.Function6[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    /* padToMaxOutputSize */ js.UndefOr[Boolean], 
    js.Promise[NamedTensorMap]
  ] = js.native
}
