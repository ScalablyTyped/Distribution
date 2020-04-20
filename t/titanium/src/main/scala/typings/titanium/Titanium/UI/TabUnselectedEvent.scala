package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the tab is no longer selected.
		 */
trait TabUnselectedEvent extends TabBaseEvent {
  /**
  			 * Index of the current active tab.
  			 */
  var index: Double
  /**
  			 * Index of the previous active tab.
  			 */
  var previousIndex: Double
  /**
  			 * Previous active tab object.
  			 */
  var previousTab: Tab
  /**
  			 * Current active tab object.
  			 */
  var tab: Tab
}

object TabUnselectedEvent {
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: Tab, tab: Tab): TabUnselectedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabUnselectedEvent]
  }
}

