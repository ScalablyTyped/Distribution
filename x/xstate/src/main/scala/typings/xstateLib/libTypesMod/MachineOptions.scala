package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: ActionFunctionMap[TContext, TEvent] = js.native
  var activities: stdLib.Record[java.lang.String, ActivityConfig[TContext, TEvent]] = js.native
  var delays: stdLib.Record[java.lang.String, DelayConfig[TContext, TEvent]] = js.native
  var guards: stdLib.Record[java.lang.String, ConditionPredicate[TContext, TEvent]] = js.native
  var services: stdLib.Record[java.lang.String, ServiceConfig[TContext]] = js.native
  @JSName("updater")
  var updater_Original: Updater[TContext, TEvent, AnyAssignAction[TContext, TEvent]] = js.native
  def updater(
    context: TContext,
    event: OmniEventObject[TEvent],
    assignActions: js.Array[AnyAssignAction[TContext, TEvent]]
  ): TContext = js.native
}

