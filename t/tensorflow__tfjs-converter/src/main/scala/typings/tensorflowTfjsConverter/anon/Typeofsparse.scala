package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R0
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofsparse extends StObject {
  
  def sparseFillEmptyRows(
    indices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    values: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    denseShape: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    defaultValue: String | Double | Boolean | js.typedarray.Uint8Array | typings.tensorflowTfjsCore.distTensorMod.Tensor[R0]
  ): NamedTensorMap
  
  def sparseReshape(
    inputIndices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    inputShape: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    newShape: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]
  ): NamedTensorMap
  
  def sparseSegmentMean(
    data: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    segmentIds: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  
  def sparseSegmentSum(
    data: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    segmentIds: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
}
object Typeofsparse {
  
  inline def apply(
    sparseFillEmptyRows: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Uint8Array | typings.tensorflowTfjsCore.distTensorMod.Tensor[R0]) => NamedTensorMap,
    sparseReshape: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]) => NamedTensorMap,
    sparseSegmentMean: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]) => typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    sparseSegmentSum: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]) => typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): Typeofsparse = {
    val __obj = js.Dynamic.literal(sparseFillEmptyRows = js.Any.fromFunction4(sparseFillEmptyRows), sparseReshape = js.Any.fromFunction3(sparseReshape), sparseSegmentMean = js.Any.fromFunction3(sparseSegmentMean), sparseSegmentSum = js.Any.fromFunction3(sparseSegmentSum))
    __obj.asInstanceOf[Typeofsparse]
  }
  
  extension [Self <: Typeofsparse](x: Self) {
    
    inline def setSparseFillEmptyRows(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Uint8Array | typings.tensorflowTfjsCore.distTensorMod.Tensor[R0]) => NamedTensorMap
    ): Self = StObject.set(x, "sparseFillEmptyRows", js.Any.fromFunction4(value))
    
    inline def setSparseReshape(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]) => NamedTensorMap
    ): Self = StObject.set(x, "sparseReshape", js.Any.fromFunction3(value))
    
    inline def setSparseSegmentMean(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]) => typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ): Self = StObject.set(x, "sparseSegmentMean", js.Any.fromFunction3(value))
    
    inline def setSparseSegmentSum(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1], String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]) => typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ): Self = StObject.set(x, "sparseSegmentSum", js.Any.fromFunction3(value))
  }
}
