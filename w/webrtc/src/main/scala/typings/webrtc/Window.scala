package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var RTCPeerConnection: RTCPeerConnectionStatic
}

object Window {
  @scala.inline
  def apply(RTCPeerConnection: RTCPeerConnectionStatic): Window = {
    val __obj = js.Dynamic.literal(RTCPeerConnection = RTCPeerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

