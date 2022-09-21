package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseSegmentReductionUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_segment_reduction_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSparseSegmentReductionIndicesOutOfRangeErrorMessage(index: Double, indexValue: Double, inputRows: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseSegmentReductionIndicesOutOfRangeErrorMessage")(index.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any], inputRows.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSparseSegmentReductionNegativeSegmentIdsErrorMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSparseSegmentReductionNegativeSegmentIdsErrorMessage")().asInstanceOf[String]
  
  inline def getSparseSegmentReductionNonIncreasingSegmentIdsErrorMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSparseSegmentReductionNonIncreasingSegmentIdsErrorMessage")().asInstanceOf[String]
  
  inline def getSparseSegmentReductionSegmentIdOutOfRangeErrorMessage(segmentId: Double, outputRows: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseSegmentReductionSegmentIdOutOfRangeErrorMessage")(segmentId.asInstanceOf[js.Any], outputRows.asInstanceOf[js.Any])).asInstanceOf[String]
}
