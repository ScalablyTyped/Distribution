package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template that represents a view subcomponent of an <ItemTemplate>.
  */
trait ViewTemplate extends js.Object {
  /**
  	 * View's ID (or set of IDs) used for data binding. This value must be unique.
  	 */
  var bindId: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Contains an array of subview templates to be added (in order) as children to this view.
  	 */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.undefined
  /**
  	 * Contains key-value pairs of view events and their listeners that are applied to this view component.
  	 */
  var events: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Contains key-value pairs of view properties and their values that are applied to this view component.
  	 */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * View's class name, for example, `Ti.UI.Button`.
  	 */
  var `type`: java.lang.String
}

