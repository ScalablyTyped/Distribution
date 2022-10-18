package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseSparseSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_segment_sum", "sparseSegmentSum")
  @js.native
  val sparseSegmentSum: js.Function3[
    /* data */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor1D | TensorLike, 
    /* segmentIds */ Tensor1D | TensorLike, 
    Tensor[Rank]
  ] = js.native
}
