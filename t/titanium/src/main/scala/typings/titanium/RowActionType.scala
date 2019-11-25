package typings.titanium

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
  var color: js.UndefOr[String] = js.undefined
  /**
  	 * The [identifier](RowActionType. identifier) of the row action. Only included in the event
  	 * if previously defined. Available in Titanium 6.0.0 and later.
  	 */
  var identifier: js.UndefOr[String] = js.undefined
  /**
  	 * The style of the row action.
  	 */
  var style: Double
  /**
  	 * The title of the row action.
  	 */
  var title: String
}

object RowActionType {
  @scala.inline
  def apply(style: Double, title: String, color: String = null, identifier: String = null): RowActionType = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowActionType]
  }
}

