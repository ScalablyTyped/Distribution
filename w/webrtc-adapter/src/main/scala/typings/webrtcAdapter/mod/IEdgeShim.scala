package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeShim extends js.Object {
  def shimPeerConnection(window: Window): Unit
  def shimReplaceTrack(window: Window): Unit
}

object IEdgeShim {
  @scala.inline
  def apply(shimPeerConnection: Window => Unit, shimReplaceTrack: Window => Unit): IEdgeShim = {
    val __obj = js.Dynamic.literal(shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimReplaceTrack = js.Any.fromFunction1(shimReplaceTrack))
    __obj.asInstanceOf[IEdgeShim]
  }
}

