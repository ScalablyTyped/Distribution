package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information on the transferred socket from the Socket Broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
abstract class SocketActivityInformation ()
  extends typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation
/* static members */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
object SocketActivityInformation extends js.Object {
  
  /** Gets a list of all the sockets transferred to the socket brokering service by this app. */
  var allSockets: IMapView[String, typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation] = js.native
}
