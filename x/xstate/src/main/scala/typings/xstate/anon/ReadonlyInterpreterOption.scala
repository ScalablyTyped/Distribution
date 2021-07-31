package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<xstate.xstate/lib/types.InterpreterOptions> */
trait ReadonlyInterpreterOption extends StObject {
  
  val clock: Clock
  
  val deferEvents: Boolean
  
  val devTools: Boolean | js.Object
  
  val execute: Boolean
  
  val id: js.UndefOr[String] = js.undefined
  
  def logger(args: js.Any*): Unit
  
  val parent: js.UndefOr[Interpreter[js.Any, js.Any, js.Any, ContextAny]] = js.undefined
}
object ReadonlyInterpreterOption {
  
  @scala.inline
  def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit
  ): ReadonlyInterpreterOption = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    __obj.asInstanceOf[ReadonlyInterpreterOption]
  }
  
  @scala.inline
  implicit class ReadonlyInterpreterOptionMutableBuilder[Self <: ReadonlyInterpreterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevTools(value: Boolean | js.Object): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: Interpreter[js.Any, js.Any, js.Any, ContextAny]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
