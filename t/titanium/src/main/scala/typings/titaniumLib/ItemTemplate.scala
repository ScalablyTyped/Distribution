package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Template that represents the basic appearance of a list item.
 */

trait ItemTemplate extends js.Object {
  /**
  	 * Contains an array of subview templates to be added (in order) as children to this view.
  	 */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.undefined
  /**
  	 * Contains key-value pairs of view events and their listeners that are applied to the ListItem.
  	 */
  var events: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Contains key-value pairs of view properties and their values that are applied to the ListItem.
  	 */
  var properties: js.UndefOr[js.Any] = js.undefined
}

