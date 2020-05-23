package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** Gets the field that is currently being filtered. */
  def getFieldAsync(): js.Promise[Field]
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  def getFieldName(): String
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  def getFilterType(): FilterType
  /** Gets the parent worksheet */
  def getWorksheet(): Worksheet
}

object Filter {
  @scala.inline
  def apply(
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getWorksheet: () => Worksheet
  ): Filter = {
    val __obj = js.Dynamic.literal(getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[Filter]
  }
}

