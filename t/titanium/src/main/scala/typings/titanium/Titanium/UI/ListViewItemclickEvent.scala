package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a list row is clicked by the user.
  */
trait ListViewItemclickEvent extends ListViewBaseEvent {
  /**
    * Returns `true` if the detail button is clicked else returns `false`.
    * Only returns `true` if the `accessoryType` property is set to
    * <Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL>.  All other accessories return `false` if
    * clicked.
    */
  var accessoryClicked: Boolean
  /**
    * The bind ID of the control that generated this event, if one exists.
    */
  var bindId: String
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String
  /**
    * Item index.
    */
  var itemIndex: Double
  /**
    * List section if the item is contained in a list section.
    */
  var section: ListSection
  /**
    * Section index.
    */
  var sectionIndex: Double
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
}

