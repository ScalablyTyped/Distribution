package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whereMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/where", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(condition.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(condition.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
}
