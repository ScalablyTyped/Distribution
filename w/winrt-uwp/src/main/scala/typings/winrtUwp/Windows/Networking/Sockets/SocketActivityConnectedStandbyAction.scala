package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketActivityConnectedStandbyAction extends StObject
/** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
@js.native
object SocketActivityConnectedStandbyAction extends StObject {
  
  /** The app should not receive packets when the system goes to stand by. */
  @js.native
  sealed trait doNotWake
    extends StObject
       with SocketActivityConnectedStandbyAction
  
  /** The app can receive packets even when the system goes to stand by. */
  @js.native
  sealed trait wake
    extends StObject
       with SocketActivityConnectedStandbyAction
}
