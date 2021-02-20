package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an intent to communicate with a specific remote system (device). */
@js.native
trait RemoteSystemConnectionRequest extends StObject {
  
  /** Represents the remote system (device) that the app intends to communicate with. */
  var remoteSystem: RemoteSystem = js.native
  
  /** Represents the remote application that the app intends to communicate with. */
  var remoteSystemApp: RemoteSystemApp = js.native
}
object RemoteSystemConnectionRequest {
  
  @scala.inline
  def apply(remoteSystem: RemoteSystem, remoteSystemApp: RemoteSystemApp): RemoteSystemConnectionRequest = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any], remoteSystemApp = remoteSystemApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemConnectionRequest]
  }
  
  @scala.inline
  implicit class RemoteSystemConnectionRequestMutableBuilder[Self <: RemoteSystemConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteSystem(value: RemoteSystem): Self = StObject.set(x, "remoteSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteSystemApp(value: RemoteSystemApp): Self = StObject.set(x, "remoteSystemApp", value.asInstanceOf[js.Any])
  }
}
