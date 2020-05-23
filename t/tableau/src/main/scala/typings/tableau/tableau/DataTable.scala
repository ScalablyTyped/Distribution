package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTable extends js.Object {
  /** The column information, including the name, data type, and index. */
  def getColumns(): js.Array[Column]
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  def getData(): js.Array[_]
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  def getIsSummaryData(): Boolean
  /** Either "Underlying Data Table" or "Summary Data Table". */
  def getName(): String
  /** The number of rows in the returned data. */
  def getTotalRowCount(): Double
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
}

