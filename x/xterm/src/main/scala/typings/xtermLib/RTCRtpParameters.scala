package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpParameters extends js.Object {
  var codecs: js.Array[RTCRtpCodecParameters]
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters]
  var rtcp: RTCRtcpParameters
}

object RTCRtpParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codecs")(codecs)
    __obj.updateDynamic("headerExtensions")(headerExtensions)
    __obj.updateDynamic("rtcp")(rtcp)
    __obj.asInstanceOf[RTCRtpParameters]
  }
}

