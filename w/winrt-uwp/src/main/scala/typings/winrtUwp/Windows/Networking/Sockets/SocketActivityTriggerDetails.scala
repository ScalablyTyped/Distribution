package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
trait SocketActivityTriggerDetails extends StObject {
  
  /** Get the reason the SocketActivityTrigger occurred. */
  var reason: SocketActivityTriggerReason
  
  /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
  var socketInformation: SocketActivityInformation
}
object SocketActivityTriggerDetails {
  
  inline def apply(reason: SocketActivityTriggerReason, socketInformation: SocketActivityInformation): SocketActivityTriggerDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], socketInformation = socketInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityTriggerDetails]
  }
  
  extension [Self <: SocketActivityTriggerDetails](x: Self) {
    
    inline def setReason(value: SocketActivityTriggerReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSocketInformation(value: SocketActivityInformation): Self = StObject.set(x, "socketInformation", value.asInstanceOf[js.Any])
  }
}
