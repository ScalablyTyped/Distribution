package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the cancel button is pressed.
  */
@js.native
trait SearchBarCancelEvent extends SearchBarBaseEvent {
  /**
    * Value of the search bar.
    */
  var value: String = js.native
}

object SearchBarCancelEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarCancelEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarCancelEvent]
  }
  @scala.inline
  implicit class SearchBarCancelEventOps[Self <: SearchBarCancelEvent] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

