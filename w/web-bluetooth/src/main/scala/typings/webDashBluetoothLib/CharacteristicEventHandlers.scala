package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicEventHandlers extends js.Object {
  def oncharacteristicvaluechanged(`this`: this.type, ev: stdLib.Event): js.Any
}

object CharacteristicEventHandlers {
  @scala.inline
  def apply(oncharacteristicvaluechanged: (CharacteristicEventHandlers, stdLib.Event) => js.Any): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal(oncharacteristicvaluechanged = js.Any.fromFunction2(oncharacteristicvaluechanged))
  
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
}

