package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a remote app removed from a session. */
trait AllJoynSessionMemberRemovedEventArgs extends StObject {
  
  /** The unique bus name of the remote app removed from the session. */
  var uniqueName: String
}
object AllJoynSessionMemberRemovedEventArgs {
  
  inline def apply(uniqueName: String): AllJoynSessionMemberRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionMemberRemovedEventArgs]
  }
  
  extension [Self <: AllJoynSessionMemberRemovedEventArgs](x: Self) {
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
