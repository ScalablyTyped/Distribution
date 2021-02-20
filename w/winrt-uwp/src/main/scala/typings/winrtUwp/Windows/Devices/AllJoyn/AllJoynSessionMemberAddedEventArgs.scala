package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a peer that was added to a session. */
@js.native
trait AllJoynSessionMemberAddedEventArgs extends StObject {
  
  /** The unique bus name of the remote app new to the session. */
  var uniqueName: String = js.native
}
object AllJoynSessionMemberAddedEventArgs {
  
  @scala.inline
  def apply(uniqueName: String): AllJoynSessionMemberAddedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionMemberAddedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynSessionMemberAddedEventArgsMutableBuilder[Self <: AllJoynSessionMemberAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
