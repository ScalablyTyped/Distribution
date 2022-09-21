package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdenseBincount extends StObject {
  
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double,
    binaryOutput: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2], weights: TensorLike, size: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: TensorLike,
    size: Double,
    binaryOutput: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(x: TensorLike, weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2], size: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double,
    binaryOutput: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply[T /* <: Tensor1D | Tensor2D */](x: TensorLike, weights: TensorLike, size: Double): T = js.native
  def apply[T /* <: Tensor1D | Tensor2D */](x: TensorLike, weights: TensorLike, size: Double, binaryOutput: Boolean): T = js.native
}
