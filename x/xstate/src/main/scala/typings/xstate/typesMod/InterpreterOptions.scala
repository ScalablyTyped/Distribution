package typings.xstate.typesMod

import typings.xstate.interpreterMod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpreterOptions extends StObject {
  
  var clock: js.UndefOr[Clock] = js.undefined
  
  /**
    * If `true`, defers processing of sent events until the service
    * is initialized (`.start()`). Otherwise, an error will be thrown
    * for events sent to an uninitialized service.
    *
    * Default: `true`
    */
  var deferEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, states and events will be logged to Redux DevTools.
    *
    * Default: `false`
    */
  var devTools: js.UndefOr[Boolean | js.Object] = js.undefined
  
  /**
    * Whether state actions should be executed immediately upon transition. Defaults to `true`.
    */
  var execute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The custom `id` for referencing this service.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var parent: js.UndefOr[AnyInterpreter] = js.undefined
}
object InterpreterOptions {
  
  inline def apply(): InterpreterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpreterOptions]
  }
  
  extension [Self <: InterpreterOptions](x: Self) {
    
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
    
    inline def setLogger(value: /* repeated */ Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setParent(value: AnyInterpreter): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
