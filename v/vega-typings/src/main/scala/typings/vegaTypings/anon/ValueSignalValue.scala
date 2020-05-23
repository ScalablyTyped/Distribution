package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod._Update
import typings.vegaTypings.signalMod.SignalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSignalValue extends _Update {
  var value: SignalValue
}

object ValueSignalValue {
  @scala.inline
  def apply(value: SignalValue): ValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSignalValue]
  }
}

