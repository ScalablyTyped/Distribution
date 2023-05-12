package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstring extends StObject {
  
  def staticRegexReplace(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], pattern: String, rewrite: String): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def staticRegexReplace(
    input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    pattern: String,
    rewrite: String,
    replaceGlobal: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def staticRegexReplace(input: TensorLike, pattern: String, rewrite: String): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def staticRegexReplace(input: TensorLike, pattern: String, rewrite: String, replaceGlobal: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def stringNGrams(
    data: Tensor1D,
    dataSplits: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  def stringNGrams(
    data: Tensor1D,
    dataSplits: TensorLike,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  def stringNGrams(
    data: TensorLike,
    dataSplits: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  def stringNGrams(
    data: TensorLike,
    dataSplits: TensorLike,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  
  def stringSplit(input: Tensor1D, delimiter: Scalar): NamedTensorMap = js.native
  def stringSplit(input: Tensor1D, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = js.native
  def stringSplit(input: Tensor1D, delimiter: ScalarLike): NamedTensorMap = js.native
  def stringSplit(input: Tensor1D, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: Scalar): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: ScalarLike): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = js.native
  
  def stringToHashBucketFast(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: TensorLike, numBuckets: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
