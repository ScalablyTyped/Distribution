package typings.webBluetooth

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicEventHandlers extends js.Object {
  def oncharacteristicvaluechanged(ev: Event_): js.Any
}

object CharacteristicEventHandlers {
  @scala.inline
  def apply(oncharacteristicvaluechanged: Event_ => js.Any): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal(oncharacteristicvaluechanged = js.Any.fromFunction1(oncharacteristicvaluechanged))
  
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
}

