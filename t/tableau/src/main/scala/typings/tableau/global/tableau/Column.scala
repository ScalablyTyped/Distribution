package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Column")
@js.native
class Column ()
  extends typings.tableau.tableau.Column {
  /** The data type of the column. Possible values are float, integer, string, boolean, date, and datetime. */
  /* CompleteClass */
  override def getDataType(): String = js.native
  /** The name of the column. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  /** The number of rows in the returned data. */
  /* CompleteClass */
  override def getIndex(): Double = js.native
  /** Whether the column data is referenced in the visualization. */
  /* CompleteClass */
  override def getIsReferenced(): Boolean = js.native
}

