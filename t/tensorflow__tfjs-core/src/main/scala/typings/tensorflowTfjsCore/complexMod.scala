package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/complex", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/complex", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: T, imag: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/complex", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: TensorLike, imag: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/complex", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: TensorLike, imag: TensorLike): T = js.native
}
