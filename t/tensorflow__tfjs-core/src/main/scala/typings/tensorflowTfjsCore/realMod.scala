package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/real", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def real[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("real")(input.asInstanceOf[js.Any]).asInstanceOf[T]
}
