package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R0
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstring extends StObject {
  
  def stringNGrams(
    data: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    dataSplits: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  
  def stringSplit(
    input: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    delimiter: String | Double | Boolean | js.typedarray.Uint8Array | typings.tensorflowTfjsCore.distTensorMod.Tensor[R0],
    skipEmpty: js.UndefOr[Boolean]
  ): NamedTensorMap = js.native
  
  def stringToHashBucketFast(input: String, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: js.Array[js.typedarray.Uint8Array], numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: js.typedarray.Float32Array, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: js.typedarray.Int32Array, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: js.typedarray.Uint8Array, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: Boolean, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: Double, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(
    input: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    numBuckets: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
