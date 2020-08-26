package typings.titanium

import org.scalablytyped.runtime.StringDictionary
import typings.titanium.Titanium.UI.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents displayed item data.
  */
@js.native
trait ListDataItem
  extends /* index */ StringDictionary[js.Any] {
  /**
    * Contains key-value pairs of view properties and their values that are applied to the
    * `ListItem`.
    */
  var properties: js.UndefOr[Dictionary[ListItem]] = js.native
  /**
    * Template ID configured with the <Titanium.UI.ListView.templates> property or
    * <Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT>.
    */
  var template: js.UndefOr[java.lang.String | Double] = js.native
}

object ListDataItem {
  @scala.inline
  def apply(): ListDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataItem]
  }
  @scala.inline
  implicit class ListDataItemOps[Self <: ListDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProperties(value: Dictionary[ListItem]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setTemplate(value: java.lang.String | Double): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

