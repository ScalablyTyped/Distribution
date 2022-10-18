package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsparse extends StObject {
  
  def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = js.native
  def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = js.native
  
  def sparseReshape(inputIndices: Tensor2D, inputShape: Tensor1D, newShape: Tensor1D): NamedTensorMap = js.native
  def sparseReshape(inputIndices: Tensor2D, inputShape: Tensor1D, newShape: TensorLike): NamedTensorMap = js.native
  def sparseReshape(inputIndices: Tensor2D, inputShape: TensorLike, newShape: Tensor1D): NamedTensorMap = js.native
  def sparseReshape(inputIndices: Tensor2D, inputShape: TensorLike, newShape: TensorLike): NamedTensorMap = js.native
  def sparseReshape(inputIndices: TensorLike, inputShape: Tensor1D, newShape: Tensor1D): NamedTensorMap = js.native
  def sparseReshape(inputIndices: TensorLike, inputShape: Tensor1D, newShape: TensorLike): NamedTensorMap = js.native
  def sparseReshape(inputIndices: TensorLike, inputShape: TensorLike, newShape: Tensor1D): NamedTensorMap = js.native
  def sparseReshape(inputIndices: TensorLike, inputShape: TensorLike, newShape: TensorLike): NamedTensorMap = js.native
  
  def sparseSegmentMean(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: Tensor1D,
    segmentIds: Tensor1D
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: Tensor1D,
    segmentIds: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: TensorLike,
    segmentIds: Tensor1D
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: TensorLike,
    segmentIds: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(data: TensorLike, indices: Tensor1D, segmentIds: Tensor1D): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(data: TensorLike, indices: Tensor1D, segmentIds: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(data: TensorLike, indices: TensorLike, segmentIds: Tensor1D): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentMean(data: TensorLike, indices: TensorLike, segmentIds: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def sparseSegmentSum(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: Tensor1D,
    segmentIds: Tensor1D
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: Tensor1D,
    segmentIds: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: TensorLike,
    segmentIds: Tensor1D
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(
    data: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: TensorLike,
    segmentIds: TensorLike
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(data: TensorLike, indices: Tensor1D, segmentIds: Tensor1D): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(data: TensorLike, indices: Tensor1D, segmentIds: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(data: TensorLike, indices: TensorLike, segmentIds: Tensor1D): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def sparseSegmentSum(data: TensorLike, indices: TensorLike, segmentIds: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
