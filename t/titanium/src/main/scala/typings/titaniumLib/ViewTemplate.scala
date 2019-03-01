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

object ViewTemplate {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    bindId: java.lang.String = null,
    childTemplates: js.Array[ViewTemplate] = null,
    events: js.Any = null,
    properties: js.Any = null
  ): ViewTemplate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (bindId != null) __obj.updateDynamic("bindId")(bindId)
    if (childTemplates != null) __obj.updateDynamic("childTemplates")(childTemplates)
    if (events != null) __obj.updateDynamic("events")(events)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ViewTemplate]
  }
}

