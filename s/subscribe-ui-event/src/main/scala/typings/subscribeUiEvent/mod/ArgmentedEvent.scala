package typings.subscribeUiEvent.mod

import typings.subscribeUiEvent.Anon
import typings.subscribeUiEvent.AnonDelta
import typings.subscribeUiEvent.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: String
  var resize: AnonHeight
  var scroll: AnonDelta
  var subType: String
  var touch: Anon
  var `type`: T
}

object ArgmentedEvent {
  @scala.inline
  def apply[T /* <: EventType */](mainType: String, resize: AnonHeight, scroll: AnonDelta, subType: String, touch: Anon, `type`: T): ArgmentedEvent[T] = {
    val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgmentedEvent[T]]
  }
}

