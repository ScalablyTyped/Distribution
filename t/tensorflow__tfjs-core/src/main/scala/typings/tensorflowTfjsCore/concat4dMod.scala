package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concat4dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat_4d", "concat4d")
  @js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
}
