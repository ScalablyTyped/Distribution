package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEvent[T /* <: TouchEventType */] extends BaseEvent[T, Anon_X] {
  var changedTouches: js.Array[Touch]
  var touches: js.Array[Touch]
}

object TouchEvent {
  @scala.inline
  def apply[T /* <: TouchEventType */](
    changedTouches: js.Array[Touch],
    currentTarget: EventTarget,
    detail: Anon_X,
    target: EventTarget,
    timeStamp: Double,
    touches: js.Array[Touch],
    `type`: T
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, currentTarget = currentTarget, detail = detail, target = target, timeStamp = timeStamp, touches = touches)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent[T]]
  }
}

