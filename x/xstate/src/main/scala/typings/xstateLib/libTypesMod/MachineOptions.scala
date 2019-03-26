package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.UndefOr[ActionFunctionMap[TContext, TEvent]] = js.undefined
  var activities: js.UndefOr[stdLib.Record[java.lang.String, ActivityConfig[TContext, TEvent]]] = js.undefined
  var guards: js.UndefOr[stdLib.Record[java.lang.String, ConditionPredicate[TContext, TEvent]]] = js.undefined
  var services: js.UndefOr[stdLib.Record[java.lang.String, ServiceConfig[TContext]]] = js.undefined
}

object MachineOptions {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: ActionFunctionMap[TContext, TEvent] = null,
    activities: stdLib.Record[java.lang.String, ActivityConfig[TContext, TEvent]] = null,
    guards: stdLib.Record[java.lang.String, ConditionPredicate[TContext, TEvent]] = null,
    services: stdLib.Record[java.lang.String, ServiceConfig[TContext]] = null
  ): MachineOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (guards != null) __obj.updateDynamic("guards")(guards)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[MachineOptions[TContext, TEvent]]
  }
}

