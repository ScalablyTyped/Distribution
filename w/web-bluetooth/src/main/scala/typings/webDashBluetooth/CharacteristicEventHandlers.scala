package typings.webDashBluetooth

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicEventHandlers extends js.Object {
  def oncharacteristicvaluechanged(ev: Event): js.Any
}

object CharacteristicEventHandlers {
  @scala.inline
  def apply(oncharacteristicvaluechanged: Event => js.Any): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal(oncharacteristicvaluechanged = js.Any.fromFunction1(oncharacteristicvaluechanged))
  
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
}

