package typings.xstate.libTypesMod

import typings.xstate.Anon_TypeTEventType_867072877
import typings.xstate.libStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]]
  var cond: js.UndefOr[Condition[TContext, TEvent with Anon_TypeTEventType_867072877[TEventType]]] = js.undefined
  var event: TEventType
  var meta: js.UndefOr[MetaObject] = js.undefined
  var source: StateNode[TContext, _, TEvent, _]
  var target: StateNode[TContext, _, TEvent, _]
  var transition: TransitionDefinition[TContext, TEvent]
}

object Edge {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](
    actions: js.Array[Action[TContext, TEvent]],
    event: TEventType,
    source: StateNode[TContext, _, TEvent, _],
    target: StateNode[TContext, _, TEvent, _],
    transition: TransitionDefinition[TContext, TEvent],
    cond: Condition[TContext, TEvent with Anon_TypeTEventType_867072877[TEventType]] = null,
    meta: MetaObject = null
  ): Edge[TContext, TEvent, TEventType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[TContext, TEvent, TEventType]]
  }
}

