package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a list row is deleted by the user.
  */
@js.native
trait ListViewDeleteEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String = js.native
  /**
    * Item index.
    */
  var itemIndex: Double = js.native
  /**
    * List section from which the item is deleted.
    */
  var section: ListSection = js.native
  /**
    * Section index.
    */
  var sectionIndex: Double = js.native
}

object ListViewDeleteEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView
  ): ListViewDeleteEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewDeleteEvent]
  }
  @scala.inline
  implicit class ListViewDeleteEventOps[Self <: ListViewDeleteEvent] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
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

