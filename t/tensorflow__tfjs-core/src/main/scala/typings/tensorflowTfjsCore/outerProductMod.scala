package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outerProductMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/outer_product", "outerProduct")
  @js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
}
