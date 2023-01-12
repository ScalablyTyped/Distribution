package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
trait RemoteSystemStatusTypeFilter
  extends StObject
     with IRemoteSystemFilter {
  
  /** The status type that the containing RemoteSystemStatusTypeFilter object targets. */
  var remoteSystemStatusType: RemoteSystemStatusType
}
object RemoteSystemStatusTypeFilter {
  
  inline def apply(remoteSystemStatusType: RemoteSystemStatusType): RemoteSystemStatusTypeFilter = {
    val __obj = js.Dynamic.literal(remoteSystemStatusType = remoteSystemStatusType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemStatusTypeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteSystemStatusTypeFilter] (val x: Self) extends AnyVal {
    
    inline def setRemoteSystemStatusType(value: RemoteSystemStatusType): Self = StObject.set(x, "remoteSystemStatusType", value.asInstanceOf[js.Any])
  }
}
