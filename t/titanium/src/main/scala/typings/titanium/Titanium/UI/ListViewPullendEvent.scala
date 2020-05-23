package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user stops dragging the list view and the [pullView](Titanium.UI.ListView.pullView) is completely visible.
  */
trait ListViewPullendEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean
}

object ListViewPullendEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewPullendEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPullendEvent]
  }
}

