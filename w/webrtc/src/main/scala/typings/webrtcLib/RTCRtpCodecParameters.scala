package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodecparameters

trait RTCRtpCodecParameters extends js.Object {
  //clockRate: number;
  var channels: js.UndefOr[scala.Double] = js.undefined
  //payloadType: number;
  var mimeType: java.lang.String
   // default = 1
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}

