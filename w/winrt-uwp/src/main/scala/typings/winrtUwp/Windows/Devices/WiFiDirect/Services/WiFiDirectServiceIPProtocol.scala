package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceIPProtocol extends StObject
/** Values that specify the IP protocol of the new port when a WiFiDirectServiceSession.RemotePortAdded event is raised. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceIPProtocol")
@js.native
object WiFiDirectServiceIPProtocol extends StObject {
  
  /** TCP */
  @js.native
  sealed trait tcp
    extends StObject
       with WiFiDirectServiceIPProtocol
  
  /** UDP */
  @js.native
  sealed trait udp
    extends StObject
       with WiFiDirectServiceIPProtocol
}
