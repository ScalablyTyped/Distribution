package typings.titanium

import typings.titanium.Titanium.UI.ListItem
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
  var properties: js.UndefOr[Dictionary[ListItem]] = js.undefined
}

object ItemTemplate {
  @scala.inline
  def apply(
    childTemplates: js.Array[ViewTemplate] = null,
    events: js.Any = null,
    properties: Dictionary[ListItem] = null
  ): ItemTemplate = {
    val __obj = js.Dynamic.literal()
    if (childTemplates != null) __obj.updateDynamic("childTemplates")(childTemplates.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTemplate]
  }
}

