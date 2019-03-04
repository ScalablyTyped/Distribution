package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpparameters
trait RTCRtpParameters extends js.Object {
  //encodings: RTCRtpEncodingParameters[];
  //headerExtensions: RTCRtpHeaderExtensionParameters[];
  //rtcp: RTCRtcpParameters;
  //codecs: RTCRtpCodecParameters[];
  var degradationPreference: js.UndefOr[stdLib.RTCDegradationPreference] = js.undefined
  var transactionId: java.lang.String
}

object RTCRtpParameters {
  @scala.inline
  def apply(transactionId: java.lang.String, degradationPreference: stdLib.RTCDegradationPreference = null): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(transactionId = transactionId)
    if (degradationPreference != null) __obj.updateDynamic("degradationPreference")(degradationPreference)
    __obj.asInstanceOf[RTCRtpParameters]
  }
}

