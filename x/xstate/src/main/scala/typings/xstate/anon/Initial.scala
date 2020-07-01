package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StatesConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initial[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  var states: StatesConfig[_, TStateSchema, TEvent]
}

object Initial {
  @scala.inline
  def apply[/* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[_, TStateSchema, TEvent]
  ): Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[TStateSchema, TEvent]]
  }
}

