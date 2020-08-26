package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the list view displays the reference item.
  */
@js.native
trait ListViewMarkerEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  /**
    * section item index of the reference item.
    */
  var itemIndex: Double = js.native
  /**
    * section index of the reference item.
    */
  var sectionIndex: Double = js.native
}

object ListViewMarkerEvent {
  @scala.inline
  def apply(bubbles: Boolean, itemIndex: Double, sectionIndex: Double, source: ListView): ListViewMarkerEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMarkerEvent]
  }
  @scala.inline
  implicit class ListViewMarkerEventOps[Self <: ListViewMarkerEvent] (val x: Self) extends AnyVal {
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
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
  }
  
}

