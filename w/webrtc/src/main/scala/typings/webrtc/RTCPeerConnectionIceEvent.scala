package typings.webrtc

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#h-rtcpeerconnectioniceevent
@js.native
trait RTCPeerConnectionIceEvent extends Event {
  val url: String | Null = js.native
}

