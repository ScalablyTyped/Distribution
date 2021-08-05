package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTable extends StObject {
  
  /** The column information, including the name, data type, and index. */
  def getColumns(): js.Array[Column]
  
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  def getData(): js.Array[js.Any]
  
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  def getIsSummaryData(): Boolean
  
  /** Either "Underlying Data Table" or "Summary Data Table". */
  def getName(): String
  
  /** The number of rows in the returned data. */
  def getTotalRowCount(): Double
}
object DataTable {
  
  inline def apply(
    getColumns: () => js.Array[Column],
    getData: () => js.Array[js.Any],
    getIsSummaryData: () => Boolean,
    getName: () => String,
    getTotalRowCount: () => Double
  ): DataTable = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getIsSummaryData = js.Any.fromFunction0(getIsSummaryData), getName = js.Any.fromFunction0(getName), getTotalRowCount = js.Any.fromFunction0(getTotalRowCount))
    __obj.asInstanceOf[DataTable]
  }
  
  extension [Self <: DataTable](x: Self) {
    
    inline def setGetColumns(value: () => js.Array[Column]): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => js.Array[js.Any]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetIsSummaryData(value: () => Boolean): Self = StObject.set(x, "getIsSummaryData", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetTotalRowCount(value: () => Double): Self = StObject.set(x, "getTotalRowCount", js.Any.fromFunction0(value))
  }
}
