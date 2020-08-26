package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user starts dragging the list view.
  */
@js.native
trait ListViewDragstartEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
}

object ListViewDragstartEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewDragstartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewDragstartEvent]
  }
  @scala.inline
  implicit class ListViewDragstartEventOps[Self <: ListViewDragstartEvent] (val x: Self) extends AnyVal {
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
  }
  
}

