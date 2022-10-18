package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseSparseFillEmptyRowsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_fill_empty_rows_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSparseFillEmptyRowsIndicesDenseShapeMismatch(indicesLength: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSparseFillEmptyRowsIndicesDenseShapeMismatch")(indicesLength.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSparseFillEmptyRowsNegativeIndexErrorMessage(index: Double, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseFillEmptyRowsNegativeIndexErrorMessage")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSparseFillEmptyRowsOutOfRangeIndexErrorMessage(index: Double, value: Double, limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSparseFillEmptyRowsOutOfRangeIndexErrorMessage")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
}
