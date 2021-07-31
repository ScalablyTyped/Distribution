package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/imag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def imag[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("imag")(input.asInstanceOf[js.Any]).asInstanceOf[T]
}
