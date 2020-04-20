package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when this tab group gains focus. On Android, fired when a tab in this tab group
		 * gains focus.
		 */
trait TabGroupFocusEvent extends TabGroupBaseEvent {
  /**
  			 * Index of the current active tab.
  			 */
  var index: Double
  /**
  			 * Index of the previous active tab.
  			 */
  var previousIndex: Double
  /**
  			 * Previous active tab.
  			 */
  var previousTab: Tab
  /**
  			 * Active tab.
  			 */
  var tab: Tab
}

object TabGroupFocusEvent {
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: TabGroup, tab: Tab): TabGroupFocusEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupFocusEvent]
  }
}

