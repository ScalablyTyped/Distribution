package typings.webrtc

import typings.std.RTCRtpTransceiverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverinit
@js.native
trait RTCRtpTransceiverInit extends js.Object {
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.native
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.native
   // default = 'sendrecv'
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
}

object RTCRtpTransceiverInit {
  @scala.inline
  def apply(): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
  @scala.inline
  implicit class RTCRtpTransceiverInitOps[Self <: RTCRtpTransceiverInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: RTCRtpTransceiverDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setSendEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = this.set("sendEncodings", js.Array(value :_*))
    @scala.inline
    def setSendEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = this.set("sendEncodings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendEncodings: Self = this.set("sendEncodings", js.undefined)
    @scala.inline
    def setStreamsVarargs(value: MediaStream*): Self = this.set("streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: js.Array[MediaStream]): Self = this.set("streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
  
}

