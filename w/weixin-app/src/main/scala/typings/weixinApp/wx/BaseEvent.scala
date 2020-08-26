package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEvent[T /* <: String */, Detail] extends js.Object {
  var currentTarget: EventTarget = js.native
  var detail: Detail = js.native
  var target: EventTarget = js.native
  var timeStamp: Double = js.native
  var `type`: T = js.native
}

object BaseEvent {
  @scala.inline
  def apply[/* <: java.lang.String */ T, Detail](currentTarget: EventTarget, detail: Detail, target: EventTarget, timeStamp: Double, `type`: T): BaseEvent[T, Detail] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[T, Detail]]
  }
  @scala.inline
  implicit class BaseEventOps[Self <: BaseEvent[_, _], /* <: java.lang.String */ T, Detail] (val x: Self with (BaseEvent[T, Detail])) extends AnyVal {
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
    def setCurrentTarget(value: EventTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: Detail): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

