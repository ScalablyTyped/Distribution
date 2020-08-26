package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventEmitter extends js.Object {
  var events: IEventManager = js.native
}

object IEventEmitter {
  @scala.inline
  def apply(events: IEventManager): IEventEmitter = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventEmitter]
  }
  @scala.inline
  implicit class IEventEmitterOps[Self <: IEventEmitter] (val x: Self) extends AnyVal {
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
    def setEvents(value: IEventManager): Self = this.set("events", value.asInstanceOf[js.Any])
  }
  
}

