package typings.webrtc

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#h-rtctrackevent
@js.native
trait RTCTrackEvent extends Event {
  val receiver: RTCRtpReceiver = js.native
  val streams: js.Array[MediaStream] = js.native
  val track: MediaStreamTrack = js.native
  val transceiver: RTCRtpTransceiver = js.native
}

