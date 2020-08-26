package typings.xstate.typesMod

import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.atomic
import typings.xstate.xstateStrings.compound
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.history
import typings.xstate.xstateStrings.parallel
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateNodeDefinition[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  var activities: js.Array[ActivityDefinition[TContext, TEvent]] = js.native
  var context: TContext = js.native
  var data: js.UndefOr[(Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])] = js.native
  var entry: js.Array[ActionObject[TContext, TEvent]] = js.native
  var exit: js.Array[ActionObject[TContext, TEvent]] = js.native
  var history: js.UndefOr[Boolean | shallow | deep] = js.native
  var id: String = js.native
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.native
  var invoke: js.Array[InvokeDefinition[TContext, TEvent]] = js.native
  var key: String = js.native
  var meta: js.Any = js.native
  var on: TransitionDefinitionMap[TContext, TEvent] = js.native
  var order: Double = js.native
  var states: StatesDefinition[TContext, TStateSchema, TEvent] = js.native
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
  var `type`: atomic | compound | parallel | `final` | history = js.native
  var version: js.UndefOr[String] = js.native
}

object StateNodeDefinition {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    activities: js.Array[ActivityDefinition[TContext, TEvent]],
    context: TContext,
    entry: js.Array[ActionObject[TContext, TEvent]],
    exit: js.Array[ActionObject[TContext, TEvent]],
    id: String,
    invoke: js.Array[InvokeDefinition[TContext, TEvent]],
    key: String,
    meta: js.Any,
    on: TransitionDefinitionMap[TContext, TEvent],
    order: Double,
    states: StatesDefinition[TContext, TStateSchema, TEvent],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    `type`: atomic | compound | parallel | `final` | history
  ): StateNodeDefinition[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeDefinition[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class StateNodeDefinitionOps[Self <: StateNodeDefinition[_, _, _], TContext, /* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (StateNodeDefinition[TContext, TStateSchema, TEvent])) extends AnyVal {
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
    def setActivitiesVarargs(value: (ActivityDefinition[TContext, TEvent])*): Self = this.set("activities", js.Array(value :_*))
    @scala.inline
    def setActivities(value: js.Array[ActivityDefinition[TContext, TEvent]]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryVarargs(value: (ActionObject[TContext, TEvent])*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitVarargs(value: (ActionObject[TContext, TEvent])*): Self = this.set("exit", js.Array(value :_*))
    @scala.inline
    def setExit(value: js.Array[ActionObject[TContext, TEvent]]): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeVarargs(value: (InvokeDefinition[TContext, TEvent])*): Self = this.set("invoke", js.Array(value :_*))
    @scala.inline
    def setInvoke(value: js.Array[InvokeDefinition[TContext, TEvent]]): Self = this.set("invoke", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: TransitionDefinitionMap[TContext, TEvent]): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setStates(value: StatesDefinition[TContext, TStateSchema, TEvent]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = this.set("transitions", js.Array(value :_*))
    @scala.inline
    def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: atomic | compound | parallel | `final` | history): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => _): Self = this.set("data", js.Any.fromFunction2(value))
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHistory(value: Boolean | shallow | deep): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

