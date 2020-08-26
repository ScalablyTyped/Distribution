package typings.webrtc

import typings.std.RTCDegradationPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpparameters
@js.native
trait RTCRtpParameters extends js.Object {
  //encodings: RTCRtpEncodingParameters[];
  //headerExtensions: RTCRtpHeaderExtensionParameters[];
  //rtcp: RTCRtcpParameters;
  //codecs: RTCRtpCodecParameters[];
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.native
  var transactionId: String = js.native
}

object RTCRtpParameters {
  @scala.inline
  def apply(transactionId: String): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  @scala.inline
  implicit class RTCRtpParametersOps[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
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
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDegradationPreference(value: RTCDegradationPreference): Self = this.set("degradationPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegradationPreference: Self = this.set("degradationPreference", js.undefined)
  }
  
}

