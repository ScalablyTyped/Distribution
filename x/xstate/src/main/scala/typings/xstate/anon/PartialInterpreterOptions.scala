package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<xstate.xstate/lib/types.InterpreterOptions> */
trait PartialInterpreterOptions extends StObject {
  
  var clock: js.UndefOr[Clock] = js.undefined
  
  var deferEvents: js.UndefOr[Boolean] = js.undefined
  
  var devTools: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var execute: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  var parent: js.UndefOr[Interpreter[js.Any, js.Any, js.Any, ContextAny]] = js.undefined
}
object PartialInterpreterOptions {
  
  inline def apply(): PartialInterpreterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterpreterOptions]
  }
  
  extension [Self <: PartialInterpreterOptions](x: Self) {
    
    inline def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    inline def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    inline def setDeferEventsUndefined: Self = StObject.set(x, "deferEvents", js.undefined)
    
    inline def setDevTools(value: Boolean | js.Object): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setParent(value: Interpreter[js.Any, js.Any, js.Any, ContextAny]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
