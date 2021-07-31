package typings.typescriptEventHandler

import typings.typescriptEventHandler.funcMod.Action
import typings.typescriptEventHandler.funcMod.AsyncAction
import typings.typescriptEventHandler.funcMod.AsyncPredicate
import typings.typescriptEventHandler.funcMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventHandlerMod {
  
  @JSImport("typescript-event-handler/dist/event-handler", "EventHandler")
  @js.native
  class EventHandler[TInput] () extends StObject {
    
    def handleAsync(value: TInput): js.Promise[Unit] = js.native
    
    val handlers: js.Any = js.native
    
    def register(pred: Predicate[TInput], handler: Action[TInput]): Unit = js.native
    
    def registerAsync(pred: AsyncPredicate[TInput], handler: AsyncAction[TInput]): Unit = js.native
  }
}
