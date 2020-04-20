package typings.titanium

import org.scalablytyped.runtime.StringDictionary
import typings.titanium.Titanium.UI.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents displayed item data.
  */
trait ListDataItem
  extends /* index */ StringDictionary[js.Any] {
  /**
  	 * Contains key-value pairs of view properties and their values that are applied to the
  	 * `ListItem`.
  	 */
  var properties: js.UndefOr[Dictionary[ListItem]] = js.undefined
  /**
  	 * Template ID configured with the <Titanium.UI.ListView.templates> property or
  	 * <Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT>.
  	 */
  var template: js.UndefOr[java.lang.String | Double] = js.undefined
}

object ListDataItem {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    properties: Dictionary[ListItem] = null,
    template: java.lang.String | Double = null
  ): ListDataItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataItem]
  }
}

