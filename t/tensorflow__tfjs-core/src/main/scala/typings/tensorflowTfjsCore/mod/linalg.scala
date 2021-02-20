package typings.tensorflowTfjsCore.mod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linalg {
  
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: String, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.Array[Uint8Array], numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Double, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Float32Array, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Int32Array, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Uint8Array, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.bandPart")
  @js.native
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core", "linalg.gramSchmidt")
  @js.native
  def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.gramSchmidt")
  @js.native
  def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
  
  @JSImport("@tensorflow/tfjs-core", "linalg.qr")
  @js.native
  def qr(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  @JSImport("@tensorflow/tfjs-core", "linalg.qr")
  @js.native
  def qr(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], fullMatrices: Boolean): js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}
