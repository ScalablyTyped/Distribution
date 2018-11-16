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

