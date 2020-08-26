package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1`[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends js.Object {
  var `type`: TEventType = js.native
}

object `1` {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] * / js.Any */ TEventType, /* <: typings.xstate.typesMod.EventObject */ TEvent](`type`: TEventType): `1`[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[TEventType, TEvent]]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_, _], /* <: / * import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] * / js.Any */ TEventType, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (`1`[TEventType, TEvent])) extends AnyVal {
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
    def setType(value: TEventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

