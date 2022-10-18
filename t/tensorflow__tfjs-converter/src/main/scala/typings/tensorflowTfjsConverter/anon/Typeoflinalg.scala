package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflinalg extends StObject {
  
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: T | TensorLike, numLower: Double, numUpper: Double): T = js.native
  
  def gramSchmidt(xs: js.Array[Tensor1D]): Tensor2D | js.Array[Tensor1D] = js.native
  def gramSchmidt(xs: Tensor2D): Tensor2D | js.Array[Tensor1D] = js.native
  
  def qr(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Tuple2[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ] = js.native
  def qr(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], fullMatrices: Boolean): js.Tuple2[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ] = js.native
}
