package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R0
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object string {
  
  @JSImport("@tensorflow/tfjs-core", "string")
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringNGrams(
    data: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    dataSplits: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def stringSplit(
    input: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    delimiter: String | Double | Boolean | js.typedarray.Uint8Array | Tensor[R0],
    skipEmpty: js.UndefOr[Boolean]
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def stringToHashBucketFast(input: String, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: js.Array[js.typedarray.Uint8Array], numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: js.typedarray.Float32Array, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: js.typedarray.Int32Array, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: js.typedarray.Uint8Array, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: Boolean, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: Double, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(
    input: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    numBuckets: Double
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
}
