package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryOpsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/binary_ops", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def divStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def maximumStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def minimumStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def modStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("modStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mulStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mulStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def powStrict[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("powStrict")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifferenceStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def subStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("subStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
}
