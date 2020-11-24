package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StatesConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initial[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = js.native
  
  var states: StatesConfig[_, TStateSchema, TEvent] = js.native
}
object Initial {
  
  @scala.inline
  def apply[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[_, TStateSchema, TEvent]
  ): Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[TStateSchema, TEvent]]
  }
  
  @scala.inline
  implicit class InitialOps[Self <: Initial[_, _], TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] (val x: Self with (Initial[TStateSchema, TEvent])) extends AnyVal {
    
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
    def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: StatesConfig[_, TStateSchema, TEvent]): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
