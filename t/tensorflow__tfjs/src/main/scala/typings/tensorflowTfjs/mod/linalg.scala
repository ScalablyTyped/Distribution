package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linalg {
  
  @JSImport("@tensorflow/tfjs", "linalg")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: String, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.Array[js.typedarray.Uint8Array], numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.typedarray.Float32Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.typedarray.Int32Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: js.typedarray.Uint8Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: Double, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bandPart[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2] | js.Array[Tensor[R1]]]
  inline def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2] | js.Array[Tensor[R1]]]
  
  inline def qr(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]]
  inline def qr(x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], fullMatrices: Boolean): js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any], fullMatrices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]]
}
