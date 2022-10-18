package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.constant
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsImageTransformMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/transform", "transform")
  @js.native
  val transform: js.Function6[
    /* image */ Tensor4D | TensorLike, 
    /* transforms */ Tensor2D | TensorLike, 
    /* interpolation */ js.UndefOr[nearest | bilinear], 
    /* fillMode */ js.UndefOr[constant | reflect | wrap | nearest], 
    /* fillValue */ js.UndefOr[Double], 
    /* outputShape */ js.UndefOr[js.Tuple2[Double, Double]], 
    Tensor4D
  ] = js.native
}
