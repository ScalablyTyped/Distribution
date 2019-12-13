package typings.xstate

import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.StatesConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initial[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  var states: StatesConfig[_, TStateSchema, TEvent]
}

object Anon_Initial {
  @scala.inline
  def apply[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[_, TStateSchema, TEvent]
  ): Anon_Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Initial[TStateSchema, TEvent]]
  }
}

