package typings.tensorflowTfjsCore.baseMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R0
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparse {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "sparse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseFillEmptyRows(
    indices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    values: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    denseShape: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    defaultValue: String | Double | Boolean | js.typedarray.Uint8Array | Tensor[R0]
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def sparseReshape(
    inputIndices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    inputShape: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    newShape: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1]
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def sparseSegmentMean(
    data: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    segmentIds: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  inline def sparseSegmentSum(
    data: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    segmentIds: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
}
