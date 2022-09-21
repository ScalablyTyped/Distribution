package typings.twilio.anon

import org.scalablytyped.runtime.Instantiable1
import typings.twilio.clientCapabilityMod.EventStreamScope
import typings.twilio.clientCapabilityMod.IncomingClientScope
import typings.twilio.clientCapabilityMod.OutgoingClientScope
import typings.twilio.clientCapabilityMod.OutgoingClientScopeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofClientCapability extends StObject {
  
  var EventStreamScope: Instantiable1[/* filters */ js.Object, typings.twilio.clientCapabilityMod.EventStreamScope]
  
  var IncomingClientScope: Instantiable1[/* clientName */ String, typings.twilio.clientCapabilityMod.IncomingClientScope]
  
  var OutgoingClientScope: Instantiable1[
    /* options */ OutgoingClientScopeOptions, 
    typings.twilio.clientCapabilityMod.OutgoingClientScope
  ]
}
object TypeofClientCapability {
  
  inline def apply(
    EventStreamScope: Instantiable1[/* filters */ js.Object, EventStreamScope],
    IncomingClientScope: Instantiable1[/* clientName */ String, IncomingClientScope],
    OutgoingClientScope: Instantiable1[/* options */ OutgoingClientScopeOptions, OutgoingClientScope]
  ): TypeofClientCapability = {
    val __obj = js.Dynamic.literal(EventStreamScope = EventStreamScope.asInstanceOf[js.Any], IncomingClientScope = IncomingClientScope.asInstanceOf[js.Any], OutgoingClientScope = OutgoingClientScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofClientCapability]
  }
  
  extension [Self <: TypeofClientCapability](x: Self) {
    
    inline def setEventStreamScope(value: Instantiable1[/* filters */ js.Object, EventStreamScope]): Self = StObject.set(x, "EventStreamScope", value.asInstanceOf[js.Any])
    
    inline def setIncomingClientScope(value: Instantiable1[/* clientName */ String, IncomingClientScope]): Self = StObject.set(x, "IncomingClientScope", value.asInstanceOf[js.Any])
    
    inline def setOutgoingClientScope(value: Instantiable1[/* options */ OutgoingClientScopeOptions, OutgoingClientScope]): Self = StObject.set(x, "OutgoingClientScope", value.asInstanceOf[js.Any])
  }
}
