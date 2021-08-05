package typings.winrtUwp.Windows.Networking.Proximity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties that are passed to an application with the ConnectionRequested event. */
trait ConnectionRequestedEventArgs extends StObject {
  
  /** Gets the information for a peer that's requesting a connection. */
  var peerInformation: PeerInformation
}
object ConnectionRequestedEventArgs {
  
  inline def apply(peerInformation: PeerInformation): ConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRequestedEventArgs]
  }
  
  extension [Self <: ConnectionRequestedEventArgs](x: Self) {
    
    inline def setPeerInformation(value: PeerInformation): Self = StObject.set(x, "peerInformation", value.asInstanceOf[js.Any])
  }
}
