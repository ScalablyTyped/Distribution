package typings.xstate

import typings.xstate.typesMod.ActionTypes.NullEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent[TEvent /* <: EventObject */] extends js.Object {
  var event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
}

object AnonEvent {
  @scala.inline
  def apply[TEvent /* <: EventObject */](
    event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
  ): AnonEvent[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent[TEvent]]
  }
}

