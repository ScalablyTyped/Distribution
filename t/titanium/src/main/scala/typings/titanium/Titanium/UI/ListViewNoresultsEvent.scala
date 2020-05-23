package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the search using either [searchView](Titanium.UI.ListView.searchView) or [searchText](Titanium.UI.ListView.searchText) has no results.
  */
trait ListViewNoresultsEvent extends ListViewBaseEvent {
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean
}

object ListViewNoresultsEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewNoresultsEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewNoresultsEvent]
  }
}

