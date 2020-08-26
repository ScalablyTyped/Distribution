package typings.xstate.anon

import typings.xstate.typesMod.ActionTypes.NullEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3`[TEvent /* <: EventObject */] extends js.Object {
  var event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk = js.native
}

object `3` {
  @scala.inline
  def apply[/* <: typings.xstate.typesMod.EventObject */ TEvent](
    event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
  ): `3`[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[TEvent]]
  }
  @scala.inline
  implicit class `3Ops`[Self <: `3`[_], /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with `3`[TEvent]) extends AnyVal {
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
    def setEvent(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
    ): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

