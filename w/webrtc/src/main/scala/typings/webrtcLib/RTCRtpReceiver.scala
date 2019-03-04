package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpreceiver
trait RTCRtpReceiver extends js.Object {
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def getParameters(): RTCRtpParameters
}

object RTCRtpReceiver {
  @scala.inline
  def apply(
    getContributingSources: js.Function0[js.Array[RTCRtpContributingSource]],
    getParameters: js.Function0[RTCRtpParameters]
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = getContributingSources, getParameters = getParameters)
  
    __obj.asInstanceOf[RTCRtpReceiver]
  }
}

