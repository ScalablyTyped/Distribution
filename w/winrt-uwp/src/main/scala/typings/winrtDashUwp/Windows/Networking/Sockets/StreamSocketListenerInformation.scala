package typings.winrtDashUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamSocketListener object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketListenerInformation")
@js.native
abstract class StreamSocketListenerInformation () extends js.Object {
  /** Get the local TCP port number associated with a StreamSocketListener object. */
  var localPort: String = js.native
}

