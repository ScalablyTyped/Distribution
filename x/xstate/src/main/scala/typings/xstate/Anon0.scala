package typings.xstate

import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends js.Object {
  var `type`: TEventType
}

object Anon0 {
  @scala.inline
  def apply[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */](`type`: TEventType): Anon0[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[TEventType, TEvent]]
  }
}

