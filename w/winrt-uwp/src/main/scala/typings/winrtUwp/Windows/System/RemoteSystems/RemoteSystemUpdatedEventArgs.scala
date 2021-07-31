package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets information about a RemoteSystemUpdated event, namely the RemoteSystem that was updated. */
trait RemoteSystemUpdatedEventArgs extends StObject {
  
  /** The RemoteSystem object representing the device in the set of discoverable devices whose properties were updated, causing the containing RemoteSystemUpdated event to be raised. */
  var remoteSystem: RemoteSystem
}
object RemoteSystemUpdatedEventArgs {
  
  @scala.inline
  def apply(remoteSystem: RemoteSystem): RemoteSystemUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class RemoteSystemUpdatedEventArgsMutableBuilder[Self <: RemoteSystemUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteSystem(value: RemoteSystem): Self = StObject.set(x, "remoteSystem", value.asInstanceOf[js.Any])
  }
}
