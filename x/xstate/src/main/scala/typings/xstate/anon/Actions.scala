package typings.xstate.anon

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.ActionTypes.NullEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Guard
import typings.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions[TContext, TEvent /* <: EventObject */] extends js.Object {
  
  var actions: js.Array[ActionObject[TContext, TEvent]] = js.native
  
  var cond: js.UndefOr[Guard[TContext, TEvent]] = js.native
  
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk = js.native
  
  var source: String = js.native
  
  var target: js.UndefOr[js.Array[String]] = js.native
}
object Actions {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk,
    source: String
  ): Actions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (Actions[TContext, TEvent])) extends AnyVal {
    
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
    def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
    ): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCond(value: Guard[TContext, TEvent]): Self = this.set("cond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCond: Self = this.set("cond", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
