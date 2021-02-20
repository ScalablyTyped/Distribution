package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
@js.native
trait WiFiDirectConnectionRequestedEventArgs extends StObject {
  
  /**
    * Retrieves the WiFiDirectConnectionRequest received on a ConnectionRequested event by a WiFiDirectConnectionListener .
    * @return The Wi-FI Direct connection request.
    */
  def getConnectionRequest(): WiFiDirectConnectionRequest = js.native
}
object WiFiDirectConnectionRequestedEventArgs {
  
  @scala.inline
  def apply(getConnectionRequest: () => WiFiDirectConnectionRequest): WiFiDirectConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getConnectionRequest = js.Any.fromFunction0(getConnectionRequest))
    __obj.asInstanceOf[WiFiDirectConnectionRequestedEventArgs]
  }
  
  @scala.inline
  implicit class WiFiDirectConnectionRequestedEventArgsMutableBuilder[Self <: WiFiDirectConnectionRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConnectionRequest(value: () => WiFiDirectConnectionRequest): Self = StObject.set(x, "getConnectionRequest", js.Any.fromFunction0(value))
  }
}
