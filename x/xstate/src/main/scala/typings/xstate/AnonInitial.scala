package typings.xstate

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StatesConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitial[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  var states: StatesConfig[_, TStateSchema, TEvent]
}

object AnonInitial {
  @scala.inline
  def apply[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[_, TStateSchema, TEvent]
  ): AnonInitial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitial[TStateSchema, TEvent]]
  }
}

