package typings.subscribeUiEvent.mod

import typings.subscribeUiEvent.anon.AxisIntention
import typings.subscribeUiEvent.anon.Delta
import typings.subscribeUiEvent.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: String = js.native
  var resize: Height = js.native
  var scroll: Delta = js.native
  var subType: String = js.native
  var touch: AxisIntention = js.native
  var `type`: T = js.native
}

object ArgmentedEvent {
  @scala.inline
  def apply[/* <: typings.subscribeUiEvent.mod.EventType */ T](mainType: String, resize: Height, scroll: Delta, subType: String, touch: AxisIntention, `type`: T): ArgmentedEvent[T] = {
    val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgmentedEvent[T]]
  }
  @scala.inline
  implicit class ArgmentedEventOps[Self <: ArgmentedEvent[_], /* <: typings.subscribeUiEvent.mod.EventType */ T] (val x: Self with ArgmentedEvent[T]) extends AnyVal {
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
    def setMainType(value: String): Self = this.set("mainType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: Height): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: Delta): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubType(value: String): Self = this.set("subType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch(value: AxisIntention): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

