package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a peer that was added to a session. */
trait AllJoynSessionMemberAddedEventArgs extends StObject {
  
  /** The unique bus name of the remote app new to the session. */
  var uniqueName: String
}
object AllJoynSessionMemberAddedEventArgs {
  
  inline def apply(uniqueName: String): AllJoynSessionMemberAddedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionMemberAddedEventArgs]
  }
  
  extension [Self <: AllJoynSessionMemberAddedEventArgs](x: Self) {
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
