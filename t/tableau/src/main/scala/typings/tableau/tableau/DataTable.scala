package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTable extends js.Object {
  
  /** The column information, including the name, data type, and index. */
  def getColumns(): js.Array[Column] = js.native
  
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  def getData(): js.Array[_] = js.native
  
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  def getIsSummaryData(): Boolean = js.native
  
  /** Either "Underlying Data Table" or "Summary Data Table". */
  def getName(): String = js.native
  
  /** The number of rows in the returned data. */
  def getTotalRowCount(): Double = js.native
}
object DataTable {
  
  @scala.inline
  def apply(
    getColumns: () => js.Array[Column],
    getData: () => js.Array[_],
    getIsSummaryData: () => Boolean,
    getName: () => String,
    getTotalRowCount: () => Double
  ): DataTable = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getIsSummaryData = js.Any.fromFunction0(getIsSummaryData), getName = js.Any.fromFunction0(getName), getTotalRowCount = js.Any.fromFunction0(getTotalRowCount))
    __obj.asInstanceOf[DataTable]
  }
  
  @scala.inline
  implicit class DataTableOps[Self <: DataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetColumns(value: () => js.Array[Column]): Self = this.set("getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => js.Array[_]): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsSummaryData(value: () => Boolean): Self = this.set("getIsSummaryData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalRowCount(value: () => Double): Self = this.set("getTotalRowCount", js.Any.fromFunction0(value))
  }
}
