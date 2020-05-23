package typings.subscribeUiEvent.mod

import typings.subscribeUiEvent.anon.AxisIntention
import typings.subscribeUiEvent.anon.Delta
import typings.subscribeUiEvent.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: String
  var resize: Height
  var scroll: Delta
  var subType: String
  var touch: AxisIntention
  var `type`: T
}

object ArgmentedEvent {
  @scala.inline
  def apply[T](mainType: String, resize: Height, scroll: Delta, subType: String, touch: AxisIntention, `type`: T): ArgmentedEvent[T] = {
    val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgmentedEvent[T]]
  }
}

