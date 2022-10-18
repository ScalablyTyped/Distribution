package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object string {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "string")
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringNGrams(
    data: Tensor1D,
    dataSplits: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringNGrams(
    data: Tensor1D,
    dataSplits: TensorLike,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringNGrams(
    data: TensorLike,
    dataSplits: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringNGrams(
    data: TensorLike,
    dataSplits: TensorLike,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def stringSplit(input: Tensor1D, delimiter: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: Tensor1D, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: Tensor1D, delimiter: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: Tensor1D, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: TensorLike, delimiter: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: TensorLike, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: TensorLike, delimiter: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def stringSplit(input: TensorLike, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def stringToHashBucketFast(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stringToHashBucketFast(input: TensorLike, numBuckets: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
}
