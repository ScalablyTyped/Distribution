package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: String
  
  var delays: String
  
  var guards: String
  
  var services: String
}
object Actions {
  
  inline def apply(actions: String, delays: String, guards: String, services: String): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], delays = delays.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: String): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setDelays(value: String): Self = StObject.set(x, "delays", value.asInstanceOf[js.Any])
    
    inline def setGuards(value: String): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    inline def setServices(value: String): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
