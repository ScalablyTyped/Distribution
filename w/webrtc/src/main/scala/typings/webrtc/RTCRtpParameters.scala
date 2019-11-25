package typings.webrtc

import typings.std.RTCDegradationPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpparameters
trait RTCRtpParameters extends js.Object {
  //encodings: RTCRtpEncodingParameters[];
  //headerExtensions: RTCRtpHeaderExtensionParameters[];
  //rtcp: RTCRtcpParameters;
  //codecs: RTCRtpCodecParameters[];
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  var transactionId: String
}

object RTCRtpParameters {
  @scala.inline
  def apply(transactionId: String, degradationPreference: RTCDegradationPreference = null): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    if (degradationPreference != null) __obj.updateDynamic("degradationPreference")(degradationPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
}

