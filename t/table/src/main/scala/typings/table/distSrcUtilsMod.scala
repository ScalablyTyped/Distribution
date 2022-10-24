package typings.table

import typings.table.distSrcTypesApiMod.SpanningCellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("table/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areCellEqual(
    cell1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any,
    cell2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCellEqual")(cell1.asInstanceOf[js.Any], cell2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def calculateRangeCoordinate(spanningCellConfig: SpanningCellConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateRangeCoordinate")(spanningCellConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def extractTruncates(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseConfig */ Any
  ): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTruncates")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def findOriginalRowIndex(mappedRowHeights: js.Array[Double], mappedRowIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findOriginalRowIndex")(mappedRowHeights.asInstanceOf[js.Any], mappedRowIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def isCellInRange(
    cell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RangeCoordinate */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCellInRange")(cell.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sequence(start: Double, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def sumArray(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sumArray")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
}
