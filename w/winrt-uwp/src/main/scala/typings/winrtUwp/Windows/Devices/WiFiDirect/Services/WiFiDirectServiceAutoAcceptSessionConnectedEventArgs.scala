package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned when a WiFiDirectServiceAdvertiser.AutoAcceptSessionConnected event is raised. */
trait WiFiDirectServiceAutoAcceptSessionConnectedEventArgs extends StObject {
  
  /** Gets the WiFiDirectServiceSession that was created when the connection was automatically accepted. */
  var session: WiFiDirectServiceSession
  
  /** Gets the session information buffer that corresponds to this automatically accepted connection. */
  var sessionInfo: IBuffer
}
object WiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
  
  inline def apply(session: WiFiDirectServiceSession, sessionInfo: IBuffer): WiFiDirectServiceAutoAcceptSessionConnectedEventArgs = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiFiDirectServiceAutoAcceptSessionConnectedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSession(value: WiFiDirectServiceSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionInfo(value: IBuffer): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
  }
}
