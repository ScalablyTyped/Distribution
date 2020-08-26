package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a list row is clicked by the user.
  */
@js.native
trait ListViewItemclickEvent extends ListViewBaseEvent {
  /**
    * Returns `true` if the detail button is clicked else returns `false`.
    * Only returns `true` if the `accessoryType` property is set to
    * <Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL>.  All other accessories return `false` if
    * clicked.
    */
  var accessoryClicked: Boolean = js.native
  /**
    * The bind ID of the control that generated this event, if one exists.
    */
  var bindId: String = js.native
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String = js.native
  /**
    * Item index.
    */
  var itemIndex: Double = js.native
  /**
    * List section if the item is contained in a list section.
    */
  var section: ListSection = js.native
  /**
    * Section index.
    */
  var sectionIndex: Double = js.native
}

object ListViewItemclickEvent {
  @scala.inline
  def apply(
    accessoryClicked: Boolean,
    bindId: String,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView
  ): ListViewItemclickEvent = {
    val __obj = js.Dynamic.literal(accessoryClicked = accessoryClicked.asInstanceOf[js.Any], bindId = bindId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewItemclickEvent]
  }
  @scala.inline
  implicit class ListViewItemclickEventOps[Self <: ListViewItemclickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessoryClicked(value: Boolean): Self = this.set("accessoryClicked", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindId(value: String): Self = this.set("bindId", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection(value: ListSection): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
  }
  
}

