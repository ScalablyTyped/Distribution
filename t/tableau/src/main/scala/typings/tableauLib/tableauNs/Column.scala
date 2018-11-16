package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Column")
@js.native
class Column () extends js.Object {
  /** The data type of the column. Possible values are float, integer, string, boolean, date, and datetime. */
  def getDataType(): java.lang.String = js.native
  /** The name of the column. */
  def getFieldName(): java.lang.String = js.native
  /** The number of rows in the returned data. */
  def getIndex(): scala.Double = js.native
  /** Whether the column data is referenced in the visualization. */
  def getIsReferenced(): scala.Boolean = js.native
}

