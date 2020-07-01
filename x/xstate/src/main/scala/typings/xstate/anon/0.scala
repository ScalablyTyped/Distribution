package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends js.Object {
  var `type`: TEventType
}

object `0` {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] * / js.Any */ TEventType, /* <: typings.xstate.typesMod.EventObject */ TEvent](`type`: TEventType): `0`[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TEventType, TEvent]]
  }
}

