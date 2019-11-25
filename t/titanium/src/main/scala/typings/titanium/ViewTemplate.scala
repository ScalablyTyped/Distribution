package typings.titanium

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
  var bindId: js.UndefOr[String] = js.undefined
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
  var `type`: String
}

object ViewTemplate {
  @scala.inline
  def apply(
    `type`: String,
    bindId: String = null,
    childTemplates: js.Array[ViewTemplate] = null,
    events: js.Any = null,
    properties: js.Any = null
  ): ViewTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bindId != null) __obj.updateDynamic("bindId")(bindId.asInstanceOf[js.Any])
    if (childTemplates != null) __obj.updateDynamic("childTemplates")(childTemplates.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTemplate]
  }
}

