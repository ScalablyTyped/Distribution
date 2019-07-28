package typings.xstate.esTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: ActionFunctionMap[TContext, TEvent] = js.native
  var activities: Record[String, ActivityConfig[TContext, TEvent]] = js.native
  var delays: Record[String, DelayConfig[TContext, TEvent]] = js.native
  var guards: Record[String, ConditionPredicate[TContext, TEvent]] = js.native
  var services: Record[String, ServiceConfig[TContext]] = js.native
  @JSName("updater")
  var updater_Original: Updater[TContext, TEvent, AnyAssignAction[TContext, TEvent]] = js.native
  def updater(
    context: TContext,
    event: OmniEventObject[TEvent],
    assignActions: js.Array[AnyAssignAction[TContext, TEvent]]
  ): TContext = js.native
}

