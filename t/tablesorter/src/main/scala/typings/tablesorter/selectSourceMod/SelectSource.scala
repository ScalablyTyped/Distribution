package typings.tablesorter.selectSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSource extends js.Object {
  /**
    * Classes to add to the dropdown-entries.
    */
  var `data-class`: js.UndefOr[String] = js.undefined
  /**
    * The display-name of the filter source.
    */
  var text: String
  /**
    * The filter-value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SelectSource {
  @scala.inline
  def apply(text: String, `data-class`: String = null, value: String = null): SelectSource = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (`data-class` != null) __obj.updateDynamic("data-class")(`data-class`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectSource]
  }
}

