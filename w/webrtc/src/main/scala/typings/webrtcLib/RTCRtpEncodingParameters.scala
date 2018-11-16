package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters

trait RTCRtpEncodingParameters extends js.Object {
  //ssrc: number;
  //rtx: RTCRtpRtxParameters;
  //fec: RTCRtpFecParameters;
  var dtx: RTCDtxStatus
  //active: boolean;
  //priority: RTCPriorityType;
  //maxBitrate: number;
  var rid: java.lang.String
  var scaleResolutionDownBy: js.UndefOr[scala.Double] = js.undefined
}

