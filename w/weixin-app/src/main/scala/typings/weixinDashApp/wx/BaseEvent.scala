package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[T /* <: String */, Detail] extends js.Object {
  var currentTarget: EventTarget
  var detail: Detail
  var target: EventTarget
  var timeStamp: Double
  var `type`: T
}

object BaseEvent {
  @scala.inline
  def apply[T /* <: String */, Detail](currentTarget: EventTarget, detail: Detail, target: EventTarget, timeStamp: Double, `type`: T): BaseEvent[T, Detail] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[T, Detail]]
  }
}

