package typings.xstate

import typings.xstate.libTypesMod.ActionTypes.NullEvent
import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_[TEvent /* <: EventObject */] extends js.Object {
  var event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
}

object Anon_ {
  @scala.inline
  def apply[TEvent /* <: EventObject */](
    event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
  ): Anon_[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_[TEvent]]
  }
}

