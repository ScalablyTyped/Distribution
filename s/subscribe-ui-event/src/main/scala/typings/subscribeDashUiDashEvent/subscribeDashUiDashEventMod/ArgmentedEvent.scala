package typings.subscribeDashUiDashEvent.subscribeDashUiDashEventMod

import typings.subscribeDashUiDashEvent.Anon_
import typings.subscribeDashUiDashEvent.Anon_Delta
import typings.subscribeDashUiDashEvent.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: String
  var resize: Anon_Height
  var scroll: Anon_Delta
  var subType: String
  var touch: Anon_
  var `type`: T
}

object ArgmentedEvent {
  @scala.inline
  def apply[T /* <: EventType */](
    mainType: String,
    resize: Anon_Height,
    scroll: Anon_Delta,
    subType: String,
    touch: Anon_,
    `type`: T
  ): ArgmentedEvent[T] = {
    val __obj = js.Dynamic.literal(mainType = mainType, resize = resize, scroll = scroll, subType = subType, touch = touch)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgmentedEvent[T]]
  }
}

