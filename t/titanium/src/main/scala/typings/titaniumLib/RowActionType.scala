package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the custom edit action for a ListItem.
  */
trait RowActionType extends js.Object {
  /**
  	 * The background color of the row action.
  	 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The [identifier](RowActionType. identifier) of the row action. Only included in the event
  	 * if previously defined. Available in Titanium 6.0.0 and later.
  	 */
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The style of the row action.
  	 */
  var style: scala.Double
  /**
  	 * The title of the row action.
  	 */
  var title: java.lang.String
}

object RowActionType {
  @scala.inline
  def apply(
    style: scala.Double,
    title: java.lang.String,
    color: java.lang.String = null,
    identifier: java.lang.String = null
  ): RowActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("title")(title)
    if (color != null) __obj.updateDynamic("color")(color)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    __obj.asInstanceOf[RowActionType]
  }
}

