package typings.tensorflowTfjsCore.baseMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linalg {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "linalg")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: String, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.Array[Uint8Array], numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Double, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Float32Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Int32Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Uint8Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2] | js.Array[Tensor[R1]]]
  @scala.inline
  def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2] | js.Array[Tensor[R1]]]
  
  @scala.inline
  def qr(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]]
  @scala.inline
  def qr(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], fullMatrices: Boolean): js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any], fullMatrices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]]
}
