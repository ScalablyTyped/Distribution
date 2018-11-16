package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents displayed item data.
 */

trait ListDataItem extends js.Object {
  /**
  	 * Contains key-value pairs of view properties and their values that are applied to the
  	 * `ListItem`.
  	 */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Template ID configured with the <Titanium.UI.ListView.templates> property or
  	 * <Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT>.
  	 */
  var template: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

