package typings.tensorflowTfjsCore.opsMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "linalg")
@js.native
object linalg extends js.Object {
  
  def bandPart[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: String, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: js.Array[Uint8Array], numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Double, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Float32Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Int32Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](a: Uint8Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: Tensor[Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = js.native
  
  def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  
  def qr(x: Tensor[Rank]): js.Tuple2[Tensor[Rank], Tensor[Rank]] = js.native
  def qr(x: Tensor[Rank], fullMatrices: Boolean): js.Tuple2[Tensor[Rank], Tensor[Rank]] = js.native
}
