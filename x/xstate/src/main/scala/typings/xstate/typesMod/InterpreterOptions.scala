package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.anon.ContextAny
import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpreterOptions
  extends StObject
     with /* option */ StringDictionary[js.Any] {
  
  var clock: Clock
  
  /**
    * If `true`, defers processing of sent events until the service
    * is initialized (`.start()`). Otherwise, an error will be thrown
    * for events sent to an uninitialized service.
    *
    * Default: `true`
    */
  var deferEvents: Boolean
  
  /**
    * If `true`, states and events will be logged to Redux DevTools.
    *
    * Default: `false`
    */
  var devTools: Boolean | js.Object
  
  /**
    * Whether state actions should be executed immediately upon transition. Defaults to `true`.
    */
  var execute: Boolean
  
  /**
    * The custom `id` for referencing this service.
    */
  var id: js.UndefOr[String] = js.undefined
  
  def logger(args: js.Any*): Unit
  
  var parent: js.UndefOr[Interpreter[js.Any, js.Any, js.Any, ContextAny]] = js.undefined
}
object InterpreterOptions {
  
  inline def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit
  ): InterpreterOptions = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    __obj.asInstanceOf[InterpreterOptions]
  }
  
  extension [Self <: InterpreterOptions](x: Self) {
    
    inline def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    inline def setDevTools(value: Boolean | js.Object): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
    
    inline def setParent(value: Interpreter[js.Any, js.Any, js.Any, ContextAny]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
