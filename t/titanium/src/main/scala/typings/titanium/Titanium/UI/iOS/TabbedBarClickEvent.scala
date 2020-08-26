package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a button is clicked.
  */
@js.native
trait TabbedBarClickEvent extends TabbedBarBaseEvent {
  /**
    * Index of the clicked button.
    */
  var index: Double = js.native
}

object TabbedBarClickEvent {
  @scala.inline
  def apply(index: Double, source: TabbedBar): TabbedBarClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarClickEvent]
  }
  @scala.inline
  implicit class TabbedBarClickEventOps[Self <: TabbedBarClickEvent] (val x: Self) extends AnyVal {
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
  }
  
}

