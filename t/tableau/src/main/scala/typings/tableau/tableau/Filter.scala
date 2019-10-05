package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Filter")
@js.native
class Filter () extends js.Object {
  /** Gets the field that is currently being filtered. */
  def getFieldAsync(): js.Promise[Field] = js.native
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  def getFieldName(): String = js.native
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  def getFilterType(): FilterType = js.native
  /** Gets the parent worksheet */
  def getWorksheet(): Worksheet = js.native
}

