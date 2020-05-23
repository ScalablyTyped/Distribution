package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when this tab group loses focus. On Android, fired when a tab in this tab group
  * loses focus.
  */
trait TabGroupBlurEvent extends TabGroupBaseEvent {
  /**
    * Index of the current active tab. On iOS, a value of `undefined` indicates that the
    * **More** tab was the active tab.
    */
  var index: Double
  /**
    * Index of the previous active tab. On iOS, a value of `undefined` indicates that the
    * **More** tab was the previous tab.
    */
  var previousIndex: Double
  /**
    * Previous active tab. On iOS, a value of `undefined` indicates that the **More** tab was
    * the previous tab.
    */
  var previousTab: Tab
  /**
    * Active tab.
    */
  var tab: Tab
}

object TabGroupBlurEvent {
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: TabGroup, tab: Tab): TabGroupBlurEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupBlurEvent]
  }
}

