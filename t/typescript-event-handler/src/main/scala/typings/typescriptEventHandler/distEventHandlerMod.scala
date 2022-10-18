package typings.typescriptEventHandler

import typings.typescriptEventHandler.distFuncMod.Action
import typings.typescriptEventHandler.distFuncMod.AsyncAction
import typings.typescriptEventHandler.distFuncMod.AsyncPredicate
import typings.typescriptEventHandler.distFuncMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventHandlerMod {
  
  @JSImport("typescript-event-handler/dist/event-handler", "EventHandler")
  @js.native
  open class EventHandler[TInput] () extends StObject {
    
    def handleAsync(value: TInput): js.Promise[Unit] = js.native
    
    /* private */ val handlers: Any = js.native
    
    def register(pred: Predicate[TInput], handler: Action[TInput]): Unit = js.native
    
    def registerAsync(pred: AsyncPredicate[TInput], handler: AsyncAction[TInput]): Unit = js.native
  }
}
