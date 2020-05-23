package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user drags the list view past the top edge of the [pullView](Titanium.UI.ListView.pullView).
  */
trait ListViewPullEvent extends ListViewBaseEvent {
  /**
    * Determines if the `pullView` is completely visible (true) or partially hidden (false).
    */
  var active: Boolean
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean
}

object ListViewPullEvent {
  @scala.inline
  def apply(active: Boolean, bubbles: Boolean, source: ListView): ListViewPullEvent = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPullEvent]
  }
}

