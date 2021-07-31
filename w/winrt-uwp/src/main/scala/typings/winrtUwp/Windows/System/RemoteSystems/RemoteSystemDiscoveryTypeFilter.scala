package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
trait RemoteSystemDiscoveryTypeFilter
  extends StObject
     with IRemoteSystemFilter {
  
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  var remoteSystemKinds: IVectorView[String]
}
object RemoteSystemDiscoveryTypeFilter {
  
  @scala.inline
  def apply(remoteSystemKinds: IVectorView[String]): RemoteSystemDiscoveryTypeFilter = {
    val __obj = js.Dynamic.literal(remoteSystemKinds = remoteSystemKinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemDiscoveryTypeFilter]
  }
  
  @scala.inline
  implicit class RemoteSystemDiscoveryTypeFilterMutableBuilder[Self <: RemoteSystemDiscoveryTypeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteSystemKinds(value: IVectorView[String]): Self = StObject.set(x, "remoteSystemKinds", value.asInstanceOf[js.Any])
  }
}
