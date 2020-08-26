package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when this tab group loses focus. On Android, fired when a tab in this tab group
  * loses focus.
  */
@js.native
trait TabGroupBlurEvent extends TabGroupBaseEvent {
  /**
    * Index of the current active tab. On iOS, a value of `undefined` indicates that the
    * **More** tab was the active tab.
    */
  var index: Double = js.native
  /**
    * Index of the previous active tab. On iOS, a value of `undefined` indicates that the
    * **More** tab was the previous tab.
    */
  var previousIndex: Double = js.native
  /**
    * Previous active tab. On iOS, a value of `undefined` indicates that the **More** tab was
    * the previous tab.
    */
  var previousTab: Tab = js.native
  /**
    * Active tab.
    */
  var tab: Tab = js.native
}

object TabGroupBlurEvent {
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: TabGroup, tab: Tab): TabGroupBlurEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupBlurEvent]
  }
  @scala.inline
  implicit class TabGroupBlurEventOps[Self <: TabGroupBlurEvent] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousIndex(value: Double): Self = this.set("previousIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousTab(value: Tab): Self = this.set("previousTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: Tab): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

