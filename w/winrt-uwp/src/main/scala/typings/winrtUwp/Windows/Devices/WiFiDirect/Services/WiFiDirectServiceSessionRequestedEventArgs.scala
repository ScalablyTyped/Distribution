package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
trait WiFiDirectServiceSessionRequestedEventArgs extends StObject {
  
  /**
    * Gets information about the session request that raised a WiFiDirectServiceAdvertiser.SessionRequested event.
    * @return Information about a new session request.
    */
  def getSessionRequest(): WiFiDirectServiceSessionRequest
}
object WiFiDirectServiceSessionRequestedEventArgs {
  
  inline def apply(getSessionRequest: () => WiFiDirectServiceSessionRequest): WiFiDirectServiceSessionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getSessionRequest = js.Any.fromFunction0(getSessionRequest))
    __obj.asInstanceOf[WiFiDirectServiceSessionRequestedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiFiDirectServiceSessionRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setGetSessionRequest(value: () => WiFiDirectServiceSessionRequest): Self = StObject.set(x, "getSessionRequest", js.Any.fromFunction0(value))
  }
}
