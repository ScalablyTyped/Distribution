package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflinalg extends StObject {
  
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: String, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: js.Array[js.typedarray.Uint8Array], numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: js.typedarray.Float32Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: js.typedarray.Int32Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: js.typedarray.Uint8Array, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: Double, numLower: Double, numUpper: Double): T = js.native
  def bandPart[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    a: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    numLower: Double,
    numUpper: Double
  ): T = js.native
  
  def gramSchmidt(xs: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R2] | js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]] = js.native
  def gramSchmidt(xs: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R2] | js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]] = js.native
  
  def qr(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Tuple2[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ] = js.native
  def qr(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], fullMatrices: Boolean): js.Tuple2[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ] = js.native
}
