package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DataTable")
@js.native
class DataTable ()
  extends typings.tableau.tableau.DataTable {
  /** The column information, including the name, data type, and index. */
  /* CompleteClass */
  override def getColumns(): js.Array[typings.tableau.tableau.Column] = js.native
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  /* CompleteClass */
  override def getData(): js.Array[_] = js.native
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  /* CompleteClass */
  override def getIsSummaryData(): Boolean = js.native
  /** Either "Underlying Data Table" or "Summary Data Table". */
  /* CompleteClass */
  override def getName(): String = js.native
  /** The number of rows in the returned data. */
  /* CompleteClass */
  override def getTotalRowCount(): Double = js.native
}

