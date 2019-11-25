package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A value in a key-value pair. */
trait Value extends js.Object {
  /** The unique ID of the value in the table. */
  var cell_id: js.UndefOr[String] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The text content of the table cell without HTML markup. */
  var text: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(cell_id: String = null, location: Location = null, text: String = null): Value = {
    val __obj = js.Dynamic.literal()
    if (cell_id != null) __obj.updateDynamic("cell_id")(cell_id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

