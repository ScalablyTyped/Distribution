package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * @private
    */
  var _key: js.UndefOr[String] = js.native
  /**
    * @private
    */
  var _parent: js.UndefOr[StateNode[TContext, _, TEvent, _]] = js.native
  var actions: ActionFunctionMap[TContext, TEvent] = js.native
  var activities: Record[String, ActivityConfig[TContext, TEvent]] = js.native
  var delays: DelayFunctionMap[TContext, TEvent] = js.native
  var guards: Record[String, ConditionPredicate[TContext, TEvent]] = js.native
  var services: Record[String, ServiceConfig[TContext]] = js.native
}

object MachineOptions {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    actions: ActionFunctionMap[TContext, TEvent],
    activities: Record[String, ActivityConfig[TContext, TEvent]],
    delays: DelayFunctionMap[TContext, TEvent],
    guards: Record[String, ConditionPredicate[TContext, TEvent]],
    services: Record[String, ServiceConfig[TContext]]
  ): MachineOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], delays = delays.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineOptions[TContext, TEvent]]
  }
  @scala.inline
  implicit class MachineOptionsOps[Self <: MachineOptions[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (MachineOptions[TContext, TEvent])) extends AnyVal {
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
    def setActions(value: ActionFunctionMap[TContext, TEvent]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivities(value: Record[String, ActivityConfig[TContext, TEvent]]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelays(value: DelayFunctionMap[TContext, TEvent]): Self = this.set("delays", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuards(value: Record[String, ConditionPredicate[TContext, TEvent]]): Self = this.set("guards", value.asInstanceOf[js.Any])
    @scala.inline
    def setServices(value: Record[String, ServiceConfig[TContext]]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def set_key(value: String): Self = this.set("_key", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_key: Self = this.set("_key", js.undefined)
    @scala.inline
    def set_parent(value: StateNode[TContext, _, TEvent, _]): Self = this.set("_parent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_parent: Self = this.set("_parent", js.undefined)
  }
  
}

