package typings
package webrtcLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[RTCDataChannelEvent]
  }
}

