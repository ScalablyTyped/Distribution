package typings
package typescriptDashEventDashHandlerLib.distEventDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-event-handler/dist/event-handler", "EventHandler")
@js.native
class EventHandler[TInput] () extends js.Object {
  val handlers: js.Any = js.native
  def handleAsync(value: TInput): stdLib.Promise[scala.Unit] = js.native
  def register(
    pred: typescriptDashEventDashHandlerLib.distFuncMod.Predicate[TInput],
    handler: typescriptDashEventDashHandlerLib.distFuncMod.Action[TInput]
  ): scala.Unit = js.native
  def registerAsync(
    pred: typescriptDashEventDashHandlerLib.distFuncMod.AsyncPredicate[TInput],
    handler: typescriptDashEventDashHandlerLib.distFuncMod.AsyncAction[TInput]
  ): scala.Unit = js.native
}

