package typings.typescriptDashEventDashHandler.distEventDashHandlerMod

import typings.typescriptDashEventDashHandler.distFuncMod.Action
import typings.typescriptDashEventDashHandler.distFuncMod.AsyncAction
import typings.typescriptDashEventDashHandler.distFuncMod.AsyncPredicate
import typings.typescriptDashEventDashHandler.distFuncMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-event-handler/dist/event-handler", "EventHandler")
@js.native
class EventHandler[TInput] () extends js.Object {
  val handlers: js.Any = js.native
  def handleAsync(value: TInput): js.Promise[Unit] = js.native
  def register(pred: Predicate[TInput], handler: Action[TInput]): Unit = js.native
  def registerAsync(pred: AsyncPredicate[TInput], handler: AsyncAction[TInput]): Unit = js.native
}

