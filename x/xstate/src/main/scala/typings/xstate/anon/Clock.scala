package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clock extends StObject {
  
  var clock: typings.xstate.libInterpreterMod.Clock
  
  var deferEvents: Boolean
  
  var devTools: Boolean
  
  var execute: Boolean
  
  var logger: Any
}
object Clock {
  
  inline def apply(
    clock: typings.xstate.libInterpreterMod.Clock,
    deferEvents: Boolean,
    devTools: Boolean,
    execute: Boolean,
    logger: Any
  ): Clock = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
  
  extension [Self <: Clock](x: Self) {
    
    inline def setClock(value: typings.xstate.libInterpreterMod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    inline def setDevTools(value: Boolean): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
