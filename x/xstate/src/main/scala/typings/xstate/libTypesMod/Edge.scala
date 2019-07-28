package typings.xstate.libTypesMod

import typings.xstate.Anon_TypeTEventType
import typings.xstate.libStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]]
  var cond: js.UndefOr[Condition[TContext, TEvent with Anon_TypeTEventType[TEventType]]] = js.undefined
  var event: TEventType
  var meta: js.UndefOr[MetaObject] = js.undefined
  var source: StateNode[TContext, _, TEvent]
  var target: StateNode[TContext, _, TEvent]
  var transition: TransitionDefinition[TContext, OmniEventObject[TEvent]]
}

object Edge {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any */](
    actions: js.Array[Action[TContext, TEvent]],
    event: TEventType,
    source: StateNode[TContext, _, TEvent],
    target: StateNode[TContext, _, TEvent],
    transition: TransitionDefinition[TContext, OmniEventObject[TEvent]],
    cond: Condition[TContext, TEvent with Anon_TypeTEventType[TEventType]] = null,
    meta: MetaObject = null
  ): Edge[TContext, TEvent, TEventType] = {
    val __obj = js.Dynamic.literal(actions = actions, event = event.asInstanceOf[js.Any], source = source, target = target, transition = transition)
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[Edge[TContext, TEvent, TEventType]]
  }
}

