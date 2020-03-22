package typings.webrtcAdapter.mod

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeShim extends js.Object {
  def shimPeerConnection(window: Window_): Unit
  def shimReplaceTrack(window: Window_): Unit
}

object IEdgeShim {
  @scala.inline
  def apply(shimPeerConnection: Window_ => Unit, shimReplaceTrack: Window_ => Unit): IEdgeShim = {
    val __obj = js.Dynamic.literal(shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimReplaceTrack = js.Any.fromFunction1(shimReplaceTrack))
  
    __obj.asInstanceOf[IEdgeShim]
  }
}

