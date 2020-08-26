package typings.xstate.typesMod

import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  @JSName("actions")
  var actions_TransitionDefinition: js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSName("cond")
  var cond_TransitionDefinition: js.UndefOr[Guard[TContext, TEvent]] = js.native
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk = js.native
  var source: StateNode[TContext, _, TEvent, _] = js.native
  @JSName("target")
  var target_TransitionDefinition: js.UndefOr[js.Array[StateNode[TContext, _, TEvent, _]]] = js.native
  def toJSON(): typings.xstate.anon.Actions[TContext, TEvent] = js.native
}

object TransitionDefinition {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, _, TEvent, _],
    toJSON: () => typings.xstate.anon.Actions[TContext, TEvent]
  ): TransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TransitionDefinition[TContext, TEvent]]
  }
  @scala.inline
  implicit class TransitionDefinitionOps[Self <: TransitionDefinition[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (TransitionDefinition[TContext, TEvent])) extends AnyVal {
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
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk
    ): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: StateNode[TContext, _, TEvent, _]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => typings.xstate.anon.Actions[TContext, TEvent]): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setCond(value: Guard[TContext, TEvent]): Self = this.set("cond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCond: Self = this.set("cond", js.undefined)
    @scala.inline
    def setTargetVarargs(value: (StateNode[TContext, js.Any, TEvent, js.Any])*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

