package typings.xstate.typesMod

import typings.xstate.anon.`1`
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]] = js.native
  var cond: js.UndefOr[Condition[TContext, TEvent with (`1`[TEventType, TEvent])]] = js.native
  var event: TEventType = js.native
  var meta: js.UndefOr[MetaObject] = js.native
  var source: StateNode[TContext, _, TEvent, _] = js.native
  var target: StateNode[TContext, _, TEvent, _] = js.native
  var transition: TransitionDefinition[TContext, TEvent] = js.native
}

object Edge {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent, /* <: / * import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] * / js.Any */ TEventType](
    actions: js.Array[Action[TContext, TEvent]],
    event: TEventType,
    source: StateNode[TContext, _, TEvent, _],
    target: StateNode[TContext, _, TEvent, _],
    transition: TransitionDefinition[TContext, TEvent]
  ): Edge[TContext, TEvent, TEventType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[TContext, TEvent, TEventType]]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge[_, _, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent, /* <: / * import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] * / js.Any */ TEventType] (val x: Self with (Edge[TContext, TEvent, TEventType])) extends AnyVal {
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
    def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Action[TContext, TEvent]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: TEventType): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: StateNode[TContext, _, TEvent, _]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: StateNode[TContext, _, TEvent, _]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: TransitionDefinition[TContext, TEvent]): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondFunction3(
      value: (TContext, TEvent with (`1`[TEventType, TEvent]), /* meta */ GuardMeta[TContext, TEvent with (`1`[TEventType, TEvent])]) => Boolean
    ): Self = this.set("cond", js.Any.fromFunction3(value))
    @scala.inline
    def setCond(value: Condition[TContext, TEvent with (`1`[TEventType, TEvent])]): Self = this.set("cond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCond: Self = this.set("cond", js.undefined)
    @scala.inline
    def setMeta(value: MetaObject): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
  
}

