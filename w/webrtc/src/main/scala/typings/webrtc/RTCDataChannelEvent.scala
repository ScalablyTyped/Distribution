package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#h-rtcdatachannelevent
trait RTCDataChannelEvent extends js.Object {
  val channel: RTCDataChannel
}

object RTCDataChannelEvent {
  @scala.inline
  def apply(channel: RTCDataChannel): RTCDataChannelEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCDataChannelEvent]
  }
}

