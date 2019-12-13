package typings.xstate.libTypesMod

import typings.std.Record
import typings.xstate.libStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * @private
    */
  var _key: js.UndefOr[String] = js.undefined
  /**
    * @private
    */
  var _parent: js.UndefOr[StateNode[TContext, _, TEvent, _]] = js.undefined
  var actions: ActionFunctionMap[TContext, TEvent]
  var activities: Record[String, ActivityConfig[TContext, TEvent]]
  var delays: DelayFunctionMap[TContext, TEvent]
  var guards: Record[String, ConditionPredicate[TContext, TEvent]]
  var services: Record[String, ServiceConfig[TContext]]
}

object MachineOptions {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: ActionFunctionMap[TContext, TEvent],
    activities: Record[String, ActivityConfig[TContext, TEvent]],
    delays: DelayFunctionMap[TContext, TEvent],
    guards: Record[String, ConditionPredicate[TContext, TEvent]],
    services: Record[String, ServiceConfig[TContext]],
    _key: String = null,
    _parent: StateNode[TContext, _, TEvent, _] = null
  ): MachineOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], delays = delays.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    if (_key != null) __obj.updateDynamic("_key")(_key.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineOptions[TContext, TEvent]]
  }
}

