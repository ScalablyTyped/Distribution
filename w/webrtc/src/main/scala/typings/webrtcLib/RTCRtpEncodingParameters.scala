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
  var dtx: js.UndefOr[stdLib.RTCDtxStatus] = js.undefined
  //active: boolean;
  //priority: RTCPriorityType;
  //maxBitrate: number;
  var rid: java.lang.String
  var scaleResolutionDownBy: js.UndefOr[scala.Double] = js.undefined
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(
    rid: java.lang.String,
    dtx: stdLib.RTCDtxStatus = null,
    scaleResolutionDownBy: scala.Int | scala.Double = null
  ): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal(rid = rid)
    if (dtx != null) __obj.updateDynamic("dtx")(dtx)
    if (scaleResolutionDownBy != null) __obj.updateDynamic("scaleResolutionDownBy")(scaleResolutionDownBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
}

