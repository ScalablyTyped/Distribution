package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DataTable")
@js.native
class DataTable () extends js.Object {
  /** The column information, including the name, data type, and index. */
  def getColumns(): js.Array[Column] = js.native
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  def getData(): js.Array[_] = js.native
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  def getIsSummaryData(): scala.Boolean = js.native
  /** Either "Underlying Data Table" or "Summary Data Table". */
  def getName(): java.lang.String = js.native
  /** The number of rows in the returned data. */
  def getTotalRowCount(): scala.Double = js.native
}

