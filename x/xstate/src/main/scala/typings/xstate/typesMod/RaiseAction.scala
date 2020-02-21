package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Raise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaiseAction[TEvent /* <: EventObject */] extends js.Object {
  var event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
  var `type`: Raise
}

object RaiseAction {
  @scala.inline
  def apply[TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    `type`: Raise
  ): RaiseAction[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseAction[TEvent]]
  }
}

