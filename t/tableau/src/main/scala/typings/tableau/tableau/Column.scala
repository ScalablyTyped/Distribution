package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** The data type of the column. Possible values are float, integer, string, boolean, date, and datetime. */
  def getDataType(): String
  /** The name of the column. */
  def getFieldName(): String
  /** The number of rows in the returned data. */
  def getIndex(): Double
  /** Whether the column data is referenced in the visualization. */
  def getIsReferenced(): Boolean
}

object Column {
  @scala.inline
  def apply(
    getDataType: () => String,
    getFieldName: () => String,
    getIndex: () => Double,
    getIsReferenced: () => Boolean
  ): Column = {
    val __obj = js.Dynamic.literal(getDataType = js.Any.fromFunction0(getDataType), getFieldName = js.Any.fromFunction0(getFieldName), getIndex = js.Any.fromFunction0(getIndex), getIsReferenced = js.Any.fromFunction0(getIsReferenced))
    __obj.asInstanceOf[Column]
  }
}

