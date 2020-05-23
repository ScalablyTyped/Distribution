package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.WebSocketClosedEventArgs")
@js.native
abstract class WebSocketClosedEventArgs ()
  extends typings.winrtUwp.Windows.Networking.Sockets.WebSocketClosedEventArgs {
  /** Gets information about the reason that a WebSocket object was closed. */
  /* CompleteClass */
  override var code: Double = js.native
  /** Gets additional details about the reason that a WebSocket object was closed. */
  /* CompleteClass */
  override var reason: String = js.native
}

